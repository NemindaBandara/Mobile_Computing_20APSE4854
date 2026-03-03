fun main() {
    val numbers = listOf(10, -5, 3, -2, 7, 0, -8)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("The sum of positive numbers is: $sum")
}