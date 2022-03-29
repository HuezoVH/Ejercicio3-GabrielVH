class View {
    fun ejecutable(){
        var empleado1 = Repartidor("Juan", 38, 500, "zona 1")
        var empleado2 = Repartidor("Gabriel", 22, 450, "zona 2")
        var empleado3 = Repartidor("Maria", 24, 550, "zona 3")
        var empleado4 = Repartidor("Mario", 40, 350, "zona 4")

        var empleado5 = Comercial("Pedro", 40, 350, 200.0)
        var empleado6 = Comercial("Ana", 40, 350, 150.0)
        var empleado7 = Comercial("Albert", 40, 350, 250.0)

        if (empleado1.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
        if (empleado2.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
        if (empleado3.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
        if (empleado4.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
        if (empleado5.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
        if (empleado6.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
        if (empleado7.plus()){
            println("Se aplico el PLUS!!")
        }else{
            println("NO hay PLUS")
        }
    }
}