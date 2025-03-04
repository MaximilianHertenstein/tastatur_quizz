package org.example

import io.javalin.Javalin
import io.javalin.http.Context
import io.javalin.rendering.template.JavalinJte


fun main() {
    var gameState = GameState()
    val app = Javalin.create {
        config -> config.staticFiles.add("/public")
        config.fileRenderer(JavalinJte())
        config.staticFiles.enableWebjars()

    }

    app.get("/") { ctx -> ctx.render("01_title.kte") }

    app.get("/tasks") { ctx -> renderState(ctx, gameState) }

    app.get("/keyPressed") { ctx ->
        val pressedKey = ctx.queryParam("key")
        if (pressedKey != null) {gameState = gameState.tryKey(pressedKey)}
        renderState(ctx, gameState)
    }




    app.start(7000)

}

private fun renderState(ctx: Context, gameState: GameState) {
    ctx.render("02_tasks.kte", mapOf("key" to gameState.lastKey, "score" to gameState.score))
}