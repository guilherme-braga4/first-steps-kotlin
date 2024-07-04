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
}