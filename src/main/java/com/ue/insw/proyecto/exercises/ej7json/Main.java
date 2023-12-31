package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static void Person() {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        Gson gson = new Gson();
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
                e.printStackTrace();
            }
    }

    private static void Employees() {
        String rutaE = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        Gson gson = new Gson();
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(rutaE));

                // Convert the JSON string to a Java object
                Employee[] employees = gson.fromJson(reader, Employee[].class);

                // Print the data from the Java object
                for (Employee e : employees) {
                    System.out.println(e);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static void Sensor_descr() {
        Gson gson = new Gson();
        try {
            URL url = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");
            // Read the JSON file into a string
            InputStreamReader reader = new InputStreamReader(url.openStream());

            Sensor_descr[] d = gson.fromJson(reader, Sensor_descr[].class);

            // Imprimir los datos de Sensor_descr
            for (Sensor_descr sd : d) {
                System.out.println(sd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Sensor_values() {
        Gson gson = new Gson();
        try {
            URL urlSensor_values = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");
            InputStreamReader readerSensor_values = new InputStreamReader(urlSensor_values.openStream());

            Sensor_values[] v = gson.fromJson(readerSensor_values, Sensor_values[].class);

            // Imprimir los datos de Sensor_descr
            for (Sensor_values sv : v) {
                System.out.println(sv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person();
        Employees();
        Sensor_descr();
        Sensor_values();
    }
}


