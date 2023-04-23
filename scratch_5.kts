reverseString("Exemplo")

fun reverseString(text: String): String {
    var result = ""

    for (i in text.length - 1 downTo  0) {
        result += text[i]
    }
    return result
}

// Em kotlin, temos a extension ´reversed()´, que nos retorna a string invertida.
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/reversed.html
