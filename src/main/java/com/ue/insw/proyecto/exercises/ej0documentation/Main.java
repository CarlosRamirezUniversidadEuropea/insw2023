package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[]asignaturas = {"mates","lengua","e.f","ingles"};

        Persona persona = new Persona("Rodrigo",21,'H');
        System.out.println(persona.toString());


        Empleado empleado = new Empleado("Rodrigo",21,'H', 210, "Informatica", "jefe");
        System.out.println(empleado.toString());

        Alumno alumno = new Alumno("Rodrigo",21,'H',0033, List.of(asignaturas),3);
        System.out.println(alumno.toString());
    }
}
