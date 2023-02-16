package Figuras

abstract class Figura {
    abstract fun calculaArea(): Double
    abstract fun calculaPermitro(): Double
}



/*
package Figuras

fun main(args: Array<String>){
    val triangulo = Triangulo()
    println("Triangulo")
    triangulo.altura = 23.8
    triangulo.base = 11.2
    triangulo.longitud1 = 11.2
    triangulo.longitud2 = 13.4
    triangulo.longitud3 = 13.4
    println("El area es: ")
    println(triangulo.calculaArea())
    println("El perimetro es: ")
    println(triangulo.calculaPermitro())
    println("Poligono")
    val poligono = Poligonos()
    poligono.apotema = 10.2
    poligono.longitud = 20.5
    poligono.numeroLados = 8
    println("El perimetro es: ")
    println(poligono.calculaPermitro())
    println("El area es: ")
    println(poligono.calculaArea())
    println("Circulo")
    val circulo = Circulo()
    circulo.radio = 15.1
    println("Diametro")
    println(circulo.obtenerDiametro())
    println("Area")
    println(circulo.calculaArea())
    println("Perimetro")
    println(circulo.calculaPermitro())
    println("Cuadrado")
    val cuadrado = Cuadrado()
    cuadrado.numeroLados = 4
    cuadrado.longitud = 30.3
    println("Area")
    println(cuadrado.calculaArea())
    println("Perimetro")
    println(cuadrado.calculaPermitro())
}
 */