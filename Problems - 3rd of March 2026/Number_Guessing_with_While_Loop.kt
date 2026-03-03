fun main() {
    val correctNumber = 7 
    var guess = 5

    println("Guess a number between 1 and 10")

    while (guess != correctNumber) {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull() ?: 0

        if (guess != correctNumber) {
            println("Wrong guess. Try again!")
        }
    }

    println("Congratulations! You guessed the correct number.")
}