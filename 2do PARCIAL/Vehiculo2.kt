class Vehiculo_2 {
    init {
        println("Vehiculo creado")
    }
    companion object Factory{
        fun create(): Vehiculo_2 = Vehiculo_2()
    }
}
