package com.ue.insw.proyecto.exercises.ej0documentation;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creamos una lista de asignaturas utilizando la interfaz List y la clase ArrayList.
        List<String> asignaturas = new ArrayList<>();
        // Agregamos dos asignaturas a la lista.
        asignaturas.add("PCD");
        asignaturas.add("SOFTWARE");

        // Creamos instancias de diferentes clases utilizando los constructores.
        // 1. Creamos una instancia de Persona con nombre "Jose", edad 19 y sexo masculino ('H').
        Persona pepe = new Persona("Jose", 19, 'H');

        // 2. Creamos una instancia de Empleado con nombre "Diegoti", edad 19, sexo masculino ('H'),
        // número de empleado 1, departamento "Vigilancia espía" y puesto "CEO".
        Empleado diego = new Empleado("Diegoti", 19, 'H', 1, "Vigilancia espía", "CEO");

        // 3. Creamos una instancia de Alumno con nombre "Paula", edad 20, sexo femenino ('F'),
        // número de expediente 1234567, lista de asignaturas (asignaturas) y curso 2.
        Alumno paula = new Alumno("Paula", 20, 'F', 1234567, asignaturas, 2);
        System.out.println(pepe.toString());
        System.out.println(diego.toString());
        System.out.println(paula.toString());
    }
}
