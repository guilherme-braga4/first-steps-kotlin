import kotlin.reflect.typeOf

fun main() {
    println("What's your name?")
    val name = readln()
    println("Hello, $name!")

    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

    customers = 8
    println(customers)

    // hotdog = 2 - Val its readonly
    println("There are ${hotdog + 1} hotdogs")

    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    println("Data types are very important")
}