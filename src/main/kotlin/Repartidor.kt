class Repartidor : Empleados{
    override var nombre : String = ""
    override var edad : Int = 0
    override var salario : Int = 0
    var zona : String = ""

    companion object {
        const val PLUS : Int = 300
    }

    constructor()

    constructor(nombre : String, edad : Int, salario : Int, zona : String){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.zona = zona
    }

    fun plus() : Boolean{
        return if(edad < 25 && zona == "zona 3"){
            salario += PLUS
            true
        } else{
            false
        }
    }
}