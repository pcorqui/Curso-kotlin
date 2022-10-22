package classes

//nombre de la clase debe coincidir con el nombre del archivo
class Phone(val number:Int, ) {

    fun call(){
        println("llamando")
    }

    fun showNumber(){
        println("mi numero es : $number")
    }

}