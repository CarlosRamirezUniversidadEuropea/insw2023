package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String rutaPerson = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String rutaEmployees = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        String sensor1 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        String sensor2 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";

        // Create a File object for the JSON file
        File filePerson = new File(rutaPerson);
        File fileEmployees = new File(rutaEmployees);
        Gson gson = new Gson();

        // Check if the file exists and if we have permission to read it
        // PERSONA
        if (filePerson.exists() && filePerson.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(rutaPerson));

                // Convert the JSON string to a Java object
                Persona persona = gson.fromJson(reader, Persona.class);

                // Print the data from the Java object
                System.out.println(persona);
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al leer Persona: " + e);
            }
        } else {
            System.out.println("Error: This file does not exist or cannot be read");
        }

        System.out.println(); // Salto de linea
        // EMPLEADO
        if (fileEmployees.exists() && fileEmployees.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(rutaEmployees));

                // Convert the JSON string to a Java object
                Employee[] employees = gson.fromJson(reader, Employee[].class);

                // Print the data from the Java object
                for (Employee employee : employees) {
                    System.out.println(employee);
                }

            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al leer Persona: " + e);
            }
        } else {
            System.out.println("Error: This file does not exist or cannot be read");
        }

        // SENSOR 1
        System.out.println(); // Salto de linea
        System.out.println("Sensor 1: \n" + reedJSONfromURL(sensor1, Sensor1.class));

        // SENSOR 2
        System.out.println(); // Salto de linea
        System.out.println("Sensor 2: \n" + reedJSONfromURL(sensor2, Sensor2.class));
    }

    /**
     * Funcion que lee un JSON de una URL
     *
     * @param url    URL del JSON
     * @param object Objeto para el JSON
     * @return String con todos los datos del JSON
     */
    static String reedJSONfromURL(String url, Object object) {
        StringBuilder datos = new StringBuilder();
        Gson gson = new Gson();

        try {
            //Crear una URL y abrir una conexión
            URL jsonUrl = new URL(url);
            InputStreamReader reader = new InputStreamReader(jsonUrl.openStream());

            // Usar Gson para analizar el JSON
            Object[] objects = gson.fromJson(reader, Object[].class);

            // Realiza operaciones con los datos
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


