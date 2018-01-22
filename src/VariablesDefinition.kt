import javax.swing.text.View

fun main(args: Array<String>) {

//    Variables = a little bucket where we can put information

    var name = "Wale"
    var lastName = "Shola"
    var dogName: String
    var code: Int = 23
    var yinYang = '\u262F'

    val array = arrayOfNulls<Any>(10)
    val array2 = Array (5) {it * 10}

    dogName = "mall"

    if( dogName == "Small") {
        println("NOT NULL")
    } else {
        println("CAST!!!!!!!!!!!!!!!!!!")
    }
    println("Hello ${name} and ${lastName} indexing ${array[2]} and ${array2[2]}")
    println("My dog's name is ${dogName} with number ${code} and character ${yinYang}")

    for (i in array) {
        println(i)
    }

    for ( i in array2) {
        println(i)
    }

    println("${array}")






//    fun setView(view: View?) {
//        view ?: throw RuntimeException("View is empty")
//
//        // View is casted to non-nullable
//        view.isShown()
//    }

//    var weight: Int = 12 // 1
//    var weight: Int? = null // 2

}


