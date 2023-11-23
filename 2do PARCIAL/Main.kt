import java.util*
import kotlin.concurrent.schedule


fun main(){

    val miVehiculo = vehiculo()
    miVehiculo.color= "Verde"
    miVehiculo.marca = "Ford"
    miVehiculo.modelo = "Focus"
    miVehiculo.placas = "REM-4123"

    val miVehiculo = vehiculo("Ford", "Focus", "Verde", "REM-4123")


    val golNegro = vehiculo("Volskvagen", "Gol")

    val pointer = vehiculo(
        color = "azul",
                marca = "Volksvagen",
                model = "Pointer"
    )


    val enemy = Goomba("un enemigo",2)

    val Koopa = Koopa()
    Koopa.collision("weapon")

}

