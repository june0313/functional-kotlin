package _3_recursion

fun main() {
    println(fiboRecursion(30))
}

private fun fiboDynamic(n: Int, fibo: IntArray): Int {
    fibo[0] = 0
    fibo[1] = 1

    for (i in 2..n) {
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }

    return fibo[n]
}

var memo = Array(1000) { -1 }

private fun fiboRecursion(n: Int): Int {
    return when {
        n == 0 -> 0
        n == 1 -> 1
        memo[n] != -1 -> memo[n]
        else -> {
            memo[n] = fiboRecursion(n - 2) + fiboRecursion(n - 1)
            memo[n]
        }
    }
}