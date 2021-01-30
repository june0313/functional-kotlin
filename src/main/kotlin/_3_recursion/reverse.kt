package _3_recursion

fun main() {
    println(reverse("호랑나비 한마리가 꽃밭에 앉았는데 도데체 한사람도 즐겨찾는이 하나 없네"))
    println(reverseTail("호랑나비 한마리가 꽃밭에 앉았는데 도데체 한사람도 즐겨찾는이 하나 없네"))
    println(reverseTail("그대는 아는가 이 마음 주단을 깔아놓은 내 마음"))
}

private fun reverse(str: String): String = when {
    str.isEmpty() -> ""
    else -> reverse(str.drop(1)) + str.first()
}

private tailrec fun reverseTail(str: String, acc: String = ""): String = when {
    str.isEmpty() -> acc
    else -> reverseTail(str.tail(), str.head() + acc)
}