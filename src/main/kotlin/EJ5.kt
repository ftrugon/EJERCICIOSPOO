class Tiempo(hora:Int){
    var hora = 0
        set(value) {
            require(value < 24) { "Un dia no tiene mas de 24 horas" }
            field = value
        }

    constructor(hora: Int, min:Int):this(hora){
        this.min = min
    }
    constructor(hora: Int, min:Int, seg: Int):this(hora,min ){
        this.seg = seg
    }

    var min = 0
        set(value) {
            this.hora += value / 60
            field = value % 60
        }

    var seg = 0
        set(value) {
            this.min += value / 60
            field = value % 60
        }

    override fun toString(): String {
        return "${hora}h, ${min}m, ${seg}s"
    }

}

fun main() {

    val hora = Tiempo(0,73,98)
    println(hora.toString())
}
