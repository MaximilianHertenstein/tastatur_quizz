package org.example.view

import io.javalin.http.Context
import org.example.GameState

fun renderGameState(ctx: Context, gameState: GameState) {
    ctx.render("02_tasks.kte", mapOf("gameState" to gameState))
}

fun renderTitle(ctx: Context) {
    ctx.render("01_title.kte")
}
