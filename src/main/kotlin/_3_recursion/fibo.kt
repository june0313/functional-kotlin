package _3_recursion

fun main() {
    println(fiboFP(20))
}

private fun fiboFP(n: Int) = fiboFP(n, 0, 1)

private tailrec fun fiboFP(n: Int, first: Int, second: Int): Int = when (n) {
    0 -> first
    1 -> second
    else -> fiboFP(n - 1, second, first + second)
}