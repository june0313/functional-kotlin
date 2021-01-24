package _2_start

const val CONST_VALUE: Int = 10

fun main() {
    val value = 100
    println(CONST_VALUE)
    println(value)

    var age = 30
    println("myAge is $age.")

    age = 22
    println("myAge is $age.")

    val nullableVal: String? = null
    println("The length of string : ${nullableVal?.length}")

    println(twice(90))
    println(twice2(90))
    println(twice3(90))
    println("=====================")
    println(add(10, 5))
    println(add(10))
    println(add(y = 9, x = 12))
    println(add(x = 9, y = 12))
    println(sum(1, 2) { x, y -> x + y })
    println(30.product(45))
}

// 타입추론을 하지 않는다.
fun twice(value: Int): Int {
    return value * 2
}

// 한줄로 표현 가능하면 코드블록과 return문을 생략할 수 있다.
fun twice2(value: Int): Int = value * 2

// 한줄로 표현하면 타입추론도 가능해서 리턴 타입을 생략할 수 있다.
fun twice3(value: Int) = value * 2

// 기본 값 지정
fun add(x: Int, y: Int = 3) = x + y

fun sum(x: Int, y: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(x, y)
}

fun Int.product(value: Int): Int {
    return this * value
}