package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String a, e, p;
        Alumno alumno = new Alumno("Daniel", 23,'B',16545134, Collections.singletonList("lengua"), 6 );
        a =alumno.toString();
        System.out.println(a);

        Empleado empleado = new Empleado("federico",50,'B', 786468, "Lengua", "Jefe de departamento");
        e =empleado.toString();
        System.out.println(e);

        Persona persona = new Persona("Vidhi", 45, 'm');
        p = persona.toString();
        System.out.println(p);
    }
}
