package _3_recursion

private tailrec fun tailMaximum(items: List<Int>, acc: Int = Int.MIN_VALUE): Int = when {
    items.isEmpty() -> error("Empty List")
    items.size == 1 -> {
        println("head : ${items[0]}, maxVal : $acc")
        acc
    }
    else -> {
        val head = items.head()
        val maxValue = if (head > acc) head else acc
        println("head : $head, maxVal : $maxValue")
        tailMaximum(items.tail(), maxValue)
    }
}

fun main() {
    println(tailMaximum(listOf(1, 2, 10, 5, 7, 3, 100, 23, 2030, 12, 23, 13, 645, 456, 2445, 5544, 23, 9999, 23)))
}