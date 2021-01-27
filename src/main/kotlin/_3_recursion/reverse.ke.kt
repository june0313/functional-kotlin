package _3_recursion

fun main() {
    println(reverse("호랑나비 한마리가 꽃밭에 앉았는데 도데체 한사람도 즐겨찾는이 하나 없네"))
}

private fun reverse(str: String): String = when {
    str.isEmpty() -> ""
    else -> reverse(str.drop(1)) + str.first()
}