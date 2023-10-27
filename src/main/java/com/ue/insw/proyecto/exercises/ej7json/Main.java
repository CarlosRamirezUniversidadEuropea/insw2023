package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String rutaEmpleado = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";

        // Create a File object for the JSON file
        File file = new File(ruta);
        File fileEmployee = new File(ruta);
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
            if (file.exists() && fileEmployee.canRead()) {
                try {
                    Reader reader = Files.newBufferedReader(Paths.get(rutaEmpleado));
                    Employee[] employees = gson.fromJson(reader, Employee[].class);
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                } catch (IOException e) {
                    System.out.println("error");
                }
                try {
                    URL url = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");
                    InputStreamReader reader = new InputStreamReader(url.openStream());
                    Sensor_value[] values = gson.fromJson(reader, Sensor_value[].class);
                    for (Sensor_value value : values) {
                        System.out.println(value);
                    }
                } catch (IOException e) {
                    System.out.println("error");
                }
                try {
                    URL urld = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");
                    InputStreamReader readerd = new InputStreamReader(urld.openStream());
                    Sensor_descr[] descrs = gson.fromJson(readerd, Sensor_descr[].class);
                    for (Sensor_descr d : descrs) {
                        System.out.println(d);
                    }
                } catch (IOException e) {
                    System.out.println("error");
                }
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
    }
}
