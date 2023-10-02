package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.Collections;

public class Main {



    public static void main(String[] args) {
        Alumno a = new Alumno ("Federica", 12, 'm', 23456785, Collections.singletonList("lengua"), 5);
        a.toString(); //para poder hacer un system out
        System.out.println(a);

        Persona p = new Persona ("Eustaquio", 40, 'h');
        p.toString();
        System.out.println(p);

        Empleado e = new Empleado("Mario", 20, 'h', 234, "Logistica", "Empleado");
        e.toString();
        System.out.print(e);



    }
}
