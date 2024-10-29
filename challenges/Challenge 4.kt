package challenges

// Challenge 4:
/***
 *  Declare a function occurrencesOfCharacters that calculates which characters
 * occur in a string, as well as how often each of these characters occur. Return the
 * result as a map. This is the function signature:
 * fun occurrencesOfCharacters(text: String): Map<Char, Int>
 * Hint: String is a collection of characters that you can iterate over with a for
 * statement.
 * Bonus: To make your code shorter, maps have a special function that lets you
 * add a default value if it is not found in the map. For example,
 * map.getOrDefault('a', defaultValue = 0) returns 0 for the character ‘a’
 * if it is not found, instead of simply returning null.
 */

fun occurrencesOfCharacters(text: String): Map<Char, Int> {
    val characterCount = mutableMapOf<Char, Int>()
    text.forEach { c ->
        val occurrence = text.count { it == c }
        characterCount.put(c, occurrence)
    }
/*    for (c in text) {
        val count = characterCount.getOrDefault(c, defaultValue = 0)
        characterCount[c] = count + 1
    }*/
    return characterCount
}

fun main() {
    println(occurrencesOfCharacters("michael"))
}