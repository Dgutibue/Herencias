package Empresa

abstract class Persona2 {
    var nombre: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do{
                    println("El nombre no puede estar en blanco.")
                    field = readln()
                }while(field == "")
            }
        }
    var apellidos: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do{
                    println("El apellido no puede estar en blanco.")
                    field = readln()
                }while(field == "")
            }
        }
    var DNI: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do{
                    println("El DNI no puede estar en blanco.")
                    field = readln()
                }while(field == "")
            }
        }
    constructor(){
        this.nombre = "sin nombre"

    }
    constructor(nombre: String, apellidos: String, DNI: String){
        this.nombre = nombre
        this.apellidos = apellidos
        this.DNI = DNI
    }
    abstract fun mostrar_info(): String
}