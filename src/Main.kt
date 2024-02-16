fun main() {
    val name: String = getName(age = 20) ?: "No Name";

    println("Name: $name");
}

fun getName(age: Int): String? {
    return if (age > 18) {
        "John Doe";
    } else {
        null;
    }
}