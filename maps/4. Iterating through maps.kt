package maps

fun main() {
    val fruitBasket = mapOf(
        "Mango" to 100,
        "Orange" to 150,
        "Guava" to 200,
        "Apple" to 150,
        "Orange" to 100,
        "Orange" to 150
    )

    for ((fruit, price) in fruitBasket) {
        println("$fruit is sold for ₦$price.")
    }
    // When you run the code above, you'll notice that it's only the first occurrence of the key that will be printed.
    // That is to say that only the first orange will be printed.

    println(fruitBasket.size)
    // The actual size will be 4 instead of 6, this is because it will ignore the other two occurrence of Orange.

    // List just the names of fruits in the basket.
    var count = 1
    for ((fruit, _) in fruitBasket) { println("${count++}. $fruit") }

    // Another approach to list the names of fruits in the basket will be:
    var count2 = 1
    for (fruit in fruitBasket.keys) { println("${count2++}. $fruit") }
}