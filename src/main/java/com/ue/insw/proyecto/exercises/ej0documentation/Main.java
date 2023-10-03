package com.ue.insw.proyecto.exercises.ej0documentation;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // agregar las asiganturas
        List<String> asignaturasAlumno1 = new ArrayList<>();
        asignaturasAlumno1.add("Porgramacion");
        asignaturasAlumno1.add("Fisica");
    Alumno alumno1 = new Alumno("Juan", 25, 'H', 25252023, asignaturasAlumno1, 1);
             System.out.println ("Informacion del alumno: ");
             System.out.println(alumno1.toString());
    Empleado empleado1 = new Empleado("Aracely", 24, 'M', 100, "RRHH", "Gerente");
            System.out.println("Informacion del empleado: ");
             System.out.println(empleado1.toString());
    Persona persona1 = new Persona("Luigi",25, 'H' );
            System.out.println("Informacion de la persona:");
            System.out.println(persona1.toString());
    }
}
