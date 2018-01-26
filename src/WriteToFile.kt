import java.io.FileWriter

fun main(args: Array<String>) {
    var message = "Hello Olawale"

    WriteToFile(message)

}

fun WriteToFile(message: String) {

    try {
        var writer = FileWriter("message.txt")
        writer.write(message)
        writer.close()
    } catch (ex: Exception) {
        println("Exception $ex")
    }




}

