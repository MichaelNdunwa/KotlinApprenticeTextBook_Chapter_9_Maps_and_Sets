package challenges

fun challenge1() {
    // Which of the following are valid statements?
    //val map1: Map<Int to Int> = emptyMap()  // Invalid
    //val map2 = emptyMap() // Invalid
    val map3: Map<Int, Int> = emptyMap() // Valid

    // For the next four statements, use the following map:
    val map4 = mapOf("Ont" to 1, "Two" to 2, "Three" to 3)
    //map4[1] // Invalid
    map4["One"] // Valid
    //map4["Zero"] = 0 // Invalid: map4 is not mutable
    //map4[0] = "Zero" // Invalid

    // For the next three statements, use the following map:
    val map5 = mutableMapOf(
        "NY" to "New York",
        "CA" to "California"
    )
    map5["NY"] // Valid
    map5["WA"] = "Washington"
    //map5["CA"] = null // Invalid
}

