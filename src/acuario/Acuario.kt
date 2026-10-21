package acuario

// 5.2. Crear una subclase
import kotlin.math.PI

// 3.2. Crear clase con propiedades
// 4.1. Crear un constructor
// 5.1. Hacer la clase Acuario open
open class Acuario(open var ancho: Int = 20,
                   open var alto: Int = 40,
                   open var largo: Int = 100) {

    /*
    // 3.2. Crear clase con propiedades
    var ancho: Int = 20
    var alto: Int = 40
    var largo: Int = 100

    // 4.1. Crear un constructor
    // Dimensiones en cm
    var ancho: Int = ancho
    var alto: Int = alto
    var largo: Int = largo
    */

    // 4.2. Agregar bloques de inicialización init
    init {
        println("Inicializando Acuario")
    }
    /*
    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${ancho * largo * alto / 1000} l")
    }
    */

    // 4.3. Conocer los constructores secundarios
    constructor(numeroDePeces: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    // 4.4. Agregar un getter de propiedad
    open var volumen: Int
        get() = ancho * alto * largo / 1000 // 1000 cm^3 = 1 l
        // 4.5. Agregar un setter de propiedad
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    // 5.1. Hacer la clase Acuario open
    open val forma = "Rectángulo"

    // 5.1. Hacer la clase Acuario open
    open var agua: Double = 0.0
        get() = volumen * 0.9

    // 3.4. Añadir un metodo
    fun imprimirTamano() {
        // 5.1. Hacer la clase Acuario open
        println(forma)
        println("Ancho: $ancho cm "
                + "Largo: $largo cm "
                + "Alto: $alto cm ")
        /*
        // 4.4. Agregar un getter de propiedad
        // 1 l = 1000 cm^3
        println("Volumen: $volumen l")
        */
        // 5.1. Hacer la clase Acuario open
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }

    // 5.2. Crear una subclase
    class TanqueTorre(override var alto: Int,
                       var diametro: Int): Acuario(alto = alto,
                                                    ancho = diametro,
                                                    largo = diametro) {
        override var volumen: Int
            // área elíptica = π * r1 * r2
            get() = (ancho/2 * largo/2 * alto / 1000 * PI).toInt()
            set(valor) {
                alto = ((valor * 1000 / PI) / (ancho/2 * largo/2)).toInt()
            }
        override var agua = volumen * 0.8
        override val forma = "Cilindro"
    }

}