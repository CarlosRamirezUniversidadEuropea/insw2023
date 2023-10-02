package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        List <String> asignaturasDiego =  Arrays.asList("PEL", "INTRODUCCION SOFTWARE", "IMPACTO");
        Alumno diego = new Alumno("Diego",19,'H',22258829,asignaturasDiego,2);
        Empleado jose = new Empleado("Fabian",44,'H',345,"Ciencisa biomedicas", "Suplantacion de tejidos");
        Persona fabian = new Persona("Fabian",28,'H');

        diego.toString();
        jose.toString();
        fabian.toString();


    }
}
