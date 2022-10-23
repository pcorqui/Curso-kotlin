
fun main(){
    val tareaClass = TareaClass(1, "appPrueba", "una app para hacer todo")
    tareaClass.publicarDescripcion()
}


data class TareaClass(val id: Int,val nombre: String, val descripcion: String) {

    fun publicarDescripcion(){
        println(descripcion)
    }
}

//class TareaClassHija(id: Int, nombre: String, descripcion:String, val valoracion: Int): TareaClass(id,nombre,descripcion) {