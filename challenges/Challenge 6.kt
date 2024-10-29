package challenges

// Challenge 6

/**
 * Given the map:
 *      val nameTitleLookup: Map<String, String?> = mutableMapOf(
 *          "Mary" to "Engineer",
 *          "Patrick" to "Intern",
 *          "Ray" to "Hacker"
 *      )
 * Set the value of the key "Patrick" to null and completely remove the key and value
 * for "Ray".
 */

fun main() {
    val nameTitleLookup: Map<String, String?> = mutableMapOf(
        "Mary" to "Engineer",
        "Patrick" to "Intern",
        "Ray" to "Hacker"
    )

    val mutableMap = nameTitleLookup.toMutableMap()
    mutableMap["Patrick"] = null
    mutableMap.remove("Ray")

    // Compare both maps:
    println(nameTitleLookup)
    println(mutableMap)

}