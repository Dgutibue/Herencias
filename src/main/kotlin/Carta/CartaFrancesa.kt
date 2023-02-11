package Carta

class CartaFrancesa: CartaGenerica() {
    override var palo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if (field !in ("Picas, Corazones, Rombos, Trebol")) {
                do {
                    println("Palo inválido, ingrese uno valido")
                    field = readln()
                } while (field == "")
            }
        }
    override var numero: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if (field !in 1..13) {
                do {
                    println("Número de carta incorrecto, ingrese de nuevo")
                    field = readln().toInt()
                } while (field !in 1..13)
            }

        }

    override fun mostrarCarta() {
        var numero = ""
        when (this.numero){
            1 -> numero = "As"
            11 -> numero = "Sota"
            12 -> numero = "Caballo"
            13 -> numero = "Rey"
        }
        println("La carta es el número $numero de $palo")
    }
}