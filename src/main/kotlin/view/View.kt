package org.example.view

import io.javalin.http.Context
import org.example.GameState
import org.example.HighScoreItem

fun renderGameState(ctx: Context, gameState: GameState) {
    ctx.render("02_tasks.kte", mapOf("gameState" to gameState))
}

fun renderTitle(ctx: Context) {
    ctx.render("01_title.kte")
}

fun renderHighScores(ctx: Context,highScores: List<HighScoreItem>) {
    ctx.render("04_highScores.kte", mapOf("highScoreItems" to highScores))
}