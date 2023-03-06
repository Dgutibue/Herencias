package Tienda

abstract class Producto(nombre: String, precio: Double) {
    var nombre: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            while (field == ""){
                println("El campo nombre no puede estar vacio.")
                field = readln()
            }
        }
    var precio: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0){
                while (field <= 0){
                    println("El campo precio no puede ser 0 o menor que 0")
                    field = readln().toDouble()
                }
            }
        }
    init {
        this.nombre = nombre
        this.precio = precio
    }
    abstract fun calcular(cant_prod: Int): Double
}