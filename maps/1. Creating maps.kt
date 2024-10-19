package maps

fun main() {
    var yearOfBirth = mapOf(
        "Joshua" to 2001,
        "Amos" to 1999,
        "Assumpta" to 1999,
        "Kene" to 2001
    )
    println(yearOfBirth)

    // Names and Scores:
    var namesAndScores = mutableMapOf(
        "Joshua" to 2,
        "Amos" to 2,
        "Assumpta" to 8,
        "Kene" to 6
    )
    println(namesAndScores)

    // Creating empty map:
    namesAndScores = mutableMapOf()
}