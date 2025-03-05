package org.example

import io.javalin.http.Context
import org.example.view.renderGameState

class Controller(private val model: Model = Model())  {

    private fun getSessionGame(ctx:Context) :
            Pair<String, GameState> {
        val sessionGameId = ctx.cookie("JSESSIONID")
        if (sessionGameId != null) {
            return   Pair(sessionGameId,model.getGame(sessionGameId))
        }
        else {
            throw Exception("No JSESSIONID")
        }
    }

    fun handlePressedKey(ctx:Context) {
        val (id, gameState) = getSessionGame(ctx)
        val pressedKey = ctx.queryParam("key")
        val nextGameState = if (pressedKey != null) model.tryKey(id,  pressedKey) else gameState
        renderGameState(ctx, nextGameState)
    }

}