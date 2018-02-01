




fun main(args: Array<String>) {

    class SimpleList<T: Number>

    //Usage
    var numberList = SimpleList<Number>()
    var intList = SimpleList<Int>()
    var studentList = SimpleList<Double>()
    var stringList = SimpleList<Float>()

    class Action (val name: String)
    class ActionGroup<T: Action>

    // non-nullable type parameter upper bound

    var actionGroupA: ActionGroup<Action>
    var actionGroupB: ActionGroup<Action> // error

    class Box<T>
    open class Animal
    class Dog: Animal()

    /*var animalBox = Box<Animal>()
    var dogBox = Box<Dog>()

    animalBox = dogBox //2, error
    dogBox = animalBox //1, error*/



}