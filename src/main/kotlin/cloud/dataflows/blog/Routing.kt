package cloud.dataflows.blog

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val params = mapOf(
                "name" to "World"
            )
            call.respond(PebbleContent("index.html", params))
        }
    }
}
