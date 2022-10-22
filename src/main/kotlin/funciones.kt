fun main(){

    newTopic("Kotlin")
    newTopic("Java")
    newTopic("languages funtionales")
    newTopic("android")
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
