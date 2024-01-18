class Persona (peso:Float,altura:Float){
    var peso = peso
        set(value) {
            require(value>0){"El peso no puede ser negativo"}
            field = value
        }

    var altura = altura
        set(value) {
            require(value>0){"El peso no puede ser negativo"}
            field = value
        }

    var nombre :String = ""

    var imc:Float = this.peso/(this.altura*this.altura)

    constructor(peso:Float,altura:Float, nombre:String):this(peso,altura) {
        this.nombre = nombre
    }

    //override fun toString(): String {
    //    if (this.nombre.isEmpty()) {
    //        print("Dime tu nombre: ")
    //        this.nombre = readln()
    //    }
    //}

    fun setnombre(){
        if (this.nombre.isEmpty() || this.nombre.isNotEmpty()) {
            print("Dime tu nombre: ")
            this.nombre = readln()
        }
    }

    //fun setpeso(){
    //    print("Dime tu peso: ")
    //    this.peso = readln().toFloat()
    //}

    fun setaltura(){
        print("Dime tu altura: ")
        this.altura = readln().toFloat()
        imcactualiz()
    }

    private fun imcactualiz(){
        this.imc = this.peso/(this.altura*this.altura)
    }


}

fun main() {

    val persona1 = Persona(76F,1.72F)
    persona1.setnombre()
    println("${persona1.nombre}, ${persona1.peso}, ${persona1.altura}")
    println()

    val persona3 = Persona(76f,1.79f,"WALTER WHITE")
    println("${persona3.nombre}, ${persona3.peso}, ${persona3.altura}, ${persona3.imc}")
    persona3.setaltura()
    println("${persona3.nombre}, ${persona3.peso}, ${persona3.altura}, ${persona3.imc}")
    println()

    val persona2 = Persona(89f,1.79f,"JESSE")


}