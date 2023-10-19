package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

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

        // Employee
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        // Create a File object for the JSON file
        File file2 = new File(ruta2);
        Gson gson2 = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file2.exists() && file2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));

                // Convert the JSON string to a Java object
                Employee[] obj2 = gson2.fromJson(reader2, Employee[].class);

                // Print the data from the Java object
                //Loop to print the data of obj2
                for (Employee employee : obj2) {
                    System.out.println(employee.getName());
                    System.out.println(employee.getEmail());
                    System.out.println(employee.getPhone());
                    System.out.println(employee.isSubscribed());
                    System.out.println(employee.getBirth());
                }

            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        // reading sensor values from url
        String url_sensor_values = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        String url_sensor_descr = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";

        try {

            /*
             * World time API URL from which
             * we are going to read and parse
             * JSON using Gson
             */
            URL url = new URL(url_sensor_values);

            //create a reader to read the URL
            InputStreamReader reader = new InputStreamReader(url.openStream());

            /*
             * Use the fromJson method of the Gson
             * class that accepts a reader object
             */
            JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);

            //Print the jsonObject

            //close the reader
            reader.close();

        }catch(Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }
    }
}
