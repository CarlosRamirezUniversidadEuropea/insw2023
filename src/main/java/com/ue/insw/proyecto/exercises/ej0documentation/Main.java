package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;
public class Main {

    public static void main(String[] args) {
        // Instantiate objects
        Empleado employee = new Empleado("Juan", 30, 'H', 1234, "IT", "Developer");
        Persona person = new Persona("Maria", 25, 'M');
        Alumno student = new Alumno("Alejandro", 20, 'H', 1234, List.of("Math", "Physics", "Chemistry"), 1);


        // Print information
        System.out.println("Employee: " + employee.toString());
        System.out.println("Person: " + person.toString());
        System.out.println("Student: " + student.toString());

    }
}
