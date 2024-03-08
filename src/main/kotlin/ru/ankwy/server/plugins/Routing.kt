package ru.ankwy.server.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*

fun Application.configureMain() =
    routing {
        get("/") {
            call.respond(
                ThymeleafContent(
                    template = "html/main",
                    model = mapOf()
                )
            )
        }
    }

fun Application.configureInfo() =
    routing {
        get("info") {
            call.respond(
                ThymeleafContent(
                    template = "html/info",
                    model = mapOf()
                )
            )
        }
    }

fun Application.configureContacts() =
    routing {
        get("contacts") {
            call.respond(
                ThymeleafContent(
                    template = "html/contacts",
                    model = mapOf()
                )
            )
        }
    }

fun Application.configureStatic() =
    routing {
        staticResources("/static", "files")
        staticResources("/css", "template/css")
        staticResources("/fonts", "template/fonts")
    }