package _3_recursion

fun main() {
    println(elem(3, listOf(3)))
}

fun elem(num: Int, list: List<Int>): Boolean = when {
    list.isEmpty() -> false
    list.first() == num -> true
    else -> elem(num, list.drop(1))
}