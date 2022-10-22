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

    newTopic("Data clasess")
    val myUser = User(0,"Paul", "Cortes",Group.Family.ordinal)
    val bro = myUser.copy(1, "Ivan")
    val friend = bro.copy(2, group = Group.Friends.ordinal)
    println( myUser.component3())
    println(myUser)
    println(bro)
    println(friend)

    //con las funciones de alcance pones el contexto el objeto pasado a la funcion
    newTopic("funciones de alcance")
    with(smartPhone){
        println("private? $isPrivate")
        call()
    }

    /*friend.group = Group.Work.ordinal
    friend.name = "Juan"
    friend.lastName = "Tellez"
    */
    friend.apply {
        group = Group.Work.ordinal
        name = "Juan"
        lastName = "Tellez"
    }

    println(friend)
}