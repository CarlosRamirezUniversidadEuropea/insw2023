package com.ue.insw.proyecto.exercises.ej0documentation;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List <String> asignaturas = new ArrayList<>();
        Alumno angel = new Alumno("Angel", 20, 'm', 222221893, asignaturas , 2);
        Empleado eusebio = new Empleado("Eusebio", 45, 'm', 1116723, "General", "Gerente" );
        Persona marta = new Persona("Marta", 36, 'f');

        System.out.println(angel.toString());
        System.out.println(eusebio.toString());
        System.out.println(marta.toString());
    }
}
