package org.example

class HighScoreItem(val playerName: String, val score: Int)

fun insertOrdered(highScoreItems: List<HighScoreItem>, toInsert: HighScoreItem): List<HighScoreItem> {
    var acc = listOf<HighScoreItem>()
    var inserted = false
    for (elem in highScoreItems) {
        if (!inserted && elem.score > toInsert.score) {
            acc = acc + toInsert
            inserted = true
        }
        acc = acc + elem

    }
    return if (inserted) acc else acc + highScoreItems
}


class HighScoreBoard(private var board: List<HighScoreItem> = List(3) { HighScoreItem("Nobody", 0) }) {

    fun update(name: String, score: Int) {
        board = insertOrdered(board, HighScoreItem(name, score)).drop(1)
    }

    fun getHighScoreList() = board

}