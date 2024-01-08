package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.BufferedReader;
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
                System.out.println(obj.toString());
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
        System.out.println("Hacemos empleado");

        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        // Create a File object for the JSON file
        File file2 = new File(ruta2);
        Gson gson2 = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file2.exists() && file2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta2));

                // Convert the JSON string to a Java object
                Empleados[] obj2 = gson2.fromJson(reader, Empleados[].class);
                for (Empleados empleados : obj2) {
                    System.out.println(empleados.toString());
                }
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        String sensor1 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        String sensor2 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";
        // SENSOR 1
        System.out.println("Sensor 1: ");
        System.out.println(leerURL(sensor1, Sensor.class));

        // SENSOR 2
        System.out.println("Sensor 2: ");
        System.out.println(leerURL(sensor2, Sensor.class));
    }


    static String leerURL(String url, Object object) {
        StringBuilder datos = new StringBuilder();
        Gson gson = new Gson();

        try {
            URL jsonUrl = new URL(url);
            InputStreamReader reader = new InputStreamReader(jsonUrl.openStream());


            Object[] objects = gson.fromJson(reader, Object[].class);


            for (Object obj : objects) {
                datos.append(obj.toString());
                datos.append("\n");
            }
            return datos.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
