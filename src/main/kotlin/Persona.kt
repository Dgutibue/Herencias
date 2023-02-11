open class Persona() {
    protected var nombre: String = "empleado"
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do {
                    println("Nombre incorrecto. Por favor escriba uno válido")
                    field = readln()
                }while(field == "")
            }
        }
    protected var apellido: String = "empleado"
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do {
                    println("Apellido incorrecto. Por favor escriba uno válido")
                    field = readln()
                }while(field == "")
            }
        }
    protected var DNI: String = "99999999P"
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == "" || field.length < 9){
                do {
                    println("DNI incorrecto. Por favor escriba uno válido")
                    field = readln()
                }while(field == "")
            }
        }
    constructor(nombre: String, apellido: String, DNI: String): this(){
        this.nombre = nombre
        this.apellido = apellido
        this.DNI = DNI
    }
    fun mostrar(){
        println("El DNI de $nombre $apellido es $DNI")
    }

}