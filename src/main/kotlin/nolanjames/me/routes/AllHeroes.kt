package nolanjames.me.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import nolanjames.me.models.ApiResponse

fun Route.getAllHeroes() {
    get("/boruto/heroes") {
        val page = call.request.queryParameters["page"]?.toInt() ?: 1
        try {

        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}