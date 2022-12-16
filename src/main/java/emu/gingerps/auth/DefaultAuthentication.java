package emu.gingerps.auth;

import emu.gingerps.gingerps;
import emu.gingerps.auth.DefaultAuthenticators.*;
import emu.gingerps.game.Account;
import emu.gingerps.server.http.objects.ComboTokenResJson;
import emu.gingerps.server.http.objects.LoginResultJson;

import static emu.gingerps.config.Configuration.ACCOUNT;
import static emu.gingerps.utils.Language.translate;

/**
 * The default gingerps authentication implementation.
 * Allows all users to access any account.
 */
public final class DefaultAuthentication implements AuthenticationSystem {
    private Authenticator<LoginResultJson> passwordAuthenticator;
    private Authenticator<LoginResultJson> tokenAuthenticator = new TokenAuthenticator();
    private Authenticator<ComboTokenResJson> sessionKeyAuthenticator = new SessionKeyAuthenticator();
    private ExternalAuthenticator externalAuthenticator = new ExternalAuthentication();
    private OAuthAuthenticator oAuthAuthenticator = new OAuthAuthentication();

    public DefaultAuthentication() {
        if (ACCOUNT.EXPERIMENTAL_RealPassword) {
            passwordAuthenticator = new ExperimentalPasswordAuthenticator();
        } else {
            passwordAuthenticator = new PasswordAuthenticator();
        }
    }

    @Override
    public void createAccount(String username, String password) {
        // Unhandled. The default authenticator doesn't store passwords.
    }

    @Override
    public void resetPassword(String username) {
        // Unhandled. The default authenticator doesn't store passwords.
    }

    @Override
    public Account verifyUser(String details) {
        gingerps.getLogger().info(translate("messages.dispatch.authentication.default_unable_to_verify"));
        return null;
    }

    @Override
    public Authenticator<LoginResultJson> getPasswordAuthenticator() {
        return this.passwordAuthenticator;
    }

    @Override
    public Authenticator<LoginResultJson> getTokenAuthenticator() {
        return this.tokenAuthenticator;
    }

    @Override
    public Authenticator<ComboTokenResJson> getSessionKeyAuthenticator() {
        return this.sessionKeyAuthenticator;
    }

    @Override
    public ExternalAuthenticator getExternalAuthenticator() {
        return this.externalAuthenticator;
    }

    @Override
    public OAuthAuthenticator getOAuthAuthenticator() {
        return this.oAuthAuthenticator;
    }
}
