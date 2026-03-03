fun main() {
    val numbers = listOf(3, 7, 2, 9, 5)
    
    var max = numbers[0] 

    for (num in numbers) {
        if (num > max) {
            max = num 
        }
    }

    println("The largest number is: $max")
}