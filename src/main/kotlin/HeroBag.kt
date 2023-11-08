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
//Zusammenfassend lässt sich sagen, dass die Klasse HeroBag die Sammlung von Gegenständen verwaltet,
// die ein Held besitzen kann. Sie ermöglicht das Hinzufügen von Gegenständen zur Tasche des Helden,
// die zufällige Auswahl eines Gegenstandes, den ein Held benutzen soll, erfordert jedoch die
// Implementierung der spezifischen Logik für die Auswirkungen dieser Gegenstände auf die Helden,
// um voll funktionsfähig zu sein.