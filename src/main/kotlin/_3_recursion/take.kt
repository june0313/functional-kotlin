package _3_recursion

fun main() {
    println(take(3, listOf(2, 3, 4, 5, 6)))
}

private fun take(n: Int, list: List<Int>): List<Int> = when {
    n <= 0 -> listOf()
    list.isEmpty() -> listOf()
    else -> listOf(list.first()) + take(n - 1, list.drop(1))
}