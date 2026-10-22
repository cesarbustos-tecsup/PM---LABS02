package acuario

abstract class Pez {
    abstract val color: String
}

interface AccionPez {
    fun comer()
}

class Tiburon : Pez(), AccionPez {
    override val color: String = "Gris"

    override fun comer() {
        println("Cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color: String = "Dorado"

    override fun comer() {
        println("Comer algas")
    }
}
