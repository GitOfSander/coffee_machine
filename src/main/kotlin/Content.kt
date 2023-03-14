package machine

class Content {
    var water: Int = 400
    var milk: Int = 540
    var coffeeBeans: Int = 120
    var disposableCups: Int = 9
    var dollar: Int = 550

    fun updateContents(_water: Int, _milk: Int, _coffeeBeans: Int, _disposableCups: Int, _dollar: Int) {
        water -= _water
        milk -= _milk
        coffeeBeans -= _coffeeBeans
        disposableCups -= _disposableCups
        dollar += _dollar
    }

    fun remaining() {
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$coffeeBeans g of coffee beans")
        println("$disposableCups disposable cups")
        println("${"$"}$dollar of money")
    }

    fun fill() {
        println("Write how many ml of water you want to add:")
        water += readln().toInt()

        println("Write how many ml of milk you want to add:")
        milk += readln().toInt()

        println("Write how many grams of coffee beans you want to add:")
        coffeeBeans += readln().toInt()

        println("Write how many disposable cups you want to add:")
        disposableCups += readln().toInt()
    }

    fun take() {
        println("I gave you ${"$"}$dollar")

        dollar = 0
    }
}