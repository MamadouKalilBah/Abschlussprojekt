// Zusammenfassend lässt sich sagen, dass diese Funktion main() einen rundenbasierten Kampf
// zwischen den Spielern (Zauberer und Krieger) und dem Endboss steuert, bei dem die Aktionen
// und der Schaden durch Entscheidungen und Berechnungen auf der Grundlage der ausgeführten
// Aktionen bestimmt werden. Die Schleife wird so lange fortgesetzt, bis die Gesundheit des
// Zauberers, des Kriegers oder des Endbosses auf Null sinkt und damit das Ende des Spiels signalisiert.
fun main() {
    println("..........Willkommen bei Golden Syntax Kampfspiel..........")

    val mage = Mage("Mariam Barry")
    val warrior = Warrior("Mamadou Alpha Bah")
    val heroBag = HeroBag()
    heroBag.addItem("Heiltrank")
    heroBag.addItem("Vitaminen")
    val finalBoss = FinalBoss("Mamadou Kalil Bah", 500)
    finalBoss.aktionen.addAll(listOf("Flächenangriff", "Fluch", "Unterboss beschwören"))
    var round = 1

    while (mage.healthPoints > 0 && warrior.healthPoints > 0 && finalBoss.healthPoints > 0) {
        println("Round $round")
        println("Wähle eine Aktion für Magier (1), Krieger (2), Gegenstand verwenden für Magier (3)," +
                " Gegenstand verwenden für Krieger (4)):")
        val heroAction = readln()

        when (heroAction) {
            "1" -> {
                val action = mage.performAction()
                println("${mage.name} wählt $action.")
                val bossAction = finalBoss.performAction()
                val schaden = schadenberechnen(action, bossAction) // Berechne den Schaden, den der Magier dem Boss zufügt
                finalBoss.receiveDamage(schaden)
            }
            "2" -> {
                val action = warrior.performAction()
                println("${warrior.name} wählt $action.")
                val bossAction = finalBoss.performAction()
                val schaden = schadenberechnen(action, bossAction) // Berechne den Schaden, den der Krieger dem Boss zugefügt hat
                finalBoss.receiveDamage(schaden)
            }
            "3" -> heroBag.useItem(mage)
            "4" -> heroBag.useItem(warrior)
            else -> println("Ungültige Auswahl!")
        }

        if (finalBoss.healthPoints > 0) {
            val bossAction = finalBoss.performAction()
            val heroAction = mage.performAction() // Beispiel: Der Boss greift immer den Magier an
            val schaden = schadenberechnen(bossAction, heroAction) // Berechne den Schaden, den der Boss dem Magier zufügt
            mage.schadenerhalten(schaden)
        }

        kampfstatusanzeigen(mage, warrior, finalBoss) // Anzeige des aktualisierten Kampfstatus
        round++
    }
}
fun schadenberechnen(attackerAction: String, targetAction: String): Int {
    // Initialisierung von Schäden
    var schaden = 0
    // Bewertung der Aktionen des Angreifers und des Ziels, um den Schaden zu ermitteln
    when (attackerAction) {
        "Flächenangriff" -> {
            schaden = when (targetAction) {
                // Bewertung der verschiedenen Aktionen des Bosses und Zuweisung von Schaden
                "EtwasBoss-Action" -> 50 // Beispiel für den durch eine bestimmte Aktion verursachten Schaden
                // andere Aktionen und damit verbundene Schäden
                else -> 20 // Standardschaden für die Aktion des Bosses
            }
        }
        "AndereAngreiferAktion" -> {
            // Logik für eine weitere Angriffsaktion und den damit verbundenen Schaden
        }
        // Weitere Aktionen des Angreifers und ihr jeweiliger Schaden
        else -> schaden = 10 // Standardschaden für die Aktion des Angreifers
    }

    return schaden
}
fun kampfstatusanzeigen(mage: Mage, warrior: Warrior, finalBoss: FinalBoss) {
    println("Mage - ${mage.name}: HP - ${mage.healthPoints}")
    println("Warrior - ${warrior.name}: HP - ${warrior.healthPoints}")
    println("Final Boss - ${finalBoss.name}: HP - ${finalBoss.healthPoints}")
}