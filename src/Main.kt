val name = "John Doe";
var greeting : String? = null;
fun main() {
    println(greeting);
    println(name);

    greeting = null;
    greeting = "Hello";

    println(greeting);
    println(name);
}