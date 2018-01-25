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





}