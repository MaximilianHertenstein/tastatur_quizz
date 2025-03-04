package org.example

class Model(private val gameStates: Map<Int, GameState>) {
    fun addGame() = Model(this.gameStates + (gameStates.size to GameState()))

    fun tryKey(gameID:Int,key: String) = gameStates.map { (id, gameState)
        -> if (gameID == id) gameState.tryKey(key) else gameState }
}