package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();


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
                System.out.println("Information of the person:");
                System.out.println(" - First name: " + person.getFirst_name());
                System.out.println(" - Last name: " + person.getLast_name());
                System.out.println(" - Location: " + person.getLocation());
                System.out.println(" - Followers: " + person.getFollowers());

                
                // Read the JSON file into a string
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta_2));

                // Convert the JSON string to a Java object
                Employee[] employee = gson.fromJson(reader2, Employee[].class);

                // make the for loop iterate over the employees
                for (int i = 0; i < employee.length; i++) {
                    // Print the data from the Java object
                    System.out.println("Information of the employee Nº " + i+1 + ":");
                    System.out.println(" - First name: " + employee[i].getFirst_name());
                    System.out.println(" - Email: " + employee[i].getEmail());
                    System.out.println(" - Phone: " + employee[i].getPhone());
                    System.out.println(" - Subscribed: " + employee[i].isSubscribed());
                    System.out.println(" - Birth: " + employee[i].getBirth());
                    System.out.println();
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

            for (SensorValue sensorValue : value) {
                // Print the data from the Java object
                System.out.println("Information for sensor " + sensorValue.getNum());
                System.out.println(" - Sensor Nº: \t" + sensorValue.getNum());
                System.out.println(" - Type: \t" + sensorValue.getType());
                System.out.println(" - Value: \t" + sensorValue.getValues());
                System.out.println();
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

            for (Sensor value : sensor) {
                // Print the data from the Java object
                System.out.println("Information detail for sensor " + value.getNum());
                System.out.println(" - Type: \t" + value.getType());
                System.out.println(" - Fields: \t" + value.getFields());
                System.out.println(" - Properties: \t" + value.getProperties());
                System.out.println();
            }
                
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo");
            // Handle exceptions
        }
    }
}