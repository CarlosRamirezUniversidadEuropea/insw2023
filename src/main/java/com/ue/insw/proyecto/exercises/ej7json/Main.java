package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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

        System.out.println("Reading json from file (Person and Employees):\n");
        // reading json from file
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";

        // Create a File object for the JSON file
        File file = new File(ruta);
        File file2 = new File(ruta2);
        Gson gson = new Gson();

        // Check if the file exists and if we have permission to read it
        if ((file.exists() && file.canRead()) && (file2.exists() && file2.canRead())) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta));
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));

                // Convert the JSON string to a Java object
                Persona obj = gson.fromJson(reader, Persona.class);
                Employee[] obj2 = gson.fromJson(reader2, Employee[].class);

                // Print the data from the Java object
                System.out.print("Persona: ");
                System.out.print(obj.getFirst_name()+ ", ");
                System.out.print(obj.getLast_name()+ ", ");
                System.out.print(obj.getLocation()+ ", ");
                System.out.print(obj.getFollowers());

                for (Employee employee : obj2) {
                    System.out.print("\nEmployee: ");
                    System.out.print(employee.getName() + ", ");
                    System.out.print(employee.getEmail()+ ", ");
                    System.out.print(employee.getPhone()+ ", ");
                    System.out.print(employee.isSubscribed()+ ", ");
                    System.out.print(employee.getBirth());
                }
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }


        // reading sensor values from url
        System.out.println("\n\n\nReading sensor values, json from an URL:");

        try {

            /*
             * World time API URL from which
             * we are going to read and parse
             * JSON using Gson
             */
            URL url_sensor_values = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");
            URL url_sensor_descr = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");

            //create a reader to read the URL
            InputStreamReader reader_values = new InputStreamReader(url_sensor_values.openStream());
            InputStreamReader reader_descr = new InputStreamReader(url_sensor_descr.openStream());

            // create JsonArray from reader to parse the JSON
            JsonArray jsonValues = JsonParser.parseReader(reader_values).getAsJsonArray();
            JsonArray jsonDescr = JsonParser.parseReader(reader_descr).getAsJsonArray();

            //METHOD 1: Print as a jsonObject
            System.out.println("\nReading it as a jsonObject");

            //Print the jsonObject
            for (int i = 0; i < jsonValues.size(); i++) {
                JsonObject jsonObject = jsonValues.get(i).getAsJsonObject();
                System.out.println("Sensor values: " + jsonObject.toString());
            }

            for (int i = 0; i < jsonDescr.size(); i++) {
                JsonObject jsonObject = jsonDescr.get(i).getAsJsonObject();
                System.out.println("Sensor description: " + jsonObject.toString());
            }

            //METHOD 2: Print as SensorValue and SensorDescr objects
            System.out.println("\nReading it as a SensorValue and SensorDescr objects");

            Gson gsonJson = new Gson();

            SensorValues[] obj1 = gsonJson.fromJson(jsonValues, SensorValues[].class);
            SensorDescr[] obj2 = gsonJson.fromJson(jsonDescr, SensorDescr[].class);

            //Print the jsonObject
            for (SensorValues sensorValues : obj1) {
                System.out.println(sensorValues.toString());
            }

            for (SensorDescr sensorDescr : obj2) {
                System.out.println(sensorDescr.toString());
            }

            //close the reader
            reader_values.close();
            reader_descr.close();

        }catch(Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }

    }
}
