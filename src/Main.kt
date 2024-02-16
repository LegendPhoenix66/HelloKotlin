fun main() {
    val name: String = getName(20) ?: "No Name";

    println("Name: $name");
}

fun getName(age: Int): String? {
    if (age > 18) {
        return "John Doe";
    } else {
        return null;
    }
}