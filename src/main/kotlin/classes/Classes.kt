package classes

import newTopic

fun main(){
    newTopic("Classes")
    // se pone en gris por que es redundante
    val phone:Phone = Phone(12345)
    phone.call()
    phone.showNumber()
    println(phone.number)
}