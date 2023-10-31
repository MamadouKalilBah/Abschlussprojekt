// Klasse, um die Tasche mit Gegenständen zu verwalten
class HeroBag {
    private val items = mutableListOf<String>()

    fun addItem(item: String) {
        items.add(item)
    }

    fun useItem(hero: Hero) {
        if (items.isNotEmpty()) {
            val item = items.random()
            println("${hero.name} verwendet$item.")
            items.remove(item)
            // Implementieren Sie die Logik für die Auswirkungen des Objekts auf den Helden hier
        }
    }
}