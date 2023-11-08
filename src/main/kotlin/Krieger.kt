class Warrior(name: String) : Hero(name, 150) {
    companion object{
        const val Angriff_Aktion = "Schwertangriff"
        const val Verteidigen_Aktion = "Verteidigung"
    }
    init {
       aktionen.addAll(listOf(Angriff_Aktion, Verteidigen_Aktion))
    }
    fun swordAttack(): String {
        return "$name führt einen Schwertangriff aus !"
    }

    override fun verteidigen(): String {
        return "$name geht in Verteidigungsposition !"
    }
}
//Zusammenfassend lässt sich sagen, dass die Klasse Warrior die Funktionalität der Klasse
// Hero erweitert, indem sie spezifische Aktionen des Kriegers, klassenbezogene Konstanten
// und benutzerdefinierte Methoden für die Angriffs- und Verteidigungsaktionen des Kriegers
// hinzufügt.