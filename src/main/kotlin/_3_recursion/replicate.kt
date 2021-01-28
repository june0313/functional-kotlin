package _3_recursion

fun main() {
    println(replicate(3, 5))
    println(replicate(7, 5))
}

private fun replicate(n: Int, element: Int): List<Int> {
    return when (n) {
        1 -> listOf(element)
        else -> listOf(element) + replicate(n - 1, element)
    }
}