class Rectangulo(base : Int,altura:Int){
    private var base = 0
        set(value) {
            require(value>0)
            field = value
        }
    init {
        this.base = base
    }

    private var altura = 0
        set(value) {
            require(value>0){"La altura tiene que ser mayor a 0"}
            field = value
        }
    init {
        this.altura = altura
    }

    private var area = base * altura

    private var perimetro = (base * 2) + (altura * 2)

    override fun toString(): String {
        return "El area es ${this.area} y el perimetro es ${this.perimetro}"
    }
}

fun main() {
    try {
        val rectangulo1 = Rectangulo(10, 20)
        println(rectangulo1.toString())

        val rectangulo2 = Rectangulo(15, 2230)
        println(rectangulo2.toString())

   }catch (e: IllegalArgumentException){
       println(e.message)
   }
}