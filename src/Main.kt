fun main() {
    val name: String = getName() ?: "No Name";

    println("Name: $name");
}

fun getName(): String? {
    return null;
}