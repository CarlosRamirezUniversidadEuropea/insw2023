package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String sensorvalue = ("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");
        String sensordescr = ("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");

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
                System.out.print("Nombre: ");
                System.out.println(obj.getFirst_name());
                System.out.print("Apellido: ");
                System.out.println(obj.getLast_name());
                System.out.print("Localizacion: ");
                System.out.println(obj.getLocation());
                System.out.print("Followers: ");
                System.out.println(obj.getFollowers());
                System.out.println(obj.toString());

            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        File file2 = new File(ruta);
        Gson gson2 = new Gson();

        if(file2.exists() && file2.canRead()) {
            try {
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));
                Employee[] obj2 = gson2.fromJson(reader2, Employee[].class);
                for(Employee employee : obj2) {
                    System.out.print("Nombre: ");
                    System.out.println(employee.getName());
                    System.out.print("Email: ");
                    System.out.println(employee.getEmail());
                    System.out.print("Telefono: ");
                    System.out.println(employee.getPhone());
                    System.out.print("Suscrito: ");
                    System.out.println(employee.isSubscribed());
                    System.out.print("Fecha de nacimiento: ");
                    System.out.println(employee.getBirth());
                    System.out.println(employee.toString());
                }
            } catch (IOException e){

            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
        }

        System.out.println ("Sensor value: \n" + URLdeJSON(sensorvalue, SensorValue.class));
        System.out.println ("Sensor description: \n" + URLdeJSON(sensordescr, SensorDescr.class));
    }
    static String URLdeJSON (String url, Object object) {
        StringBuilder q = new StringBuilder();
        Gson g = new Gson();

        try {
            URL jsonUrl = new URL (url);
            InputStreamReader reader = new InputStreamReader(jsonUrl.openStream());
            Object[] objects = g.fromJson(reader, Object[].class);

            for (Object obj : objects) {
                q.append(obj.toString());
                q.append("\n");
            }
            return q.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}