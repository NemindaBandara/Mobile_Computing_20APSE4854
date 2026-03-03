fun main() {
    val items = listOf("Apple", "Banana", "Cherry", "Date")
    val reversedList = mutableListOf<String>()

    for (i in items.size - 1 downTo 0) {
        reversedList.add(items[i])
    }

    println("Original: $items")
    println("Reversed: $reversedList")
}