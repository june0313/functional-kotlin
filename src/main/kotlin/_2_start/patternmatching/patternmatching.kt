package _2_start.patternmatching

fun main() {
    println(checkValue("kotlin"))
    println(checkValue(5))
    println(checkValue(15))
    println(checkValue(User("Joe", 14)))
    println(checkValue("unknown"))
    println("========================================")

    println(checkCondition("kotlin"))
    println(checkCondition(5))
    println(checkCondition(15))
    println(checkCondition(User("Joe", 14)))
    println(checkCondition(User("Joe", 114)))
    println(checkCondition("unknown"))

    println("========")
    println(sum(listOf(1, 2, 3, 4, 5)))
}

data class User(val name: String, val age: Int)

fun checkValue(value: Any) = when(value) {
    "kotlin" -> "kotlin"
    in 1..10 -> "1..10"
    11, 15 -> "11 or 15"
    is User -> "User"
    else -> "SomeValue"
}

fun checkCondition(value: Any) = when {
    value == "kotlin" -> "kotlin"
    value in 1..10 -> "1..10"
    value === User("Joe", 14) -> "=== User"
    value == User("Joe", 14) -> "== User(Joe, 14)"
    value is User -> "is User"
    else -> "SomeValue"
}

fun sum(numbers: List<Int>): Int {
    println("numbers : $numbers")
    return when {
        numbers.isEmpty() -> 0
        else -> numbers.first() + sum(numbers.drop(1))
    }
}