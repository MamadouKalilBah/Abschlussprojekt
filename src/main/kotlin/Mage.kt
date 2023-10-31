// Spezielle Klassen für Heldentypen
class Mage(name: String) : Hero(name, 100) {
    init {
        aktionen.addAll(listOf("Feuerzauber", "Eiszauber"))
    }
}