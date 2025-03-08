package org.example

data class GameState(
    val lastKey: String = keys.values.random(),
    val score: Int = 0) {

    fun tryKey(codeOfPressedKey: String): GameState {
        val nextKey = keys.values.random()
        val nextScore = if (codeOfPressedKey == keys[lastKey] ) score + 1 else 0
        return GameState(nextKey, nextScore)
    }

}