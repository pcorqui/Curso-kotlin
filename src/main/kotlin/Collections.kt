import classes.Group
import classes.User

fun main(){
    newTopic("Collections")
    newTopic("Solo lectura")

    //arreglos de solo lectura
    val frutaList = listOf<String>("Manzana", "Banana", "Uva", "Lima")

    println(frutaList.get((0..frutaList.size - 1).random()))
    println("index de Uva es ${frutaList.indexOf("Uva")}")

    //arreglos mutables --siempre usar constantes antes que variables en cualquier lenguaje
    newTopic("mutable list")

    val myUser = User(0,"Paul", "Cortes", Group.Family.ordinal)
    val bro = myUser.copy(1, "Ivan")
    val friend = bro.copy(2, group = Group.Friends.ordinal)
    val userList = mutableListOf(myUser,bro)
    println(userList)
    userList.add(friend)
    println(userList)
    //userList.removeAt(1)
    userList.remove(bro)
    println(userList)

    val userSelectList = mutableListOf<User>()
    println(userSelectList)
    //userSelectList.addAll(userList)
    userSelectList.add(myUser)
    println("myuser: $userSelectList")
    userSelectList.set(0,bro)//actualizacion del objeto
    println(userSelectList)
    userSelectList.add(myUser) //se permiten los elementos repetidos
    userSelectList.add(myUser)
    println(userSelectList)
}