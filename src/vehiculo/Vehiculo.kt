package vehiculo

interface AccionesVehiculo {
    fun arrancar()
    fun mostrarEspecificaciones()
}

abstract class Vehiculo(
    val marca: String,
    val modelo: String,
    val anio: Int
) : AccionesVehiculo {

    abstract val tipo: String

    init {
        println("Inicializando vehículo: $marca $modelo")
    }

    override abstract fun arrancar()
    override abstract fun mostrarEspecificaciones()
}
