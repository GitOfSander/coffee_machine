package machine

const val ESPRESSO = "1"
const val LATTE = "2"
const val CAPPUCCINO = "3"

//var content = Content()

class Produce {
    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")

        when(readln().lowercase()) {
            ESPRESSO -> {
                if (!checkAndUpdateContents(250, 0, 16, 1, 4)) return
            }
            LATTE -> {
                if (!checkAndUpdateContents(350, 75, 20, 1, 7)) return
            }
            CAPPUCCINO -> {
                if (!checkAndUpdateContents(200, 100, 12, 1, 6)) return
            }
            "back" -> {
                return
            }
            else -> println("This product is not available")
        }

        println("I have enough resources, making you a coffee!")
    }

    fun checkAndUpdateContents(water: Int, milk: Int, coffeeBeans: Int, disposableCups: Int, dollar: Int): Boolean {
        var emptyContents = mutableListOf<String>()

        if (content.water < water) emptyContents.add("water")
        if (content.milk < milk) emptyContents.add("milk")
        if (content.coffeeBeans < coffeeBeans) emptyContents.add("coffee")
        if (content.disposableCups < disposableCups) emptyContents.add("disposable cups")

        val size = emptyContents.size
        if (size > 0) {
            var stringOfEmptyContents = "Sorry, not enough "

            if (size == 1) {
                stringOfEmptyContents += emptyContents[0] + "!"
            } else {
                stringOfEmptyContents = emptyContents.joinToString(prefix = stringOfEmptyContents, postfix = " and ${emptyContents.last()}!", separator = ", ", truncated= "", limit = size - 1 )
            }

            println(stringOfEmptyContents)

            return false
        }

        content.updateContents(water, milk, coffeeBeans, disposableCups, dollar)

        return true
    }
}