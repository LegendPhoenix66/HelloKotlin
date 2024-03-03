import java.util.*

fun aiGuessingGame() {
    generateSequence {
        val randomNumber = (0..<100).random()
        generateSequence {
            print("Guess a number between 0 and 99: ")
            readlnOrNull()?.toIntOrNull()
        }.map { guess ->
            guess to when {
                guess > randomNumber -> {
                    println("Too high!")
                    false
                }
                guess < randomNumber -> {
                    println("Too low!")
                    false
                }
                else -> {
                    println("Congratulations! You guessed the number.")
                    true
                }
            }
        }.first { it.second }.let {
            print("Do you want to play again? (yes/no): ")
            readlnOrNull()?.lowercase()
        }
    }.takeWhile { it == "yes" }
}

fun myGuessingGame() {
    var playing = true;
    while (playing){
        val number = Random().nextInt(0, 100)
        var attempts = 0
        var guess : Int? = null
        val scanner = Scanner(System.`in`)

        while (guess!=number) {
            while (guess == null) {
                print("please enter a number: ")
                guess = scanner.nextLine()?.toIntOrNull()
            }
            if (guess > number) {
                println("number is lower")
                guess = null
            } else if (guess < number){
                println("number is higher")
                guess = null
            }
            attempts++

        }

        println("you found the number in $attempts tries")
        println("done playing? (y)")
        if (scanner.nextLine() == "y"){
            playing = false
        }
    }
}

fun main() {
    println("Welcome to the guessing game!")
    println("1. AI guessing game")
    println("2. Your guessing game")
    print("Choose a game: ")
    val input = Scanner(System.`in`)
    when (input.nextInt()) {
        1 -> aiGuessingGame()
        2 -> myGuessingGame()
    }
}