import kotlin.reflect.typeOf
class Foods(ingredient: String) {
    init {
        println("The ingredient is $ingredient")
    }
}

class Fastfood {
    val foodShop: String

    constructor(formula: String, posologia: String) {
        this.foodShop = formula
    }
}

fun main() {
    val namesList: MutableList<String> = mutableListOf("Gui", "Rafa", "Gabriel")
    println(namesList)
    println(namesList.last())
    println(namesList[1])
    println(namesList.count())
    namesList.add("Silvio")
    println("I've add a new name on list: $namesList")

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
    juiceMenu.remove("orange")    // Remove key "orange" from the map
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println(juiceMenu)
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val index = 2
    println("$index is spelt as '${number2word[index]}'")

    val word2number = mapOf("one" to 1, "two" to 3, "fifty" to 50)
    val stringNumber = "fifty"
    println("$stringNumber has value of '${word2number[stringNumber]}'")

    println(Foods("bread", true))
}