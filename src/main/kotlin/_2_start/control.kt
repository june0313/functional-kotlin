package _2_start

import java.lang.Integer.parseInt

fun main() {
    println(max(10, 200))
    whenTest(1)
    whenTest(2)
    whenTest(3)
    whenTest(4)
    whenTest(5)

    val someNumber = 100
    val numType = when {
        someNumber == 0 -> "zero"
        someNumber > 0 -> "positive"
        else -> "negative"
    }

    println(numType)

    forTest()
}

fun max(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun whenTest(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2, 3 -> println("x == 2 or 3")
        parseInt("4") -> println("x == 4")
        else -> println("else number")
    }
}

fun forTest() {
    val collection = listOf(1, 2, 3)
    for (item in collection) {
        print("$item ")
    }
    println()

    for ((index, item) in collection.withIndex()) {
        println("the element at $index is $item")
    }

    for (i in 100..103) {
        print(i)
    }
    println()
    for (i in 1 until 3) {
        print(i)
    }
    println()

    for (i in 10 until 100 step 3) {
        print("$i, ")
    }
    println()
}