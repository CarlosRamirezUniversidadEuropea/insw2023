package com.ue.insw.proyecto.exercises.ej0documentation;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> asignaturas = new ArrayList<>();
        asignaturas.add("PCD");
        asignaturas.add("PEL");

        //Creamos las instancias de diferentes clases utilizando los constructores
        //1. creamos una instancia de persona con nombre, edad, y sexo
        Persona nacho = new Persona("antonio", 10, 'M');

        //2. creamos una instancia de empleado con nombre, edad, sexo, numero de empleado, departamento y puesto
        Empleado josevi = new Empleado("josevi", 13, 'H', 0, "recursos", "patron");

        //3.creamos una instancia de alumno con nombre, edad, sexo, numero de expediente y curso
        Alumno dieguich = new Alumno( "dieguich", 20, 'M', 888, asignaturas, 7);

        System.out.println(nacho.toString());
        System.out.println(josevi.toString());
        System.out.println(dieguich.toString());
    }
}
