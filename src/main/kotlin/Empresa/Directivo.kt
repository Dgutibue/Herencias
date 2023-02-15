package Empresa

class Directivo: Empleado2 {
    var plusDireccion: Float = 0f
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0f){
                do{
                    println("El plus no puede ser 0")
                    field = readln().toFloat()
                }while(field == 0f)
            }
        }
    var dietas: Float = 0f
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0f){
                do{
                    println("Las dietas no puede ser 0")
                    field = readln().toFloat()
                }while(field == 0f)
            }
        }
    var cargo: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do{
                    println("Debe de tener un cargo")
                    field = readln()
                }while(field == "")
            }
        }

    constructor(nombre: String, apellido: String, DNI: String, fecha_contrato: String, sueldo_base: Float, num_hora: Int, base_horas_extras: Float, plusDireccion: Float, dietas: Float, cargo: String) :super(nombre,apellido,DNI,fecha_contrato, sueldo_base, num_hora, base_horas_extras){
        this.plusDireccion = plusDireccion
        this.dietas = dietas
        this.cargo = cargo
    }

    override fun calcular_sueldo(): Float {
        return super.calcular_sueldo() + plusDireccion + dietas
    }
    fun imprimirNomina(){
        println("-------------------")
        println("NÓMINA")
        println("-------------------")
        println("DNI: $DNI\nNombre: $apellidos, $nombre\nSueldo: $sueldo_base€\nCargo: $cargo")
    }

    override fun mostrar_info(): String {
        return "Nombre: $nombre\nApellidos: $apellidos\nDNI: $DNI\nFecha de inicio: $fecha_contrato\nSueldo base: $sueldo_base€\nDietas: $dietas€\nplusDireccion: $plusDireccion€\nTotal a cobrar: ${calcular_sueldo()}€"
    }
}