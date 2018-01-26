fun main(args: Array<String>) {
    // Default is always immutable
    var myArrayList = listOf<String>("me", "james", "bonni", "life")
    println(myArrayList)

    //Make it mutable
    var mutableList = mutableListOf<String>("me", "james", "they", "life")
    mutableList[0] = "Paul"

    println("\n" + myArrayList[2] + "\n")

    for (items in mutableList) println("Items $items")

    //HashMap

    var myHashmap = hashMapOf(1 to "Paulo", 2 to "James")
    println(myHashmap.get(1))

    //Array
    var myArray = arrayOf(1,3,4,5,7)
    myArray[0] = 1000

    for (i in myArray) {
        println("\n\nItem $i")
    }
}