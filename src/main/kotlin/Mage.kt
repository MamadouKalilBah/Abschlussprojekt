// Spezielle Klassen für Heldentypen
class Mage(name: String) : Hero(name, 100) {
    companion object {
        const val FIRE_SPELL = "Feuerzauber"
        const val ICE_SPELL = "Eiszauber"
    }

    init {
        aktionen.addAll(listOf(FIRE_SPELL, ICE_SPELL))
    }

    fun feuerzauberwirken(): String {
        return "$name wirkt einen Feuerzauber !"
    }

    fun eiszauberwirken(): String {
        return "$name wirkt einen Eiszauber !"
    }

    fun schadenerhalten(schaden: Int) {

    }
}
//Zusammenfassend lässt sich sagen, dass die Klasse Magier die Funktionalität der Klasse
// Hero erweitert, indem sie magier spezifische Aktionen und Zauber, wie Feuer- und Eiszauber,
// hinzufügt und eigene Methoden zum Wirken dieser Zauber einführt.