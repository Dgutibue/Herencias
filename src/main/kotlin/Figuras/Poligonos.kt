package Figuras

open class Poligonos: Figura() {
    open var numeroLados: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0){
                do{
                    println("Los lados no pueden ser 0 o menores que 0")
                    field = readln().toInt()
                }while(field <= 0)
            }
        }
    open var longitud: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0f){
                do{
                    println("La longitud no pueden ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0f)
            }
        }
    var apotema: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field <= 0f){
                do{
                    println("La apotema no puede ser 0 o menor que 0")
                    field = readln().toDouble()
                }while(field <= 0f)
            }
        }
    override fun calculaPermitro(): Double{
        val perimetro = numeroLados*longitud
        return perimetro
    }
    override fun calculaArea(): Double{
        var area = (calculaPermitro()*apotema)/2
        return area
    }
}