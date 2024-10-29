package challenges

// Challenge 3:
/***
 * Write a function that combines two maps into one. If a certain key appears in both maps, ignore
 * the pair from the first maps. This is the function's signature:
 *
 * fun mergeMaps(
 *      map1: Map<String, String>,
 *      map2: Map<String, String>,
 *  ): Map<String, String>
 */
fun mergeMaps(
    map1: Map<String, String>,
    map2: Map<String, String>,
): Map<String, String> {
    val newMap = mutableMapOf<String, String>()
    newMap.putAll(map1)
    newMap.putAll(map2)
    return newMap
}

fun main() {
    val firstMap = mapOf("1" to "2", "2" to "2")
    val secondMap = mapOf("1" to "1", "3" to "3")
    println(mergeMaps(firstMap, secondMap))
}