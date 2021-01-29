package _3_recursion

fun main() {
    println(zip(listOf(1, 2, 3), listOf(4, 5)))
}

private fun zip(list1: List<Int>, list2: List<Int>): List<Pair<Int, Int>> = when {
    list1.isEmpty() || list2.isEmpty() -> listOf()
    else -> listOf(Pair(list1.first(), list2.first())) + zip(list1.drop(1), list2.drop(1))
}