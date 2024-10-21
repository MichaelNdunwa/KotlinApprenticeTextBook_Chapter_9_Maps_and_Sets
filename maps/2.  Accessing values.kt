package maps

// How to access the values of a map.
// 1. Using the index operator. Here the key of the value is used together with the index operator []
// 2. Using properties and methods.
fun main() {
    var numberOfDrinks = mutableMapOf(
        "Sprite" to 10,
        "Fanta" to 5,
        "Coke" to 30,
    )
    println(numberOfDrinks["Coke"]) // Used the index operator method.

    // If the key doesn't exit, it will return null.
    println(numberOfDrinks["Alcohol"]) // null

    // Using properties and methods.
    println(numberOfDrinks.get("Fanta")) // use of method to access the value of a map.

   // using properties:
   numberOfDrinks.isEmpty() // false
   println(numberOfDrinks.size)


    // Checking if mapOf() is actually a collection of Pairs<Any, Any>()
    val collectionOfPairs = mapOf(
        Pair("Mango", 100),
        Pair("Orange", 50),
        Pair("Guava", 200),
        Pair("Apple", 150)
    )
    println(collectionOfPairs["Guava"])

}