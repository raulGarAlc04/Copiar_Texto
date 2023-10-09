class Persona(var nombre: String, var edad: Int){
    fun datosPersona() = println("Su nombre es ${nombre} y tiene ${edad} años")
}

fun main() {
    val persona = Persona("Manuel", 20)
    persona.datosPersona()
}