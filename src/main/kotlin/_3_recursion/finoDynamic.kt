package _3_recursion

fun main() {
    println(fiboDynamic(10, IntArray(100)))
    println(fiboDynamic(15, IntArray(100)))

    println(fiboRecursion(10))
    println(fiboRecursion(15))
    println(fiboRecursion(20))

}

private fun fiboDynamic(n: Int, fibo: IntArray): Int {
    fibo[0] = 0
    fibo[1] = 1

    for (i in 2..n) {
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }

    return fibo[n]
}

private fun fiboRecursion(n: Int): Int = when (n) {
    0 -> 0
    1 -> 1
    else -> fiboRecursion(n - 1) + fiboRecursion(n - 2)
}