class Empleado(): Persona() {
    protected var fechaContrato: String = "18/3/1991"
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == ""){
                do {
                    println("Fecha incorrecta. Por favor escriba una válida")
                    field = readln()
                }while(field == "")
            }
        }
    protected var sueldoBase: Double = 100.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0.0){
                do {
                    println("Sueldo incorrecto. Por favor escriba uno válido")
                    field = readln().toDouble()
                }while(field == 0.0)
            }
        }
    protected var baseHorasExtras: Double = 5.0
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0.0){
                do {
                    println("Base de horas incorrecta. Por favor escriba uno válida")
                    field = readln().toDouble()
                }while(field == 0.0)
            }
        }
    protected var horasExtras: Int = 1
        get() {
            return field
        }
        set(value) {
            field = value
            if(field == 0){
                do {
                    println("Horas incorrectas. Por favor escriba una válida")
                    field = readln().toInt()
                }while(field == 0)
            }
        }
    constructor(nombre: String, apellido: String, DNI: String, fechaContrato: String, sueldoBase: Double, baseHorasExtras: Double, horasExtras: Int):this() {
        this.nombre = nombre
        this.apellido = apellido
        this.DNI = DNI
        this.fechaContrato = fechaContrato
        this.sueldoBase = sueldoBase
        this.baseHorasExtras = baseHorasExtras
        this.horasExtras = horasExtras
    }
    fun calcularSueldo():Double{
        val sueldoTotal = sueldoBase + (baseHorasExtras*horasExtras)
        return sueldoTotal
    }
}