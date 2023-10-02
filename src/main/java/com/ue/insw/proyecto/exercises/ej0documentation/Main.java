package com.ue.insw.proyecto.exercises.ej0documentation;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<String> asignaturas = List.of("Matematicas", "Lengua", "Ingles");
        Alumno alumno = new Alumno("Juan", 20, 'H', 123456, asignaturas, 1);
        System.out.println(alumno);
        Empleado empleado = new Empleado("Pedro", 30, 'H', 123, "Sistemas", "Programador");
        System.out.println(empleado);
        Persona persona = new Persona("Paula", 40, 'M');
        System.out.println(persona);

    }
}
