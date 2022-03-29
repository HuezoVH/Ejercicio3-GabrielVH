abstract  class Empleados {
    open var nombre : String = ""
    open var edad : Int = 0
    open var salario : Int = 0

    companion object {
        const val PLUS : Int = 300
    }

    constructor()

    constructor(nombre : String, edad : Int, salario : Int){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }
}