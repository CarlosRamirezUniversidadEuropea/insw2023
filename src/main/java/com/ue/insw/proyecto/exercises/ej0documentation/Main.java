package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    List<String> asignaturas = new ArrayList();
    asignaturas.add("Yoga");
    asignaturas.add("Piano");
    asignaturas.add("Gimnasia");
        Empleado Carlos = new Empleado("Carlos",34,'h',254,"Recursos humanos","Jefe estudios");
        Alumno Diego = new Alumno("Diego",42,'h',22164847,asignaturas,2);
        Persona Manuel = new Persona("Manuel",29,'h');
    System.out.println(Carlos);
    System.out.println(Diego);
    System.out.println(Manuel);
    }
}
