fun main(args: Array<String>) {

    //ArrayList
    var myArrayList = ArrayList<String>()
    myArrayList.add("James")

    println(myArrayList.get(0))

    println(myArrayList[0])

    if (myArrayList.contains("James")) println("Son of a Bitch")

    println("\n\n\n")
    /*
    * Hashmap = Key-value pairs
    * */

    var hashmap = HashMap<String, String>()
    hashmap.put("Mary", "Married")
    hashmap.put("John", "Married")
    hashmap.put("John", "Single")
    hashmap.put("Bob", "Single")
    hashmap.put("Wale", "Married")

//    println(hashmap.get("John"))

    for (k in hashmap.keys) println(hashmap.get(k))

}