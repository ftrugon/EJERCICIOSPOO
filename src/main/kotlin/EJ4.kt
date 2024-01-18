class Coche(color:String, marca:String, num_caballos:Int, num_puertas:Int, matricula:String){
    var color = ""
        set(value) {

        }
    init {
        this.color = color
    }

    var marca = ""
        set(value) {

        }
    init {
        this.marca = marca
    }

    var num_caballos = 0
        set(value) {

        }
    init {
        this.color = color
    }

    var num_puertas = 0
        set(value) {

        }
    var matricula = ""
        set(value) {

        }

}

fun main() {
    var coche1 = Coche("Azul","Volkswagen",130,2,"2357jkk")

}