package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.URL;
import java.net.HttpURLConnection;


public class Main {
    public static void main(String[] args) throws IOException {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        File file2 = new File(ruta2);
        Gson gson = new Gson();

        String sensorValuesUrl =
                "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";

        String sensorDescUrl =
                "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";

        System.out.println("Json person:");
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

        System.out.println("-------------------------------------------------------");

        System.out.println("\nJson employees:");
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

        System.out.println("-------------------------------------------------------");

        System.out.println("\nJson sensor_values:");

        try {
            URL url = new URL(sensorValuesUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStreamReader sensorValuesReader = new InputStreamReader(connection.getInputStream());

            Sensor_Values[] sensorValues = gson.fromJson(sensorValuesReader, Sensor_Values[].class);

            for (Sensor_Values data : sensorValues) {
                System.out.println("Type: " + data.getType());
                System.out.println("Num: " + data.getNum());

                System.out.println("Values:");
                for (Sensor_Values.Value[] innerArray : data.getValues()) {
                    System.out.print("[");
                    for (Sensor_Values.Value value : innerArray) {
                        System.out.print(value.getV() + ", ");
                    }
                    System.out.println("]");
                }
            }

            sensorValuesReader.close();
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("-------------------------------------------------------");

        System.out.println("\nJson sensor description:");

        try {
            URL url = new URL(sensorDescUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStreamReader sensorDescReader = new InputStreamReader(connection.getInputStream());

            Sensor_desc[] sensorDesc = gson.fromJson(sensorDescReader, Sensor_desc[].class);

            for (Sensor_desc desc : sensorDesc) {
                System.out.println("Type: " + desc.getType());
                System.out.println("Num: " + desc.getNum());

                System.out.println("Fields:");
                for (Sensor_desc.Field field : desc.getFields()) {
                    System.out.println("Name: " + field.getName());
                    System.out.println("Unit: " + field.getUnit());
                    System.out.println("DecPrecision: " + field.getDecPrecision());
                }

                System.out.println("Properties:");
                for (Sensor_desc.Property property : desc.getProperties()) {
                    System.out.println("Id: " + property.getId());
                    System.out.println("Name: " + property.getName());
                }
            }

            sensorDescReader.close();
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
