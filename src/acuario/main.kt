package acuario

// 3.3. Crear una función main()
fun construirAcuario() {
    /*
    // 3.3. Crear una función main()
    val miAcuario = Acuario()
    // 3.4. Añadir un metodo
    miAcuario.imprimirTamano()
    miAcuario.alto = 60
    miAcuario.imprimirTamano()
    */
    // 4.1. Crear un constructor
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    // altura y largo por defecto
    val acuario2 = Acuario(ancho=25)
    acuario2.imprimirTamano()
    // ancho por defecto
    val acuario3 = Acuario(alto=35, largo=110)
    acuario3.imprimirTamano()
    // todo personalizado
    val acuario4 = Acuario(ancho=25, alto=35, largo=110)
    acuario4.imprimirTamano()
    // 4.3. Conocer los constructores secundarios
    val acuario5 = Acuario(numeroDePeces=29)
    acuario5.imprimirTamano()
    // 4.5. Agregar un setter de propiedad
    val acuario6 = Acuario(numeroDePeces=29)
    acuario6.imprimirTamano()
    acuario6.volumen = 70
    acuario6.imprimirTamano()
    // 5.1. Hacer la clase Acuario open
    val acuario7 = Acuario(largo=25, ancho=25, alto=40)
    acuario7.imprimirTamano()
    // 5.2. Crear una subclase
    val miAcuario = Acuario(ancho=25, largo=25, alto=40)
    miAcuario.imprimirTamano()
    val miTorre = Acuario.TanqueTorre(diametro=25, alto=40)
    miTorre.imprimirTamano()
}

// 6.1. Implementación de clases abstractas
fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburón es de color ${tiburon.color}.")
    tiburon.comer()

    println("El pez payaso es de color ${pezPayaso.color}.")
    pezPayaso.comer()
}

// 3.3. Crear una función main()
fun main() {
    //construirAcuario()
    //crearPeces()
}
