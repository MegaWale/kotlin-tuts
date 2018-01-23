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
    println("Hello $name and $lastName indexing ${array[2]} and ${array2[2]}")
    println("My dog's name is $dogName with number $code and character $yinYang")

    for (i in array) {
        println(i)
    }

    for ( i in array2) {
        println(i)
    }

    println("${array}")


    for (i in 1..5) println(i)
    for (i in 'b'..'g') println(i)

    val weight = 52
    val healthy = 50..75

    if (weight in healthy)
        println("${weight} is in $healthy range")

    val c = 'k'
    val alphabet = 'a'..'z'

    if (c in alphabet)
        println("$c is in character")

    for (i in  5..1) print(i)

    for (i in 50 downTo 1) print(i)
    println()
    for (i in 3..100 step 15) print(i)

    val x = 5
    println(if(x > 10) "greater" else "smaller")

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> println("x is neither 1 nor 2")
    }

    val vehicle = "Bike"

    val message = when (vehicle) {
        "Car" -> {
            "Four wheeler"
        }
        "Bike" -> {
            "Two wheels"
        }
        else -> {
            "Unknown number of wheels"
        }
    }
    println(message)

    when (vehicle) {
        "Car", "Bike" -> print("Vehicle")
        else -> print("Unidentified fanny object")
    }


//    val name = when (person) {
//        is String -> person.toUpperCase()
//        is User -> person.name
//        //Code is smart casted to String, so we can
//        //call String class methods
//        //...
//    }


    val riskAssessment = 80
    val handleStrategy = "Warn"

    val risk = when (riskAssessment) {
        in 1..20 -> print("negligible risk")
        !in 21..40 -> print("minor risk")
        !in 41..60 -> print("major risk")
        else -> when (handleStrategy){
            "Warn" -> "Risk assessment warning"
            "Ignore" -> "Risk ignored"
            else -> "Unknown risk!"
        }
    }
    println(risk)

    private fun getPasswordErrorId(password: String) = when {
        password.isEmpty() -> R.string.error_field_required
        passwordInvalid(password) -> R.string.error_invalid_password
        else -> null
    }



















































//    fun setView(view: View?) {
//        view ?: throw RuntimeException("View is empty")
//
//        // View is casted to non-nullable
//        view.isShown()
//    }

//    var weight: Int = 12 // 1
//    var weight: Int? = null // 2

}


