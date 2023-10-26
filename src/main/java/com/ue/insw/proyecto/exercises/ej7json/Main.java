package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Create a Gson object
        Gson gson = new Gson();

        String ruta_1 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/json/person.json";
        String ruta_2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/json/employees.json";
        // Create a File object for the JSON file
        File file_1 = new File(ruta_1);
        File file_2 = new File(ruta_2);

        // Check if the file_1 exists and if we have permission to read it
        if (file_1.exists() && file_1.canRead() && file_2.exists() && file_2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta_1));

                // Convert the JSON string to a Java object
                Persona person = gson.fromJson(reader, Persona.class);

                // Print the data from the Java object
                System.out.println(person.getFirst_name());
                System.out.println(person.getLast_name());
                System.out.println(person.getLocation());
                System.out.println(person.getFollowers());

                
                // Read the JSON file into a string
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta_2));

                // Convert the JSON string to a Java object
                Employee[] employee = gson.fromJson(reader2, Employee[].class);

                for (int i = 0; i < args.length; i++) {
                    // Print the data from the Java object
                    System.out.println(employee[i].getFirst_name());
                    System.out.println(employee[i].getLast_name());
                    System.out.println(employee[i].getLocation());
                    System.out.println(employee[i].getFollowers());
                }
                    
            } catch (IOException e) {
                System.out.println("Error: No se pudo leer el archivo");
                // Handle exceptions
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada :(");
            // Handle the case where the file does not exist or cannot be read
        }

        // URL 1
        try {
            URL url_1 = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");

            // Read the JSON file from url
            InputStreamReader reader_3 = new InputStreamReader(url_1.openStream());

            // JsonArray from reader
            JsonArray jsonArray = JsonParser.parseReader(reader_3).getAsJsonArray();

            // Convert the JSON string to a Java object
            SensorValue[] value = gson.fromJson(jsonArray, SensorValue[].class);

            for (int i = 0; i < value.length; i++) {
                // Print the data from the Java object
                System.out.println(value[i].getNum());
                System.out.println(value[i].getType());
                System.out.println(value[i].getClass());
                System.out.println(value[i].getValues());
            }
                
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo");
            // Handle exceptions
        }

        // URL 2
        try {
            URL url_2 = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");

            // Read the JSON file from url
            InputStreamReader reader_4 = new InputStreamReader(url_2.openStream());

            // JsonArray from reader
            JsonArray jsonArray = JsonParser.parseReader(reader_4).getAsJsonArray();

            // Convert the JSON string to a Java object
            Sensor[] sensor = gson.fromJson(jsonArray, Sensor[].class);

            for (int i = 0; i < sensor.length; i++) {
                // Print the data from the Java object
                System.out.println(sensor[i].getNum());
                System.out.println(sensor[i].getType());
                System.out.println(sensor[i].getFields());
                System.out.println(sensor[i].getProperties());
            }
                
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo");
            // Handle exceptions
        }
    }
}