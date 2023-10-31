// Klasse für den Endboss
class FinalBoss(val name: String, var healthPoints: Int) {
    val aktionen = mutableListOf<String>()

    fun performAction(): String {
        return aktionen.random()
    }
}