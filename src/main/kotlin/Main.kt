package org.example

import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte
import org.example.view.renderGameState
import org.example.view.renderTitle

fun main() {
    var gameState = GameState()
    val app = Javalin.create { config ->
        config.staticFiles.add("/public")
        config.fileRenderer(JavalinJte())
        config.staticFiles.enableWebjars()

    }

    app.get("/", ::renderTitle)


    app.get("/keyPressed") { ctx ->
        val pressedKey = ctx.queryParam("key")
        if (pressedKey != null) {
            gameState = gameState.tryKey(pressedKey)
        }
        renderGameState(ctx, gameState)
    }

    app.start(7000)

}

