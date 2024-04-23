package com.example.gestionempleados

class GestionEmpleados {

    fun Main(){

        val empleados = arrayOf(
            Empleado(1047452616,"Gustavo","Vergel",50000.0),
            Empleado(1321410,"Andres","Vfuentes",50000.0),
            Empleado(115544000,"MIla","arellano",50000.0),
            Empleado(1512045,"Migue","lopez",50000.0),
            Empleado(165202,"susana","sanches",50000.0)
        )

            //salarios


            fun calcularPromedioSalario(){
            val salario1 = empleados[0]
            val salario2 = empleados[1]
            val salario3 = empleados[2]
            val salario4 = empleados[3]
            val salario5 = empleados[4]

            val promedio = (salario1 + salario2 + salario3 + salario4 +salario5) / 5
        }


    }



}