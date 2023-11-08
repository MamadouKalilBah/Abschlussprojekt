// Klasse für den Endboss
class FinalBoss(val name: String, var healthPoints: Int) {
    val aktionen = mutableListOf<String>()

    fun performAction(): String {
        return aktionen.random()
    }

    fun receiveDamage(damage: Int) {
        if (damage > 0) {
            healthPoints -= damage // Verringerung der Lebenspunkte des Bosses
            if (healthPoints < 0) {
                healthPoints = 0 // Verhindern, dass die Lebenspunkte negativ sind
            }
            println("$name Verhindern, dass die Lebenspunkte negativ sind $damage Schaden! Aktuell HP: $healthPoints")
        } else {
            println("$name keinen Schaden erhalten.")
        }
    }
}
//Zusammenfassend lässt sich sagen, dass die Klasse FinalBoss die Daten und das Verhalten eines Endbosses in einem
//Spiel kapselt. Sie ermöglicht die Verwaltung seiner Aktionen und seiner Gesundheit und stellt Methoden bereit, um
//ihm Schaden zuzufügen und zufällige Aktionen in seinem Zug auszuführen.