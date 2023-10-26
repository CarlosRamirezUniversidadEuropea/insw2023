package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Paths for the json files
        String ruta_1 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/json/person.json";
        String ruta_2 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        String ruta_3 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";

        // Create a File object for each file
        File file_1 = new File(ruta_1);
        File file_2 = new File(ruta_2);
        File file_3 = new File(ruta_3);

        // Check if the files exist, if not print an error message
        boolean file_1_available = file_1.exists() && file_1.canRead();
        boolean file_2_available = file_2.exists() && file_2.canRead();
        boolean file_3_available = file_3.exists() && file_3.canRead();

        boolean parse_files = file_1_available && file_2_available && file_3_available;

        // Check if the file exists and if we have permission to read it
        if (parse_files) {
            try {
                // Create a Gson object
                Gson gson = new Gson();
            
                // Parse JSON from the first URL
                Type firstUrlType = new TypeToken<List<Data>>() {}.getType();
                List<Data> firstUrlData = gson.fromJson(new FileReader(ruta_1), firstUrlType);
                System.out.println("Data from the first URL:");
                for (Data data : firstUrlData) {
                    System.out.println("Type: " + data.getType());
                    System.out.println("Number: " + data.getNum());
                    System.out.println("Values:");
                    for (List<Value> values : data.getValues()) {
                        for (Value value : values) {
                            System.out.println("Value: " + value.getV());
                        }
                    }
                    System.out.println();
            }
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        // For file URL1.json
        String ruta_2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/json/person.json";
        // Create a File object for the JSON file
        File file_2 = new File(ruta_2);
        Gson gson_2 = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file_2.exists() && file_2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta_2));

                // Convert the JSON string to a Java object
                Persona obj = gson_2.fromJson(reader, Persona.class);

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

        // For file URL2.json
        String ruta_3 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/json/person.json";
        // Create a File object for the JSON file
        File file_3 = new File(ruta_3);
        Gson gson_3 = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file_3.exists() && file_3.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta_3));

                // Convert the JSON string to a Java object
                Persona obj = gson_3.fromJson(reader, Persona.class);

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
    }
}
