package org.example

class Model(private val gameStates: MutableMap<String, GameState> = mutableMapOf(),
    private val highScoreItems:HighScoreBoard = HighScoreBoard()) {


    fun getGame(id:String): GameState {
        return gameStates[id] ?: addGame(id)
    }

    private fun addGame(id:String): GameState {
        val newGame = GameState()
        gameStates[id] = newGame
        return newGame
    }

    fun tryKey(gameID: String, key: String): GameState {
          val nextGame = getGame(gameID).tryKey(key)
            gameStates[gameID] = nextGame
            return nextGame
        }

    fun updateHighScore(name:String, score:Int) {
        highScoreItems.update(name, score )
    }

    fun getHighScoreList() = highScoreItems.getHighScoreList()
    }

