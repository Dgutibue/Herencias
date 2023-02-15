package restaurante

open class Menu(Primero : String, Segundo : Int, Tercero : Int) {
    private val IVA = 0.21
    var descuento = 0.15
    var principal : String = ""
        get() = field
        set(value) {
            if (value !in arrayOf("Entrecot", "Pez Espada", "Carrilada", "Dorada")) field = "Otros" else field = value
        }
    protected val precios_primero = mapOf<String,Double>("Entrecot" to 15.0, "Pez Espada" to 12.0, "Carrillada" to 10.0, "Dorada" to 20.0, "Otros" to 13.0)
    var bebida : Int = 0
        get() = field
        set(value) {
            if (value !in arrayOf(1,2)) field = 3 else field = value
        }
    protected var equivalentesBebida = mutableMapOf<Int, String>(1 to "Refresco", 2 to "Vino", 3 to "Otros")
    protected val preciosBebida = mapOf<Int, Double>(1 to 1.0, 2 to 1.5, 3 to 2.0)
    var postre : Int = 0
        get() = field
        set(value) {
            if (value !in arrayOf(1,2)) field = 3 else field = value
        }
    protected val equivalentesPostres = mapOf<Int, String>(1 to "Fruta", 2 to "Helado", 3 to "Otros")
    protected val preciosPostre = mapOf<Int, Double>(1 to 2.0, 2 to 3.0, 3 to 4.0)


    init {
        principal = Primero
        bebida = Segundo
        postre = Tercero
    }

    constructor(): this("",0,0)

    open fun importe():Float{
        var suma = 0.0
        suma += precios_primero[principal]!!.toDouble() + preciosBebida[bebida]!!.toDouble() + preciosPostre[postre]!!.toDouble()
        suma = suma + (suma*IVA)
        return (suma - (suma*descuento)).toFloat()
    }

    open fun mostrar():String{
        return "El menú consta de $principal, ${equivalentesBebida[bebida]} de beber , y ${equivalentesPostres[postre]} de postre ${importe()}"
    }

}