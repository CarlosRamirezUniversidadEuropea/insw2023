package com.ue.insw.proyecto.exercises.ej0documentation;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 20, 'H');
        Alumno alumno = new Alumno("Juan", 20, 'H', 123456, null, 1);
        Empleado empleado = new Empleado("Pedro", 20, 'H', 123456, "Sistemas", "Programador");

        System.out.println(persona.getNombre());
        System.out.println(alumno.getNombre());
        System.out.println(empleado.getNombre());
    }
}
