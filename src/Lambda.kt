import java.math.BigDecimal
import java.util.concurrent.atomic.DoubleAccumulator
private fun fold(
        numbers: List<BigDecimal>,
        start: BigDecimal,
        accumulator: (BigDecimal, BigDecimal) -> BigDecimal
): BigDecimal {
    var acc = start
    for (num in numbers) {
        acc = accumulator(acc, num)
    }
    return acc
}

data class User(val name: String, val surname: String)
typealias Users = List<User>
typealias Weight = Double
typealias Length = Int


val users: Users = listOf(
        User("Olawale", "Matt"),
        User("Igor", "Woo")
)

fun calculatePrice(length: Length) {
     //...
}
calculatePrice(10)

val weight: Weight = 54.2
val lenght: Length = 34


inline fun printExecutionTime(f: ()-> Unit) {
    val startTime = System.currentTimeMillis()
    f()
    val endTime = System.currentTimeMillis()
    println("It took " + (endTime - startTime))
}


fun measureOperation() {
    printExecutionTime {
        longOperation()
    }
}

fun boo(f:()->Unit) {
    //...
}

inline fun fooe(before: ()->Unit, noinline f: ()->Unit) {//1
    before()//2
    boo(f) //3
}

fun forEach(list: List<Int>, body: (Int) -> Unit) {
    for (i in list) body(i)
}

//Usage
val list = listOf(1,2,3,4,5)
forEach(list) { print(it) }// Prints: 12345


fun boo(f:()->Unit) {
    //...
}

inline fun foo(crossinline f: () -> Unit) {
    boo { println("A"); f() }
}



fun main(args: Array<String>) {





    // Higher order function
    fun sum(numbers: List<BigDecimal>) =
            fold(numbers, BigDecimal.ZERO) { acc, num -> acc + num }

    fun prod(numbers: List<BigDecimal>) =
            fold(numbers, BigDecimal.ONE) { acc, num -> acc * num }

    // Usage

    fun BD(i: Long) = BigDecimal.valueOf(i)
    val numbers = listOf(BD(1), BD(2), BD(3), BD(4))
    println(sum(numbers))       // Prints: 10
    println(prod(numbers))      // Prints: 24

    fun <T> filter(list: List<T>, predicate: (T)-> Boolean) {
        var visibleTasks = emptyList<T>()
        for (elem in list) {
            if (predicate(elem))
                visibleTasks += elem
        }
    }

//    val visibleTasks = filter(tasks, { it.active })

    var listeners: List<()->Unit> = emptyList() //1
    fun addListener(listener: ()->Unit) {
        listeners += listener //2
    }

    fun invokeListeners() {
        for(listener in listeners) listener()//2
    }


    fun longOperationAsync(longOperation: ()->Unit, callback: ()->Unit) {
        Thread({    //1
            longOperation() //2
            callback()      //3
        }).start()      //4
    }

    //Usage
    longOperationAsync(
            longOperation = { Thread.sleep(1000L)},
            callback = { print("After second ")} //5, Prints: After second
    )

    println("Now")          //6, Prints: Now

    fun getAndFillList(onStart: ()->Unit = {}, onFinish: ()->Unit={}) {
        //code
    }

    getAndFillList(
            onStart = { view.loadingProgress = true },
            onFinish = { view.loadingProgress = true }
    )

    fun addLogs(tag: String, f: ()-> Unit) {
        println("$tag started")
        val startTime = System.currentTimeMillis()
        f()
        val endTime = System.currentTimeMillis()
        println("$tag finished. It took " + (endTime - startTime))
    }

    //Usage

    addLogs("Some operations") {
        // Operations we are measuring
    }

    //Example of execution
    addLogs("Sleeper"){
        Thread.sleep(1000L)
    }

    //Output

//    Sleeper started
//    Sleeper finished. It took 1001










}

public fun thread(
        start: Boolean = true,
        isDaemon: Boolean = false,
        contextClassLoader: ClassLoader? = null,
        name: String? = null,
        priority: Int = -1,
        block: () -> Unit): Thread {
    // implementation
}

fun greet(){
    print("Hello! ")
}
fun salute(){
    print("Have a nice day ")
}

val todoList: List<() -> Unit> = listOf(::greet, ::salute)
for (task in todoList) {
    task()
}

// Prints: Hello! Have a nice day

object MathHelpers {
    fun isEven(i: Int) = i % 2 == 0
}

class Math {
    companion object {
        fun isOdd(i: Int) = i % 2 == 1
    }
}
// Usage
val evenPredicate: (Int)->Boolean = MathHelpers::isEven
val oddPredicate: (Int)->Boolean = Math.Companion::isOdd
val numbers = 1..10