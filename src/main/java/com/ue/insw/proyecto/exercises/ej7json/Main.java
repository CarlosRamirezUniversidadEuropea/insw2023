package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        Gson gson = new Gson();

        File file2 = new File(ruta2);

        // Check if the file exists and if we have permission to read it
        if (file2.exists() && file.canRead()) {
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

        if (file2.exists() && file2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));

                // Convert the JSON string to a Java object
                Empleado[] obj1 = gson.fromJson(reader2, Empleado[].class);

                // Print the data from the Java object
                for (Empleado empleado : obj1) {
                    System.out.println(empleado.getName());
                    System.out.println(empleado.getEmail());
                    System.out.println(empleado.getPhone());
                    System.out.println(empleado.isSubscribed());
                    System.out.println(empleado.getBirth());
                }

            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
    }
}
