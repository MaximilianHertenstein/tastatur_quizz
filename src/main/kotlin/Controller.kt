package org.example

import io.javalin.http.Context
import org.example.view.renderGameState
import org.example.view.renderHighScores

class Controller(private val model: Model = Model())  {
    private var nextSessionID = 0
    private fun getSessionGame(ctx:Context) :
            Pair<String, GameState> {
        val sessionGameId = getJSessionId(ctx)
        return Pair(sessionGameId, model.getGame(sessionGameId))

    }


    private fun getJSessionId(ctx: Context) : String {
        val maybeSessionId = ctx.cookie("JSESSIONID")
        if (maybeSessionId != null) {
            return   maybeSessionId
        }
        else
            ctx.cookie("JSESSIONID", nextSessionID.toString())
            nextSessionID ++
            return (nextSessionID - 1).toString()
    }

    fun handlePressedKey(ctx:Context) {
        val (id, gameState) = getSessionGame(ctx)
        val pressedKey = ctx.queryParam("key")
        val nextGameState = if (pressedKey != null) model.tryKey(id,  pressedKey) else gameState
        renderGameState(ctx, nextGameState)
    }


    fun showHighScores (ctx:Context) = renderHighScores(ctx, model.getHighScoreList())


}