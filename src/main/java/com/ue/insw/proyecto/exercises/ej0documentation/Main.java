package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<String> asig = new ArrayList<>();
        asig.add("Programación concurrente");
        Persona persona = new Persona("Pepe", 19, 'H');
        Empleado empleado = new Empleado("Josefina", 56, 'M', 54367, "Recursos humanos", "Jefa" );
        Alumno alumno = new Alumno("Evaristo", 20, 'H', 334606, asig, 2 );
        System.out.println(alumno.toString());
        System.out.println(persona.toString());
        System.out.println(empleado.toString());
    }
}
