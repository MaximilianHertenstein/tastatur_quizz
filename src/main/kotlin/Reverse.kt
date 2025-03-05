package org.example

fun reverseInt(xs:List<Int>):List<Int> {
    var acc = listOf<Int>()
    for (i in 0..xs.size - 1){
        acc += xs[xs.size - 1 - i]
    }
    return  acc
}


fun reverseChar(xs:List<Char>):List<Char> {
    var acc = listOf<Char>()
    for (i in 0..xs.size - 1){
        acc += xs[xs.size - 1 - i]
    }
    return  acc
}

fun <T> reverse(xs:List<T>):List<T> {
    var acc = listOf<T>()
    for (i in 0..xs.size - 1){
        acc += xs[xs.size - 1 - i]
    }
    return  acc
}


fun main(){
    println(reverseInt(listOf(1, 4, 8)))
    println(reverse(listOf(1, 4, 8)))
    println(reverse(listOf(true, false, true)))
    println(reverse(listOf("hello", "world")))

    val xs = listOf(1, 'u')
}


// x = x + 5
// x -= 5