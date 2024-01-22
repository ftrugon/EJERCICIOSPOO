class Coche(color:String, marca:String, modelo:String, numcaballos:Int, numpuertas:Int, matricula:String){
    private var color = ""
        set(value) {
            require(value.isNotEmpty()) {"Color no debe ser un campo vacio"}
            field = value
        }

    private var marca = ""
        get() = field.uppercase()
        set(value) {
            require(value.trim().isNotEmpty()) {"Marca no puede ser blanco ni nulo."}
            field = value
        }


    private var modelo = ""
        get() = field.uppercase()
        set(value) {
            require(value.trim().isNotEmpty()) {"Modelo no puede ser blanco ni nulo."}
            field = value
        }


    private var numcaballos = 0
        set(value) {
            require(true) {"Num de caballos no puede ser nulo"}
            require(value in 71..700) {"Los caballos tienen que oscilar entre 70 y 700"}
            field = value
        }


    private var numpuertas = 0
        set(value) {
            require(true) {"Num de puertas no puede ser nulo de caballos no puede ser nulo"}
            require(value in 3..5) {"Las puertas tienen que oscilar entre 3 y 5"}
            field = value
        }


    private var matricula = ""
        set(value) {
            require(value.trim().isNotEmpty()) {"Matricula no puede ser nula."}
            require(value.length <= 7) {"Matricula no puede tener mas de 7 caracteres"}
            field = value
        }
    init {
        this.matricula = matricula
        this.color = color
        this.marca = marca
        this.modelo = modelo
        this.numcaballos = numcaballos
        this.numpuertas = numpuertas
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