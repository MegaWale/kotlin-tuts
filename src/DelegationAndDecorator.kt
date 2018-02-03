fun main(args: Array<String>) {

    interface  Player {     //1
        fun playGame()       //2
    }

    class RpgGamePlayer(val enemy: String) : Player {
        override fun playGsme() {
            println("Killing enemy")
        }
    }

    class witcherPlayer(enemy: String) : Player {
        val player = RpgGamePlayer(enemy)       //2

        override fun playGame() {
            player.playGsme()       //3
        }

    }

    fun SomeDelegate()

    var a by SomeDelegate() //1
    fun someTopLevelFun() {
        var b by SomeDelegate()  //2
    }

    class someClass() {
        var c by SomeDelegate() //3

        fun someMethod() {
            val d by SomeDelegate()  //4
        }
    }


}