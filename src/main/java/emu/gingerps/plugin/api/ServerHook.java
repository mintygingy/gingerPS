package emu.gingerps.plugin.api;

import emu.gingerps.gingerps;
import emu.gingerps.auth.AuthenticationSystem;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.command.CommandMap;
import emu.gingerps.command.PermissionHandler;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.game.GameServer;
import emu.gingerps.server.http.HttpServer;
import emu.gingerps.server.http.Router;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hooks into the {@link GameServer} class, adding convenient ways to do certain things.
 */
public final class ServerHook {
    private static ServerHook instance;
    private final GameServer gameServer;
    private final HttpServer httpServer;

    /**
     * Gets the server hook instance.
     * @return A {@link ServerHook} singleton.
     */
    public static ServerHook getInstance() {
        return instance;
    }

    /**
     * Hooks into a server.
     * @param gameServer The game server to hook into.
     * @param httpServer The HTTP server to hook into.
     */
    public ServerHook(GameServer gameServer, HttpServer httpServer) {
        this.gameServer = gameServer;
        this.httpServer = httpServer;

        instance = this;
    }

    /**
     * @return The game server.
     */
    public GameServer getGameServer() {
        return this.gameServer;
    }

    /**
     * @return The HTTP server.
     */
    public HttpServer getHttpServer() {
        return this.httpServer;
    }

    /**
     * Gets all online players.
     * @return Players connected to the server.
     */
    @Deprecated(forRemoval = true)
    public List<Player> getOnlinePlayers() {
        return new ArrayList<>(this.gameServer.getPlayers().values());
    }

    /**
     * Gets all online players.
     * @return Players connected to the server.
     */
    public Stream<Player> getOnlinePlayersStream() {
        return this.gameServer.getPlayers().values().stream();
    }

    /**
     * Registers a command to the {@link emu.gingerps.command.CommandMap}.
     * @param handler The command handler.
     */
    public void registerCommand(CommandHandler handler) {
        Class<? extends CommandHandler> clazz = handler.getClass();
        if (!clazz.isAnnotationPresent(Command.class))
            throw new IllegalArgumentException("Command handler must be annotated with @Command.");
        Command commandData = clazz.getAnnotation(Command.class);
        CommandMap.getInstance().registerCommand(commandData.label(), handler);
    }

    /**
     * Adds a router using an instance of a class.
     * @param router A router instance.
     */
    public void addRouter(Router router) {
        this.addRouter(router.getClass());
    }

    /**
     * Adds a router using a class.
     * @param router The class of the router.
     */
    public void addRouter(Class<? extends Router> router) {
        this.httpServer.addRouter(router);
    }

    /**
     * Sets the server's authentication system.
     * @param authSystem An instance of the authentication system.
     */
    public void setAuthSystem(AuthenticationSystem authSystem) {
        gingerps.setAuthenticationSystem(authSystem);
    }

    /**
     * Sets the server's permission handler.
     * @param permHandler An instance of the permission handler.
     */
    public void setPermissionHandler(PermissionHandler permHandler) {
        gingerps.setPermissionHandler(permHandler);
    }
}
