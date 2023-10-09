class Libro(var titulo: String, var isbn: Long){
    fun frase() = println("Leer es de sabios")
}

fun main() {
    var nombre = "Raul"
    
    //muestra el contenido de la variable
    println("Hola ${nombre}")
    
    //muestra la longitud del texto de la variable
    println("$nombre tiene ${nombre.length} caracteres")
    
    val valor: String ?= "Hola"
    
    // si la variable es nula, mostrará por pantalla un 7, en caso contrario mostrará su longitud    
    println("${valor?.length ?: 7} pruebinha") 
    
    val valor2: String ?= null
    
    //fuerza la salida de la excepcion NullPointerException
    println(valor2!!)
    
    
    //crea una funcion que suma 2 a un numero pasado como parámetro
    fun sumarDos(x: Int): Int{
        return x+2
    }
    
    //misma función pero simplificada
    fun sumarTres(x: Int) = x+3
    
    //llamada a la función
    println(sumarDos(4))
    println(sumarTres(4))
    
    
    //EXPRESIONES LAMBDA
    
    //declaración de una expresión lambda
    val sumarCuatro = {x: Int -> x+4}
    
    //invocación de la expresión lambda
    println(sumarCuatro(4))
    
    //crear un objeto de la clase creada anteriormente
    val libro = Libro("El principito", 123456789)
    println(libro.titulo)
    println(libro.isbn)
    libro.frase()
    
    //reasignacion de las variables
    libro.titulo = "Don Quijote"
    libro.isbn = 987654321
    println(libro.titulo)
    println(libro.isbn) 
}