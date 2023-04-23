isFibonacci(21)

fun isFibonacci(number: Int) : Boolean {
    val init = mutableListOf(0, 1)
    var i = 2

    while (init[i-1] < number) {
        init.add(init[i-1] + init[i-2])
        i++
    }

    val resultMessage = if (init.contains(number)) "Pertence" else "Não pertence"
    println("$number $resultMessage à sequência de Fibonacci")

    println("Sequência de Fibonacci até $number: $init")

    return init.contains(number)
}