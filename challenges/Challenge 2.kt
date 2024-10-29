package challenges

// Challenge 2:
/***
 * Given a map with two-letter state codes as keys, and the full state names as values, write a function
 * that prints all the states with names longer than eight character.
 * For example, for the mapOf("NY" to "New York", "CA" to "California")
 * the output would be California.
 */

fun longStateName(state: Map<String, String>) {
    state.forEach { _, value ->
        if (value.trim().length > 8) println(value)
    }
}

fun main() {
    val states = mapOf("NY" to "New York", "CA" to "California")
    longStateName(states)
}