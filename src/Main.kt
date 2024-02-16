fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEach {
        println(it)
    }
}

fun isInt1(value: String): Boolean {
    return try {
        value.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }
}

fun isInt2(value: String) = try {
    value.toInt()
    true
} catch (e: NumberFormatException) {
    false
}
fun isInt(value: String) = value.toIntOrNull() != null