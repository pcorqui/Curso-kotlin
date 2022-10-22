package classes

//nombre de la clase debe coincidir con el nombre del archivo
//protected solo sera accesible para esta clase y quienes hereden de ella
open class Phone(protected val number:Int ) {

    fun call(){
        println("llamando")
    }

    //para poder sobreescribir en las subclases hijas debes colocar la palabra open
    open fun showNumber(){
        println("mi numero es : $number")
    }

}