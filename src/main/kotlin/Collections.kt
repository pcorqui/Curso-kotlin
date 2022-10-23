fun main(){
    newTopic("Collections")
    newTopic("Solo lectura")

    //arreglos de solo lectura
    val frutaList = listOf<String>("Manzana", "Banana", "Uva", "Lima")

    println(frutaList.get((0..frutaList.size - 1).random()))
    println("index de Uva es ${frutaList.indexOf("Uva")}")
}