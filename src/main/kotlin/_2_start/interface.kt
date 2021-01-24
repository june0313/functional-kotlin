package _2_start

fun main() {
    val kotlin = FooBar()
    kotlin.printBar()
    kotlin.printFoo()
    kotlin.printKotlin()

    val kotlin2 = Kotlin()
    println(kotlin2.bar)
}

interface Foo {
    fun printFoo()
    fun printKotlin() {
        println("Foo - kotlin")
    }
}

interface Bar {
    fun printBar()
    fun printKotlin() {
        println("Bar - kotlin")
    }
}

class FooBar : Foo, Bar {
    override fun printFoo() {
        println("bar bar")
    }

    override fun printKotlin() {
        super<Foo>.printKotlin()
        super<Bar>.printKotlin()
        println("FooBar kotlin")
    }

    override fun printBar() {
        println("foo foo")
    }
}

interface AbstractFoo {
    val bar: Int
        get() = 3

    fun printFoo() {
        println("Foooooo")
    }
}

class Kotlin : AbstractFoo {

}