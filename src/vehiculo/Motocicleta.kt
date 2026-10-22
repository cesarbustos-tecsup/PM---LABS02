package vehiculo

class Motocicleta(
    marca: String,
    modelo: String,
    anio: Int,
    val cilindrada: Int
) : Vehiculo(marca, modelo, anio) {

    override val tipo: String = "Motocicleta"

    override fun arrancar() {
        println("La motocicleta arranca utilizando su sistema de encendido.")
    }

    override fun mostrarEspecificaciones() {
        println("Tipo: $tipo")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
        println("Cilindrada: $cilindrada cc")
    }
}
