class PersonaEJ2 (var peso:Double, var altura:Double){
    private var nombre :String = ""
    private var imc:Double

    init {
        this.imc = this.peso/(this.altura*this.altura)
    }


    constructor(peso:Double,altura:Double, nombre:String):this(peso,altura) {
        this.nombre = nombre
    }

    /**
     * Pide el nombre para cambiarlo
     */
    fun setnombre(){
        if (this.nombre.isEmpty()) {
            print("Dime tu nombre: ")
            this.nombre = readln()
        }
    }

    fun setpeso(){
        print("Dime tu peso: ")
        this.peso = readln().toDouble()
    }

    fun setaltura(){
        print("Dime tu altura: ")
        this.altura = readln().toDouble()
    }

    fun IMCACTUALIZADO(){
        this.imc = this.peso/(this.altura*this.altura)
    }

    fun saludar(){
        println("Hola, soy ${this.nombre}")
    }

    fun obtenerImc() = "%.2f".format(this.imc)

    fun mostrardesc(){
        println("$nombre pesa ${this.peso}Kg, mide $altura m y tiene un IMC de ${obtenerImc()} ${obtenerImcDesc()}")
    }

    private fun obtenerImcDesc():String{
        return when{
            this.imc in 1.0..18.5 -> "(peso insuficiente)"
            this.imc in 18.6..24.9 -> "(peso saludable)"
            this.imc in 25.0..29.9 -> "(sobrepeso)"
            this.imc > 30.0-> "(obesidad)"
            else -> "(peso no existente)"
        }
    }

}

fun main() {

    val persona1 = PersonaEJ2(76.0,1.72,"Julia")
    persona1.saludar()
    persona1.mostrardesc()


    val persona2 = PersonaEJ2(76.0,1.7,"alberto")
    persona2.mostrardesc()


}