package vehiculo

fun crearVehiculos() {
    val vehiculos = mutableListOf<Vehiculo>()
    var opcion: Int

    do {
        println("\n===== SISTEMA DE VEHÍCULOS =====")
        println("1. Registrar automóvil")
        println("2. Registrar motocicleta")
        println("3. Enlistar vehículos")
        println("4. Ver especificaciones")
        println("5. Salir")
        print("Seleccione una opción: ")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Marca: ")
                val marca = readLine().orEmpty()

                print("Modelo: ")
                val modelo = readLine().orEmpty()

                print("Año: ")
                val anio = readLine()?.toIntOrNull() ?: 0

                print("Cantidad de puertas: ")
                val puertas = readLine()?.toIntOrNull() ?: 0

                if (marca.isNotBlank() && modelo.isNotBlank()
                    && anio > 0 && puertas > 0
                ) {
                    val auto = Automovil(
                        marca, modelo, anio, puertas
                    )
                    vehiculos.add(auto)
                    println("Automóvil registrado correctamente.")
                } else {
                    println("Error: ingrese datos válidos.")
                }
            }

            2 -> {
                print("Marca: ")
                val marca = readLine().orEmpty()

                print("Modelo: ")
                val modelo = readLine().orEmpty()

                print("Año: ")
                val anio = readLine()?.toIntOrNull() ?: 0

                print("Cilindrada (cc): ")
                val cilindrada = readLine()?.toIntOrNull() ?: 0

                if (marca.isNotBlank() && modelo.isNotBlank()
                    && anio > 0 && cilindrada > 0
                ) {
                    val moto = Motocicleta(
                        marca, modelo, anio, cilindrada
                    )
                    vehiculos.add(moto)
                    println("Motocicleta registrada correctamente.")
                } else {
                    println("Error: ingrese datos válidos.")
                }
            }

            3 -> {
                if (vehiculos.isEmpty()) {
                    println("No hay vehículos registrados.")
                } else {
                    println("\n===== VEHÍCULOS REGISTRADOS =====")

                    for ((indice, vehiculo) in vehiculos.withIndex()) {
                        println(
                            "${indice + 1}. ${vehiculo.tipo}: " +
                                    "${vehiculo.marca} ${vehiculo.modelo} " +
                                    "(${vehiculo.anio})"
                        )
                    }
                }
            }

            4 -> {
                if (vehiculos.isEmpty()) {
                    println("No hay vehículos para consultar.")
                } else {
                    println("\nSeleccione un vehículo:")

                    for ((indice, vehiculo) in vehiculos.withIndex()) {
                        println(
                            "${indice + 1}. ${vehiculo.marca} " +
                                    "${vehiculo.modelo} - ${vehiculo.tipo}"
                        )
                    }

                    print("Número del vehículo: ")
                    val numero = readLine()?.toIntOrNull() ?: 0

                    if (numero in 1..vehiculos.size) {
                        val vehiculo = vehiculos[numero - 1]

                        println("\n===== ESPECIFICACIONES =====")
                        vehiculo.mostrarEspecificaciones()
                        println("\n===== PRUEBA DE ARRANQUE =====")
                        vehiculo.arrancar()
                    } else {
                        println("Número de vehículo no válido.")
                    }
                }
            }

            5 -> println("Saliendo del sistema...")

            else -> println("Opción no válida. Intente nuevamente.")
        }

    } while (opcion != 5)
}

fun main() {
    crearVehiculos()
}
