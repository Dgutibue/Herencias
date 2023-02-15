package Empresa

fun main(args: Array<String>){
    val empleado1 = Empleado2("Faemino","Gordillo","75648392F", "01/04/2022", 1100f, 5, 10f)
    println(empleado1.mostrar_info())
    val director = Directivo("Florencio", "Bernabeu", "45693067Y", "21/11/2022", 1800f, 15, 12f, 200f, 200f, "Director general autonómico")
    println("******************************")
    director.imprimirNomina()
    println("*************************************")
    println(director.mostrar_info())
    val programador = Programador("Amanacio", "Perez", "82547042D", "15/04/2020", 1800f, 10, 18f)
    println("******************************")
    programador.imprimirNomina()
    println("*************************************")
    println(programador.mostrar_info())

}