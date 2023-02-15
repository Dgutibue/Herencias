package Figuras

class Triangulo: Poligonos() {
    override var numeroLados: Int = 3
        get() {
            return field
        }
        set(value) {
            field = value
            if(field != 3){
                do{
                    println("El triaungulo no puede tener más de tres lados")
                    field = readln().toInt()
                }while(field != 3)
            }
        }
    var longitud1: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0.0){
                do{
                    println("La longitud no pueden ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }
    var longitud2: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0.0){
                do{
                    println("La longitud no pueden ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }
    var longitud3: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0.0){
                do{
                    println("La longitud no pueden ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }
    var base:Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0.0){
                do{
                    println("La base no puede ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }
    var altura: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0.0){
                do{
                    println("La altura no puede ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0.0)
            }
        }
    override fun calculaPermitro(): Double {
        return longitud1 + longitud2 + longitud3
    }

    override fun calculaArea(): Double {
        var area = (base*altura)/2
        return area
    }
}