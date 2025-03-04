package org.example

class GameState()
    {
        var keys: MutableList<String> = mutableListOf("b", "a", "Enter")
        var lastKey : String= keys.random()
        var score : Int = 0

        fun reset(){
            score = 0
        }


        fun update(){
            lastKey = keys.random()
        }

        fun incPoints(){
            score++
        }
}