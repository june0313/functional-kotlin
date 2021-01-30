package _3_recursion

fun main() {
    for (i in 0..100) {
        println(toBinaryTail(i))
    }
}

private fun toBinary(n: Int): String = when {
    n < 2 -> "${n % 2}"
    else -> "${toBinary(n / 2)}${(n % 2)}"
}

private tailrec fun toBinaryTail(n: Int, acc: String = ""): String = when {
    n < 2 -> "${n % 2}$acc"
    else -> toBinaryTail(n / 2, "${n % 2}$acc")
}