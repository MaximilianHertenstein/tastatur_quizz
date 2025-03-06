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

    fun tryKey(gameID: String, key: String): Pair<GameState, Int?> {
        val  currentGame = getGame(gameID)
        val nextGame = currentGame.tryKey(key)
            gameStates[gameID] = nextGame
            val highScore = if (nextGame.score == 0) currentGame.score else null
            return Pair(nextGame,highScore)
        }

    fun updateHighScore(name:String, score:Int) {
        highScoreItems.update(name, score )
    }

    fun getHighScoreList() = highScoreItems.getHighScoreList()
    }

