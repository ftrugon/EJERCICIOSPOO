import java.lang.NullPointerException

class Persona (var peso:Float, var altura:Float){
    var nombre :String = ""
    var imc:Float
    init {
        this.imc = this.peso/(this.altura*this.altura)
    }


    constructor(peso:Float,altura:Float, nombre:String):this(peso,altura) {
        this.nombre = nombre
    }

    fun setnombre(){
        if (this.nombre.isEmpty()) {
            print("Dime tu nombre: ")
            this.nombre = readln()
        }
    }

    fun setpeso(){
        print("Dime tu peso: ")
        this.peso = readln().toFloat()
    }

    fun setaltura(){
        print("Dime tu altura: ")
        this.altura = readln().toFloat()
    }

    fun IMCACTUALIZADO(){
        this.imc = this.peso/(this.altura*this.altura)
    }


}

fun main() {

    val persona1 = Persona(76F,1.72F)
    persona1.setnombre()
    println()

    val persona2 = Persona(76f,12f,"alberto")
    println("${persona2.nombre} ${persona2.peso} ${persona2.altura}")
    println()


    try {
        val persona3 = Persona(76f,1.72f,"persona")
        println(persona3.imc)
        persona3.setpeso()
        persona3.setaltura()
        persona3.IMCACTUALIZADO()
        println(persona3.imc)
    }catch (e:Exception){
        println("Error")
    }
}