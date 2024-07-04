import kotlin.reflect.typeOf

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
}