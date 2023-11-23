
class vehiculo {

    var color = ""
    var marca = ""
    var modelo = ""
    var placas = ""


}

//contructor primario
class vehiculo constructor(val marca: String, val modelo: String, val color : String){
    var placas = ""
    var gasolina = 0f
    var encendido = false

}


class vehiculo (val marca: String, val modelo: String, var color: String){
    //para que imprima todo los parrafos
    init {
        println("""Los datos del coche son : 
           marca : $marca
           modelo : $modelo
           color: $color """)

    }


    //constructor secundario
    constructor(marca:String, modelo : String, color : String, placas: String): this (marca,modelo,color){

        this.placas = placas
        println("Las placas son: ${this.placas}")
    }

    var placas = ""
    var gasolina = 0f
    var encendido = false

}

}


