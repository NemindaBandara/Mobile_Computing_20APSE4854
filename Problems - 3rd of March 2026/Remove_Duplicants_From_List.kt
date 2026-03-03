fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 4, 5, 6, 1)
    
    val uniqueList = numbers.distinct()
    
    println("Original: $numbers")
    println("Unique:   $uniqueList")
}