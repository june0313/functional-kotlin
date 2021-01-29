package _3_recursion

fun main() {
    println(5.factorial())
}

private fun Int.factorial(): Int {
    return factorial(this, this)
}

private fun factorial(n: Int, result: Int): Int = when (n) {
    1 -> result
    else -> factorial(n - 1, result * (n - 1))
}