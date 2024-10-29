package sets

// Adding and removing elements:
fun main() {
    val setOfAlphabets = mutableSetOf('a', 'b', 'c', 'd', 'e')
    setOfAlphabets.add('f')
//    setOfAlphabets.remove('c')
    val removeC = setOfAlphabets.remove('c') // remove() returns a boolean just like remove() in a listOf()
    if (removeC) println("C was removed for the set of alphabets") else println("Nah, C wasn't in the set to start with.")
    println(setOfAlphabets)


}