package _3_recursion

fun main() {
    println(replicate(3, 5))
    println(replicate(7, 5))
    println(replicateTail(7, 5))
    println(replicateTail(10, 13))
}

private fun replicate(n: Int, element: Int): List<Int> {
    return when (n) {
        1 -> listOf(element)
        else -> listOf(element) + replicate(n - 1, element)
    }
}

private tailrec fun replicateTail(n: Int, element: Int, acc: List<Int> = listOf()): List<Int> = when (n) {
    0 -> acc
    else -> replicateTail(n - 1, element, acc + listOf(element))
}