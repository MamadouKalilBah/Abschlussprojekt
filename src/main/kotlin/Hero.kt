// Basisklasse für Helden
open class Hero(val name: String, var healthPoints: Int) {
    val aktionen = mutableListOf<String>()

    open fun performAction(): String {
        return aktionen.random()
    }
}