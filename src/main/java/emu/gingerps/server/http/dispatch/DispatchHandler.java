package emu.gingerps.server.http.dispatch;

import emu.gingerps.gingerps;
import emu.gingerps.auth.AuthenticationSystem;
import emu.gingerps.auth.OAuthAuthenticator.ClientType;
import emu.gingerps.server.http.Router;
import emu.gingerps.server.http.objects.*;
import emu.gingerps.server.http.objects.ComboTokenReqJson.LoginTokenData;
import emu.gingerps.utils.JsonUtils;
import io.javalin.Javalin;
import io.javalin.http.Context;

import static emu.gingerps.utils.Language.translate;

/**
 * Handles requests related to authentication. (aka dispatch)
 */
public final class DispatchHandler implements Router {
    @Override public void applyRoutes(Javalin javalin) {
        // Username & Password login (from client).
        javalin.post("/hk4e_global/mdk/shield/api/login", DispatchHandler::clientLogin);
        // Cached token login (from registry).
        javalin.post("/hk4e_global/mdk/shield/api/verify", DispatchHandler::tokenLogin);
        // Combo token login (from session key).
        javalin.post("/hk4e_global/combo/granter/login/v2/login", DispatchHandler::sessionKeyLogin);

        // External login (from other clients).
        javalin.get("/authentication/type", ctx -> ctx.result(gingerps.getAuthenticationSystem().getClass().getSimpleName()));
        javalin.post("/authentication/login", ctx -> gingerps.getAuthenticationSystem().getExternalAuthenticator()
                .handleLogin(AuthenticationSystem.fromExternalRequest(ctx)));
        javalin.post("/authentication/register", ctx -> gingerps.getAuthenticationSystem().getExternalAuthenticator()
                .handleAccountCreation(AuthenticationSystem.fromExternalRequest(ctx)));
        javalin.post("/authentication/change_password", ctx -> gingerps.getAuthenticationSystem().getExternalAuthenticator()
                .handlePasswordReset(AuthenticationSystem.fromExternalRequest(ctx)));

        // External login (from OAuth2).
        javalin.post("/hk4e_global/mdk/shield/api/loginByThirdparty", ctx -> gingerps.getAuthenticationSystem().getOAuthAuthenticator()
                .handleLogin(AuthenticationSystem.fromExternalRequest(ctx)));
        javalin.get("/authentication/openid/redirect", ctx -> gingerps.getAuthenticationSystem().getOAuthAuthenticator()
                .handleTokenProcess(AuthenticationSystem.fromExternalRequest(ctx)));
        javalin.get("/Api/twitter_login", ctx -> gingerps.getAuthenticationSystem().getOAuthAuthenticator()
                .handleRedirection(AuthenticationSystem.fromExternalRequest(ctx), ClientType.DESKTOP));
        javalin.get("/sdkTwitterLogin.html", ctx -> gingerps.getAuthenticationSystem().getOAuthAuthenticator()
                .handleRedirection(AuthenticationSystem.fromExternalRequest(ctx), ClientType.MOBILE));
    }

    /**
     * @route /hk4e_global/mdk/shield/api/login
     */
    private static void clientLogin(Context ctx) {
        // Parse body data.
        String rawBodyData = ctx.body();
        var bodyData = JsonUtils.decode(rawBodyData, LoginAccountRequestJson.class);

        // Validate body data.
        if (bodyData == null)
            return;

        // Pass data to authentication handler.
        var responseData = gingerps.getAuthenticationSystem()
                .getPasswordAuthenticator()
                .authenticate(AuthenticationSystem.fromPasswordRequest(ctx, bodyData));
        // Send response.
        ctx.json(responseData);

        // Log to console.
        gingerps.getLogger().info(translate("messages.dispatch.account.login_attempt", ctx.ip()));
    }

    /**
     * @route /hk4e_global/mdk/shield/api/verify
     */
    private static void tokenLogin(Context ctx) {
        // Parse body data.
        String rawBodyData = ctx.body();
        var bodyData = JsonUtils.decode(rawBodyData, LoginTokenRequestJson.class);

        // Validate body data.
        if (bodyData == null)
            return;

        // Pass data to authentication handler.
        var responseData = gingerps.getAuthenticationSystem()
                .getTokenAuthenticator()
                .authenticate(AuthenticationSystem.fromTokenRequest(ctx, bodyData));
        // Send response.
        ctx.json(responseData);

        // Log to console.
        gingerps.getLogger().info(translate("messages.dispatch.account.login_attempt", ctx.ip()));
    }

    /**
     * @route /hk4e_global/combo/granter/login/v2/login
     */
    private static void sessionKeyLogin(Context ctx) {
        // Parse body data.
        String rawBodyData = ctx.body();
        var bodyData = JsonUtils.decode(rawBodyData, ComboTokenReqJson.class);

        // Validate body data.
        if (bodyData == null || bodyData.data == null)
            return;

        // Decode additional body data.
        var tokenData = JsonUtils.decode(bodyData.data, LoginTokenData.class);

        // Pass data to authentication handler.
        var responseData = gingerps.getAuthenticationSystem()
                .getSessionKeyAuthenticator()
                .authenticate(AuthenticationSystem.fromComboTokenRequest(ctx, bodyData, tokenData));
        // Send response.
        ctx.json(responseData);

        // Log to console.
        gingerps.getLogger().info(translate("messages.dispatch.account.login_attempt", ctx.ip()));
    }
}
