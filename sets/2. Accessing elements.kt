package sets

// Accessing elements:
fun main() {
    val setOfNumbers = setOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    // contains() can be used to check for the existence of a particular element:
    println(setOfNumbers.contains(1)) // true

    // in can also be used to check for the existence of a particular element:
    println(4 in setOfNumbers)

    // first() and last(), can be used to access the first and last element of a set respectively:
    println(setOfNumbers.first())
    println(setOfNumbers.last())

    // using iteration to access the elements of a set()
    // -- for loop:
    for (number in setOfNumbers) {
        println(number)
    }

    // -- for each:
    setOfNumbers.forEach { println(it) }

}