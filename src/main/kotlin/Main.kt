package org.example

import io.javalin.Javalin
import io.javalin.http.Context
import io.javalin.rendering.template.JavalinJte


class GameState()
    {
        var keys: MutableList<String> = mutableListOf("b", "a", "Enter")
        var lastKey : String= keys.random()
        var score : Int = 0

        fun reset(){
            score = 0
        }


        fun update(){
            lastKey = keys.random()
        }

        fun incPoints(){
            score++
        }
}

fun main() {
    val gameState = GameState()
    val app = Javalin.create {
        config -> config.staticFiles.add("/public")
        config.fileRenderer(JavalinJte())
        config.staticFiles.enableWebjars()

    }

    app.get("/") { ctx -> ctx.render("01_title.kte") }

    app.get("/tasks") { ctx -> renderState(ctx, gameState) }

    app.get("/keyPressed") { ctx ->
        val pressedKey = ctx.queryParam("key")
        if (pressedKey == gameState.lastKey ) {
            gameState.incPoints()
            gameState.update()

        }
        else {
            gameState.reset()
        }

        renderState(ctx, gameState)
    }




    app.start(7000)

}

private fun renderState(ctx: Context, gameState: GameState) {
    ctx.render("02_tasks.kte", mapOf("key" to gameState.lastKey, "score" to gameState.score))
}