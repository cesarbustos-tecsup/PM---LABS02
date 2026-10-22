package vehiculo

class Automovil(
    marca: String,
    modelo: String,
    anio: Int,
    val cantidadPuertas: Int
) : Vehiculo(marca, modelo, anio) {

    override val tipo: String = "Automóvil"

    override fun arrancar() {
        println("El automóvil arranca con una llave o botón.")
    }

    override fun mostrarEspecificaciones() {
        println("Tipo: $tipo")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
        println("Cantidad de puertas: $cantidadPuertas")
    }
}
