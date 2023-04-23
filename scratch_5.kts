reverseString("Exemplo")

fun reverseString(text: String): String {
    var result = ""

    for (i in text.length - 1 downTo  0) {
        result += text[i]
    }
    return result
}