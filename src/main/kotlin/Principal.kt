fun main(){
    //se puede definir una variable como de cualquier tipo
    // el caracter ? sirve para indicar que podria ser null
    //idealmente nada deberia ser null
    var abjNull: Any?

    //si no le pusieramos ? marcaria error
    abjNull = pruebaNull();
    //abjNull = "Hi";

    if(abjNull != null)
        print(abjNull)
}

public fun pruebaNull(): Int  {
    return 58
}