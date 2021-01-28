package _3_recursion

fun main() {
    println(toBinary(127 ))
}

private fun toBinary(n: Int): String = when {
    n < 2 -> "${n % 2}"
    else -> "${toBinary(n / 2)}${(n % 2)}"
}