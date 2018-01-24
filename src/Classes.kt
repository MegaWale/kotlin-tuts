import javafx.scene.text.FontWeight
import java.awt.Button

fun main(args: Array<String>) {
/*

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

    open class Plant {
        open var height: Int = 0
        open fun grow(height: Int) {}
    }

    class Tree: Plant() {
        final override var height: Int
            get() = super.height
            set(value) { field = value }

        final override fun grow(height: Int) {
            this.height += height
        }
    }

    class Oak: Tree() {

    }



    abstract class Plant1 {
        var height: Int = 0

        abstract fun grow(height: Int)
    }

    class Tree: Plant1() {
        override fun grow(height: Int) {
            this.height += height
        }
    }

    val plant = Plant1()
    // error: abstract class can't be instantiated
    val tree = Tree()

    class User: EmailProvider {
        override fun validateEmail() {
            //email validation
        }
    }

    open class Persona {
        interface EmailProvider {
            fun validateEmail()
        }

        class User: Persona(), EmailProvider {
            override fun validateEmail() {
                //email validation
            }
        }
    }

    class User() : EmailProvider {

        override val email: String = "UserEmailProvider"

        override fun validateEmail() {
            //email validation
        }
    }

    class User(override val email: String) : EmailProvider {
        override fun validateEmail() {
            //email validation
        }
    }

    interface A {
        fun foo() {
            println("A")
        }
    }

    interface B {
        fun foo() {
            println("B")
        }
    }

    class Item: A, B {
        override fun foo() {
            println("Item")
        }
    }

    //Usage
    val item = Item()
    item.foo() //prints: Item


    class Item : A, B {
        override fun foo() {
            val a = super<A>.foo()
            val b = super<B>.foo()
            print("Item $a $b")
        }
    }

    //Usage
    val item = Item()
    item.foo()

    //Prints: A
    //        B
    //        ItemsAB

    //normal class
    class Product(var name: String, var price: Double)

    //data class
    data class Product(var name: String, var price: Double)

    class ProductDetailActivity {
        companion object {

        }
    }
*/





}