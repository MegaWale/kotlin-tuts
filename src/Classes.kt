import javafx.scene.text.FontWeight
import java.awt.Button

fun main(args: Array<String>) {

    // Using secondary constructor: getters and setters
    class Person {
        var name: String
        var age: Int

        constructor(name: String, age: Int) {
            this.name = name
            this.age = age
        }
    }

    // Using primary contructor
    class Person1 constructor(name: String, age: Int) {
        var name: String
        var age: Int

        init {
            this.name = name
            this.age = age
            println("Person instance created")
        }
    }

    val id = Person1("Wale", 12)
    val name = id.name
    id.name = "Katie"
    println()
    println()

    // Simplified
    class Person2 constructor(name: String, age: Int) {
        var name: String = name
        var age:Int = age
    }


    // Over simplified: in the absence of getters and setters, annotations
    // (@Inject, and so on) or Visibility modifiers (public, private and so on)
    // then the constructor key word can be ommitted

    class Person3 (
            var name: String,
            var age: Int
    )
    class Person4 (
        private var button:
    )

    // lateinit modifier in android
    class MainActivity: AppCompatActivity() {

        private lateinit var button: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            button = findViewById(R.id.button) as Button
            button.text = "Click Me"
        }

        inline val now: Long
        get() {
            println("Time retreived")
            return System.currentTimeMillis()
        }
    }

    class Frui(val weight: Int) {

        constructor(weight: Int, fresh: Boolean):  this(weight) //1

        constructor(weight: Int, fresh: Boolean, color: String): this(weight, fresh) //2
    }


    class ProductView: View {
        constructor(ctx: Context) : super(ctx)
        constructor(ctx: Context, attrs : AttributeSet) : super(ctx, attrs)
    }
}