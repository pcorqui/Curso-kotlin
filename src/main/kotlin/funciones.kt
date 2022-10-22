import kotlin.math.abs

fun main(){

    newTopic("funciones")
    //println(sum(2,4))
    val a = 5
    val b = 6
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")
    println("$a - $b = ${suboptimizada(a,b)}")

    newTopic("infix")
    val c = -3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a,c.enableAbs(false))}")
    println("$a + ${c.enableAbs(true)} = ${sum(a,c.enableAbs(true))}")
}

fun newTopic(s: String) {
    println("************* ${s} ***************");
}

//por default las funciones en kotlin son public
//unit es similar a void no es necesaria por que ya va implicita
private fun sayHello(): Unit{
    println("Hola kotlin")
}

//demostracion de funciones que devuelvan un tipo
fun sum(a: Int, b: Int): Int{
    val c = a + b
    return c
}

fun sub(a: Int, b: Int): Int{
    return a - b
}

fun suboptimizada(a:Int, b:Int) = a -b

//funciones infix
//solo se puede pasar un parametro
//dentro de kotlin no existe el operador ternario
//sirven para agregar funciones a la clase
infix fun Int.enableAbs(enable:Boolean) = if (enable) abs(this) else this