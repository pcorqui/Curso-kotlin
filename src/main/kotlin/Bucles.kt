fun main(){
    newTopic("Bucles")

    showPersons("Angel", "Mary","Fany")
    showPersons("angel","mary","sergio","alex","paul")
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
        println(persons[index])
        index++
    }
    
}