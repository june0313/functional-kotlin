package _2_start

fun main() {
    val user = User("FP", 32)
    println(user.name)

    user.name = "OOP"
    println(user.name)
    println(user.age)

    val june = User("JUNE")
    println(june)

    println(Error.ERROR)
    println(Error.WARN)
    println(Error.FAULT)
    println(Error.FAULT.num)
}

data class User(var name: String, val age: Int = 18) {

}

enum class Error(val num: Int) {
    WARN(2) {
        override fun getErrorName(): String {
            return "WARN"
        }
    },
    ERROR(3) {
        override fun getErrorName(): String {
            return "ERROR"
        }
    },
    FAULT(1) {
        override fun getErrorName(): String {
            return "FAULT"
        }
    };

    abstract fun getErrorName(): String
}
