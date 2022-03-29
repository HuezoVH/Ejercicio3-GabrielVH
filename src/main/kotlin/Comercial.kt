class Comercial : Empleados{
    override var nombre : String = ""
    override var edad : Int = 0
    override var salario : Int = 0
    var comision : Double = 0.0

    companion object {
        const val PLUS : Int = 300
    }

    constructor()

    constructor(nombre : String, edad : Int, salario : Int, comision : Double){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.comision = comision
    }

    fun plus() : Boolean{
        return if(edad > 30 && comision == 200.0){
            salario += PLUS
            true
        } else{
            false
        }
    }
}