package _3_recursion

fun main() {
//    helloFunc(10)
//    println(func(5))
    println(power(2.0, 11).toBigDecimal().toPlainString())
//    println(factorial(3))
//    println(maximum(listOf(1, 3, 2008, 8, 4)))
}

private fun helloFunc(n: Int) {
    when {
        n < 0 -> return
        else -> {
            println("Hello")
            helloFunc(n - 1)
        }
    }
}

fun func(n: Int): Int = when {
    n < 0 -> 0
    else -> n + func(n - 1)
}

fun power(x: Double, n: Int): Double = power(x, 1.0, n)

tailrec fun power(x: Double, result: Double, n: Int): Double = when (n) {
    0 -> result
    else -> power(x, x * result, n - 1)
}

private fun factorial(n: Int): Int = when {
    n < 1 -> 1
    else -> n * factorial(n - 1)
}

private fun maximum(items: List<Int>): Int = when {
    items.isEmpty() -> error("empty list")
    items.size == 1 -> items[0]
    else -> {
        val head = items.first()
        val tail = items.drop(1)
        val maxVal = maximum(tail)
        if (head > maxVal) head else maxVal
    }
}

fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)