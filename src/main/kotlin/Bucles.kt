//const es compilada en tiempo de compilacion
//mientras val es en tiempo de ejecucion
//cuando la variable es constante es mejor hacerla global const val
const val separator = "***************"

fun main(){
    newTopic("Bucles")

    showPersons("Angel", "Mary","Fany")
    showPersons("angel","Mary","sergio","alex","paul")
}

fun showPersons(p1: String, p2:String, p3:String){
    println(p1)
    println(p2)
    println(p3)
}

//pasar arreglo de variables
//kotlin acepta argumentos variables
fun showPersons(vararg persons: String){
    newTopic("For")
    //ciclo for
    for(person in persons){
        println(person)
    }

    newTopic("While")
    var index = 0
    while (index < persons.size){
        if (persons[index] == "Mary") println("Es mary")
        println(persons[index])
        index++
    }

    //sentencia when equivalente a Switch
    newTopic("When")
    index = (0..persons.size -1).random()
    when(persons[index]){
        "angel" -> println("Es angel")
        "Mary" -> {
            println("ir a otra pantalla")
            println("2+4")
        }
        else -> println(persons[index])
    }
}