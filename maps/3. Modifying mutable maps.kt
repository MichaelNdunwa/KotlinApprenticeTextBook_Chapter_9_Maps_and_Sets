package maps

// Modifying mutable maps:
fun main() {
    // Adding pairs:
    val michaelData = mutableMapOf(
        "name" to "Michael",
        "profession" to "Software engineer",
        "country" to "Nigeria",
    )
    // You can use the put() function or index[] operator to add pairs in a mutable map.
    michaelData.put("state", "Umuahi")
    michaelData["relationship"] = "Single"

    // Print the city and state:
    printCityAndState(michaelData)

    // You can also use the += infix operator to add a pair:
    val pair = "nickname" to "Mikey"
    michaelData += pair
    println(michaelData)

    // One more thing when you update the value of a pair in a mapOf() it returns the old value of the
    // map, but if the pair doesn't exist before it will return null. This is just like what the remove()
    // does in a List.
    // For instance:
    val michaelOldProfession = michaelData.put("profession", "CEO")
    println(michaelOldProfession) // The put() returns the old value, because the pair exist, or the key - "profession" exist.
    val religion = michaelData.put("religion", "Christian")
    println(religion) // It now returns null, because the key: religion doesn't exist before.



    //// Removing pairs:
    println(michaelData.remove("city")) // returns null - the key does not exist.
    println(michaelData.remove("state", "Umuahia")) // returns false - because the key "state" do exist, but the value doesn't match
    println(michaelData.remove("assert")) // returns null - the key does not exist.
    println(michaelData.remove("state", "Umuahi")) // returns true - this is because both the key and value matches.

}

/***
 * Mini-exercise:
 *  Write a function that prints a given player's city and state.
 */
fun printCityAndState(data: Map<String, String>) = println("City: ${data["city"] ?: "No city provided by the player."} \nState: ${data["state"]}")