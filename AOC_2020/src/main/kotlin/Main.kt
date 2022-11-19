import java.io.File

fun main(args: Array<String>) {
    println("Advent Of Code 2020. Add a number from 1-31 to the program arguments to default to running a specific puzzle.")
    println("Program arguments: ${args.joinToString()}")

    try {
        val puzzleToRun = args[0].toInt()
        when (puzzleToRun) {
            1 -> one()
            2-> two()
        }

    } catch (e: Exception) {
        println(e.message)
    }
}

fun one() {
    println("Day 1")
    println("Find 2 numbers in numbers.txt whose sum is 2020, and print their product.")
    val numbers = File("src/main/kotlin/numbers.txt")
        .readLines()
        .map(String::toInt) // map gives you a list from an iterable
    for (number in numbers) {
        for (number2 in numbers) {
            if (number + number2 == 2020) {
                println("1: $number 2: $number2")
                println("part 1: " + (number * number2))
            }
            for (number3 in numbers) {
                if (number + number2 + number3 == 2020) {
                    println("1: $number 2: $number2 3: $number3")
                    println("part 2: " + (number * number2 * number3))
                }
            }
        }
    }
}

fun two() {

}