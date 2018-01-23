

fun main(args: Array<String>) {

    fun double(i: Int): Int {
        return 2 * i
    }

    /*fun findDuplicates(list: List<Int>): Set<Int> {
        var list = list.sorted()
        var cleaned_list = setOf<Int>(list)
        return cleaned_list
    }
*/
    fun printSum(a1: Int, a2: Int) { //1
        print(a1 + a2)
    }
    printSum(3,5)   //2


    println(double(10))
    println()

/*    fun printSum(a1: Int, a2: Int): Unit {
        print(a1 + a2)
    }*/

    fun printAdd(a: Int, b: Int) {  //1
        if(a < 0 || b < 0) {
            return                  //2
        }
        val sum = a + b
        print(sum)      //3
    }

/*    fun sum_positive(a: Int, b: Int): Int {
        if(a > 0 && b > 0) {
            return a + b
        }
        //Error, 1
    }*/

    fun sum_positive(a: Int, b: Int): Int {
        if(a > 0 && b > 0) {
            return a + b
        }
        return 0
    }

    fun printSum(vararg numbers: Int) {
        val sum = numbers.sum()
        print(sum)
    }

    printSum(1,2,3,4,5) //Print: 15
    printSum()                    //Print: 0

    fun printAll(prefix: String, postfix: String, vararg texts: String) {
        //Inferred type of texts is Array<String>
        val allTexts = texts.joinToString(", ")
        println("$prefix$allTexts$postfix")
    }

    printAll("All texts: ", "!","Hello World", "Wale")    //prints:  All texts: Hello, World Wale!



/*    fun loadUsers(ids: List<Int>) {
        var downloaded: List<User> = emptyList()
        fun printLog(comment: String) {
            Log.i("loadUsers (with ids $ids): $comment\nDownloaded: $downloaded") // 1
        }

        for(id in ids) {
            printLog("Start downloading for id $id")
            downloaded += loadUser(id)
            printLog("Finished downloading for id $id")
        }
    }*/
/*fun makeStudentList(): List<Student> {
    var students: List<Student> = emptyList()
    fun addStudent(name: String, state: Student.State =
    Student.State.New) {
        students += Student(name, state, courses = emptyList())
    }
    // ...
    addStudent("Adam Smith")
    addStudent("Donald Duck")
// ...
    return students
}*/











}