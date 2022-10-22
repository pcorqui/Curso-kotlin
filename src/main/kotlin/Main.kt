
//const val son declaradas en tiempo de compilacion
//mientras val es en tiempo de ejecucion
const  val PI= 3.1416
fun main(args: Array<String>) {
    println("Hello World!")

    //var es de lectura y escritural
    var dinero = 10;
    dinero = 5

    //val es de solo lectura
    val nombre = "maria";

    println(dinero)

    //tipos de datos en kotlin
    val boolean = true
    val numeroLargo = 4L
    val double: Double = 2.7182
    val float: Float = 1.1f

    //en kotlin todo es un objeto

    val primerValor = 20
    val segundoValor = 100
    val tercerValor = primerValor.minus(segundoValor)
    print(tercerValor)
}