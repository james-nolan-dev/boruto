package nolanjames.me.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import nolanjames.me.routes.getAllHeroes
import nolanjames.me.routes.root
import nolanjames.me.routes.searchHeroes

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        staticResources("/images", "images")
    }
}
