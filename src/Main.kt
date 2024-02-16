fun calculateDimensions(length: Int, width: Int, height: Int, depth: Int, radius: Int, diameter: Int) {
    println("Length: $length")
    println("Width: $width")
    println("Height: $height")
    println("Depth: $depth")
    println("Radius: $radius")
    println("Diameter: $diameter")
}

fun main() {
    calculateDimensions(10, 20, radius = 50, diameter = 60, height = 30, depth = 40)
}