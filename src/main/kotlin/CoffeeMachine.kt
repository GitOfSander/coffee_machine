package machine

val produce = Produce()
val content = Content()

class CoffeeMachine {
    fun init() {
        println("Write action (buy, fill, take, remaining, exit):")
        when(readln().lowercase()) {
            "buy" -> produce.buy()
            "fill" -> content.fill()
            "take" -> content.take()
            "remaining" -> content.remaining()
            "exit" -> return
            else -> println("This is an invalid action!")
        }

        return main()
    }
}