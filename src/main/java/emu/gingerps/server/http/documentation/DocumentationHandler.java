package emu.gingerps.server.http.documentation;

import io.javalin.http.Context;

interface DocumentationHandler {

    void handle(Context ctx);
}
