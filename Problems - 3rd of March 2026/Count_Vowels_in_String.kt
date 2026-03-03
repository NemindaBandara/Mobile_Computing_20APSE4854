fun main() {
    val input = "Mobile Computing"
    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in input) {
        if (char in vowels) {
            count++
        }
    }

    println("Number of vowels: $count")
}