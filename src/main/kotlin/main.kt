
fun main() {
    val mage = Mage("Gandalf")
    val warrior = Warrior("Conan")
    val heroBag = HeroBag()
    heroBag.addItem("Heiltrank")
    heroBag.addItem("Vitaminen")

    val finalBoss = FinalBoss("Dragon", 500)
    finalBoss.aktionen.addAll(listOf("Flächenangriff", "Fluch", "Unterboss beschwören"))

    var round = 1

    while (mage.healthPoints > 0 && warrior.healthPoints > 0 && finalBoss.healthPoints > 0) {
        println("Round $round")
        val heroAction = readln()
        when (heroAction) {
            "1" -> {
                val action = mage.performAction()
                println("${mage.name} wählt $action.")
                // Implementieren wir die Logik der Handlungen des Helden hier
            }
            "2" -> {
                val aktion = warrior.performAction()
                println("${warrior.name} wählt $aktion.")
                // Implementieren wir die Logik der Handlungen des Helden hier
            }
            "3" -> heroBag.useItem(mage)
            "4" -> heroBag.useItem(warrior)
        }

        val bossAction = finalBoss.performAction()
        println("${finalBoss.name} wählt $bossAction.")
        // Implementieren wir die Logik der Aktionen des Bosses hier

        // Berechnen wir die Auswirkungen von Aktionen, aktualisieren Sie Gesundheitspunkte, zeigen Sie Details an usw.
        round++
    }
}