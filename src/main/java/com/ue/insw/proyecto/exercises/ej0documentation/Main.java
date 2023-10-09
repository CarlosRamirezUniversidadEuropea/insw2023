package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> asignaturas = new ArrayList<>();
        asignaturas.add("Mates");
        asignaturas.add("Lengua");
        asignaturas.add("Programación");
            Empleado Pablo = new Empleado("Pablo",32,'M',326,"Recursos Humaanos","Director");
            Alumno Cesar = new Alumno("Cesar",40,'M',22160719,asignaturas,2);
            Persona Carlos = new Persona("Carlos",45,'M');
        System.out.println(Pablo);
        System.out.println(Cesar);
        System.out.println(Carlos);
    }
}
