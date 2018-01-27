import java.io.FileReader
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {

    println("Enter a message")
    var message = readLine().toString()
    if (message.equals("")) {
        println("Please enter a messge")
    }else{
        WriteToFile(message +"\n")
    }

    readFile()
}

fun WriteToFile(message: String) {

    try {
        var writer = FileWriter("message.txt",true)
        writer.write(message)
        writer.close()
    } catch (ex: Exception) {
        println("Exception $ex")
    }

}

fun readFile() {
    var reader = FileReader("message.txt")
    var readMessage: String? = null
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        } while (char != -1)

    } catch (ex: Exception) {
        print(ex.message)
    }
}

fun readFromFile() {
    val stream = Files.newInputStream(Paths.get("message.txt"))
    stream.buffered().reader().use {
        reader -> println(reader.readText())
    }
}