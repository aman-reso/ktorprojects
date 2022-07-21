package main.com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import main.com.example.plugins.configureRouting

fun main() {
    val port=System.getenv("PORT")?:"8080"
    embeddedServer(Netty, port = port.toInt(), host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
