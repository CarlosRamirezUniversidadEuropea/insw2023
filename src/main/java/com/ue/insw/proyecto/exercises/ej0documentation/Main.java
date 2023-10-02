package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Main {

    public static void main(String[] args) {

String[] asignaturas = {"Educacion Fisica", "Lengua", "Ingles", "Fisica", "Programacion"};

        Empleado Juan = new Empleado("Juan", 25, 'H', 123, "Sistemas", "Programador");
        System.out.println(Juan.toString());

        Alumno Bastian = new Alumno("Bastian", 11, 'H', 123, List.of(asignaturas), 5);
        System.out.println(Bastian.toString());

        Persona Vinicius = new Persona("Vinicius", 25, 'H');
        System.out.println(Vinicius.toString());
    }
}
