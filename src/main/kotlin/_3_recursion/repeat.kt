package _3_recursion

fun main() {
    println(takeSequence(5, repeat(0)))
}

fun repeat(n: Int): Sequence<Int> = sequenceOf(n) + { repeat(n) }

operator fun <T> Sequence<T>.plus(other: () -> Sequence<T>) = object : Sequence<T> {
    private val thisIterator: Iterator<T> by lazy { this@plus.iterator() }
    private val otherIterator: Iterator<T> by lazy { other().iterator() }
    override fun iterator() = object : Iterator<T> {
        override fun next(): T =
            if (thisIterator.hasNext())
                thisIterator.next()
            else
                otherIterator.next()

        override fun hasNext() = thisIterator.hasNext() || otherIterator.hasNext()
    }
}

fun takeSequence(n: Int, sequence: Sequence<Int>): List<Int> {
    return when {
        n < 1 -> listOf()
        else -> takeSequence(n - 1, sequence) + sequence.take(1).toList()
    }

}