package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Instanciación de un objeto de la clase Persona usando el constructor
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(30);
        persona.setSexo('H');
        Persona persona2 = new Persona("Carmen", 20, 'M');
        System.out.println("Datos de la persona:");
        System.out.println(persona.toString());
        System.out.println(persona2.toString());

        // Instanciación de un objeto de la clase Empleado usando el constructor
        Empleado empleado = new Empleado("Maria", 35, 'M', 12345, "Ventas", "Gerente de Ventas");
        System.out.println("\nDatos del empleado:");
        System.out.println(empleado.toString());

        // Instanciación de una lista de asignaturas
        List<String> asignaturas = new ArrayList<>();
        asignaturas.add("Matemáticas");
        asignaturas.add("Historia");

        // Instanciación de un objeto de la clase Alumno usando el constructor parametrizado
        Alumno alumno = new Alumno("Pedro", 20, 'H', 54321, asignaturas, 2);
        System.out.println("\nDatos del alumno:");
        System.out.println(alumno.toString());
    }
}
