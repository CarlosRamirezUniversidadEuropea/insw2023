package com.ue.insw.proyecto.exercises.ej0documentation;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <String>  asignaturasPepito = Arrays.asList("Impacto","Introducción al software","PEL");
        Alumno pepe = new Alumno("Pepe",22,'h',22224444,asignaturasPepito,2);
        pepe.toString();

        Empleado juan = new Empleado("Juan",42,'h',88886666,"Finanzas","Asesor");
        juan.toString();

        Persona sergio = new Persona("Sergio",19,'h');
        sergio.toString();


    }
}
