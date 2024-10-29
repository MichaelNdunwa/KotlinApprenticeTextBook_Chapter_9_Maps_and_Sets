package challenges

// Challenge 5

/***
 * Write a function that returns true if all of the values of a map are unique. Use a set to test
 * uniqueness. This is the function signature:
 *
 *      fun isInvertible(map: Map<String, Int>): Boolean
 */

// This my solution is amateur.
fun isInvertible(map: Map<String, Int>): Boolean {
    val uniqueList = mutableListOf<Int>()
    map.forEach { _, value ->
        uniqueList.add(value)
    }
    return uniqueList.size == uniqueList.toSet().size
}

// Here is pro level solution:
// fun isInvertible(map: Map<String, Int>) = map.values.toSet().size == map.values.size


fun main() {
    val invertibleMap = mapOf("1" to 1, "2" to 2, "3" to 3)
    println(isInvertible(invertibleMap))

    val nonInvertibleMap = mapOf("1" to 3, "2" to 2, "3" to 3)
    println(isInvertible(nonInvertibleMap))
}