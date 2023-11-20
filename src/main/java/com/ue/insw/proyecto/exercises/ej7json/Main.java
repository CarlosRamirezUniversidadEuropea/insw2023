package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.ue.insw.proyecto.exercises.ej0documentation.Empleado;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        Gson gson = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file.exists() && file.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta));

                // Convert the JSON string to a Java object
                Persona obj = gson.fromJson(reader, Persona.class);

                // Print the data from the Java object
                System.out.println(obj.getFirst_name());
                System.out.println(obj.getLast_name());
                System.out.println(obj.getLocation());
                System.out.println(obj.getFollowers());
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        System.out.println("AHORA EL EMPLEADO");

        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/json/employees.json";
        // Create a File object for the JSON file
        File file2 = new File(ruta2);
        Gson gson2 = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file2.exists() && file2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta2));

                // Convert the JSON string to a Java object
                Empleados[] objArray = gson2.fromJson(reader, Empleados[].class);

                for (Empleados obj : objArray) {
                    System.out.println(obj.getName());
                    System.out.println(obj.getMail());
                    System.out.println(obj.getPhone());
                    System.out.println(obj.getBirth());
                }
            } catch (IOException e) {
                //Hadel de IOEexception
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
        }
    }
}