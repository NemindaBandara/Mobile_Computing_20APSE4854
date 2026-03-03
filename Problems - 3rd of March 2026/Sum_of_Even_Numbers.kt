fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    val sum = numbers.filter { it % 2 == 0 }.sum()
    
    println("The sum of even numbers is: $sum")
}