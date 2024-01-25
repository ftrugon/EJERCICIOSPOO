class Coche(color:String,
            marca:String,
            modelo:String,
            private val numcaballos:Int,
            private val numpuertas:Int,
            private val matricula:String
){

    private var color:String = color
        set(value) {
            require(value.isNotEmpty()) {"Color no debe ser un campo vacio"}
            field = value
        }

    private var marca: String = marca
        get() = field.uppercase()

    private var modelo:String = modelo
        get() = field.uppercase()


    init {
        require(marca.trim().isNotBlank()) {"Marca no puede ser blanco ni nulo."}
        require(modelo.trim().isNotEmpty()) {"Modelo no puede ser blanco ni nulo."}
        require(numcaballos in 70..700) {"Los caballos tienen que oscilar entre 70 y 700"}
        require(numpuertas in 3..5) {"Las puertas tienen que oscilar entre 3 y 5"}
        require(matricula.trim().isNotBlank()) {"Matricula no puede ser nula."}
        require(matricula.length <= 7) {"Matricula no puede tener mas de 7 caracteres"}
        require(color.isNotBlank()) {"El color no puede estar vacio"}
    }


    override fun toString(): String {
        return "Coche: \n color: $color \n marca: $marca \n modelo: $modelo \n caballos: $numcaballos \n Puertas: $numpuertas \n matricula: $matricula "
    }
}

fun main() {
    try {
        val coche1 = Coche("azul", "Volkswagen", "ar 205", 130, 5, "2575jkk")
        println(coche1.toString())
    }catch (e:IllegalArgumentException){
        println(e.message)
    }catch (e:Exception){
        println("Error inesperado")
    }
}