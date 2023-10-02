package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Alumno a = new Alumno("Victor", 19, 'h',8, Collections.singletonList("Ingeniería del software"), 2);
        Empleado e = new Empleado("Sergio",25,'h',806,"Software Developement","Jef@");
        Persona p = new Persona("Vidhi",19,'m');
        System.out.println(a.toString()+"\n" + e.toString() +"\n"+ p.toString());
    }
}
