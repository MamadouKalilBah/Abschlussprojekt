// Basisklasse für Helden
open class Hero(val name: String, var healthPoints: Int) {
    val aktionen = mutableListOf<String>()
    open fun performAction(): String {
        return aktionen.random()
    }
    open fun attack(): String {
        return "$name Angriff !"
    }
    open fun verteidigen(): String {
        return "$name wehrt sich !"
    }
    open fun heal(): String {
        return "$name pflegt sich !"
    }
}
//Zusammenfassend lässt sich sagen, dass die Hero-Klasse eine gemeinsame Grundstruktur
//für die Helden eines Spiels bietet, mit offenen Funktionen, die es abgeleiteten Klassen
//ermöglichen, die für jeden Heldentyp spezifischen Aktionen, Angriffe, Verteidigungen und
//Heilungen anzupassen, während allgemeine Eigenschaften, die allen Helden gemeinsam sind,
//beibehalten werden.