package classes

import newTopic

fun main(){
    newTopic("Classes")
    // se pone en gris por que es redundante
    val phone:Phone = Phone(12345)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("herencia")
    val smartPhone = SmartPhone(45678, true)
    smartPhone.call()

    newTopic("sobreescritura")
    smartPhone.showNumber()
    println("Private?  ${smartPhone.isPrivate}")
}