package com.ue.insw.proyecto.exercises.ej0documentation;

import java.net.StandardSocketOptions;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Alumno
        Alumno alumno = new Alumno("Sergio", 19, 'H', 22275547, Collections.singletonList("Mate"), 2);
        System.out.println(alumno);

        // Empleado
        Empleado empleado = new Empleado("Lucia", 19, 'M', 777, "Software developer", "Jef@");
        System.out.println(empleado);

        //Persona
        Persona persona = new Persona("Heisemberg", 52, 'H');
        System.out.println(persona);
    }
}
