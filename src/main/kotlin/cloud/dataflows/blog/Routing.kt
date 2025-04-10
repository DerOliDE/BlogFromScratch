package cloud.dataflows.blog

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.pebble.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File
import java.nio.file.Paths

fun Application.configureRouting() {
    routing {

        staticResources("/static", "static") {
            extensions("js")
        }

        get("/") {
            call.respond(PebbleContent("index.html", emptyMap()))
        }

        post("/greetings") {
            val params = mapOf(
                "name" to "World"
            )
            call.respond(PebbleContent("components/greetingComponent.html", params))
        }
    }
}
