package com.ue.insw.proyecto.exercises.ej0documentation;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> asignaturas = new ArrayList<>();

    Alumno lucia = new Alumno("lucia", 20, 'm',22233345,asignaturas,2);
    Empleado paula = new Empleado("Rigoberta", 20,'f',25345345,"departamento general", "recepcionista");
    Persona roberto = new Persona("Roberto", 30, 'm');
    System.out.println(lucia.toString());
    System.out.println(paula.toString());
    System.out.println(roberto.toString());
    }
}

