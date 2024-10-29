package sets

// Creating sets:
fun main() {
    val names = setOf("Michael", "Amos", "Kaycee", "Joshua", "Michael")
    println(names) // Since sets are unordered how do you access a particular element you have in mind?, since they're unordered you can't use index.

    // creating empty sets
    val emptySet1 = setOf<Int>()
    val emptySet2 = HashSet<Long>()
    // You can use HashSet<Any>() to create an empty set as well although I don't know the use of it right now.


    // set from arrays: you can create a set from array just like you can create an array from vararg.
    val someArray = arrayOf(1, 2, 3, 1)
    var someSet = setOf(*someArray)
    println(someSet.elementAt(0))

    // Let me check something with set:
    val listOfDuplicates = listOf(1, 2, 3, 1, 2, 3, 2, 3, 1, 2, 3, 1, 2, 3)
    val removeDuplicates = listOfDuplicates.toSet()
    val newList = removeDuplicates.toList()
    println(newList)

    if (1 in newList) {
        println("1 is in the list")
    }
}