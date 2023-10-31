class Warrior(name: String) : Hero(name, 150) {
    init {
        aktionen.addAll(listOf("Schwertangriff", "Verteidigung"))
    }
}