package classes

//por default en kotlin no hay herencia se debe habilitar con la palabra open
// si no le pones val es solo un argumento del constructor
// si le pones val se vuelve una property
class SmartPhone(number: Int, val isPrivate:Boolean): Phone(number) {

    override fun showNumber(){
        if(isPrivate) println("Desconocido") else
            super.showNumber()
    }

}