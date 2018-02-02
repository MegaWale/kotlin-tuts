import javax.naming.Context

fun main(srgs: Array<String>) {

/*    fun Context.toast(text: String) { //1
        Toast.makeText(this, text, LENGTH_LONG).show() //2
    }

    // Usage
    context.toast("Some toast")*/

    val number = generateSequence(1) { it + 1 }
            .map { it * 2 }
            .take(10)
            .toList()

    println(number)

    var text = "hello {name}"

    fun correctStyle(text: String) = text
            .replace("hello", "hello,")

    fun greet(name: String) {
        text.replace("{name}", name)
                .let { correctStyle(it) }
                .capitalize()
                .let {  print(it) }
    }

    greet("reader") // Prints: Hello, reader



}