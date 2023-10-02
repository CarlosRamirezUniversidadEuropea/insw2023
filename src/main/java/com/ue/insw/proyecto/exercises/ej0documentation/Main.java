package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] clases = {"Algebra", "Programación", "Analisis Matemático"};


        Alumno a = new Alumno("Fernando Garrido", 21, 'H', 22357666, List.of(clases), 2 );
        System.out.println(a.toString());
        Empleado e = new Empleado("Juan Cuesta", 39, 'H', 2054,"Departamento Deportivo", "Profesor de deporte");
        System.out.println(e.toString());
        Persona p = new Persona("Gonzalo Chacón", 41, 'M');
        System.out.println(p.toString());

    }
}
