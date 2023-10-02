package com.ue.insw.proyecto.exercises.ej0documentation;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        List<String> asignaturas=new ArrayList<>();
            asignaturas.add("Maates");
            asignaturas.add("Lengua");
            asignaturas.add("Historia");


                Empleado juan= new Empleado("Juan",25,'m',3987,"Informatica","Cordinador");
                Persona jorge= new Persona("Jorge",25,'m');
                Alumno miguel= new Alumno("Miguel",17,'m',2883456,asignaturas,1);

           System.out.println(juan);
           System.out.println(jorge);
           System.out.println(miguel);


    }
}
