package org.example

class Model(private val gameStates: MutableMap<Int, GameState>) {
    fun addGame() {

        gameStates[gameStates.size] = GameState()
    }

    fun tryKey(gameID: Int, key: String) {
        val playedGame = gameStates[gameID]
        if (playedGame != null) {
            gameStates[gameID] = playedGame.tryKey(key)
        }


    }
}