fun main(){

    newTopic("Kotlin")
    newTopic("Java")
    newTopic("languages funtionales")
    newTopic("android")

    //println(sum(2,4))
    val a = 5
    val b = 6
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")
    println("$a - $b = ${suboptimizada(a,b)}")
}

fun newTopic(s: String) {
    println("hello ${s}");
    sayHello()
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