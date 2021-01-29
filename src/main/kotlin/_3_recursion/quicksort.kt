package _3_recursion

fun main() {
    println(quickSort(listOf(1, 3, 9, 8, 2, 10, 99, 5, 7, 6)))
}

private fun quickSort(list: List<Int>): List<Int> = when {
    list.size < 2 -> list
    else -> {
        val pivot = list[list.count() / 2]
        val (first, second) = list.partition { it < pivot }
        quickSort(first) + listOf(pivot) + quickSort(second.filter { it != pivot })
    }
}