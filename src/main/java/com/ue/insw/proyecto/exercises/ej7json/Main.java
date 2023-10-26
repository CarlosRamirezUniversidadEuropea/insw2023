package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        Gson gson = new Gson();
        // Check if the file exists and if we have permission to read it

        try {
            URL url = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            Vector<Sensor_values> sv = new Gson().fromJson(reader, new TypeToken<Vector<Sensor_values>>(){}.getType());

            for (Sensor_values container : sv) {
                System.out.println("type: " + container.getType());
                System.out.println("num: " + container.getNum());

                for (List<Value> values : container.getValues()) {
                    for (Value value : values) {
                        System.out.println("v: " + value.getV());
                    }
                }
            }

        } catch (IOException exc2) {
            System.out.println("Error: Este programa no ha hecho nada");
        }

        try {
            URL url1 = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");
            InputStreamReader reader2 = new InputStreamReader(url1.openStream());
            List<Sensor_descr> sd = new Gson().fromJson(reader2, new TypeToken<List<Sensor_descr>>(){}.getType());

            for (Sensor_descr container : sd) {
                System.out.println("type: " + container.getType());
                System.out.println("num: " + container.getNum());

                for (Field field : container.getFields()) {
                    System.out.println("name: " + field.getName());
                    System.out.println("unit: " + field.getUnit());
                    System.out.println("decPrecision: " + field.getDecPrecision());
                }

                for (Property property : container.getProperties()) {
                    System.out.println("name: " + property.getName());
                    System.out.println("id: " + property.getId());
                }
            }

        } catch (IOException exc2) {
            System.out.println("Error: Este programa no ha hecho nada");
        }
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

        File file2 = new File(ruta2);
        Gson gson2 = new Gson();

        if (file2.exists() && file2.canRead()) {
            try {
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));

                List<Employees> employeesList = gson2.fromJson(reader2, new TypeToken<List<Employees>>(){}.getType());

                for (Employees emp : employeesList) {
                    System.out.println(emp.getName());
                    System.out.println(emp.getEmail());
                    System.out.println(emp.getPhone());
                    System.out.println(emp.getSubscribed());
                }
            } catch (IOException exc) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
    }
}