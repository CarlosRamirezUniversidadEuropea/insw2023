package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static String getJsonFromUrl(String urlString) throws IOException {

        StringBuilder jsonResult = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                jsonResult.append(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResult.toString();
    }

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

        String rutaEmployees = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        // Create a File object for the JSON file
        File fileEmployees = new File(rutaEmployees);
        if (fileEmployees.exists() && fileEmployees.canRead()) {
            try {
                Reader reader = Files.newBufferedReader(Paths.get(rutaEmployees));
                Employee[] employees = gson.fromJson(reader, Employee[].class);
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        String urlSensors = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";
        String urlReadings = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";

        try {
            // Fetch and parse JSON for Sensors
            String sensorsJson = getJsonFromUrl(urlSensors);
            Sensor[] sensors = gson.fromJson(sensorsJson, Sensor[].class);

            // Fetch and parse JSON for Readings
            String readingsJson = getJsonFromUrl(urlReadings);
            Reading[] readings = gson.fromJson(readingsJson, Reading[].class);

            // Assign the readings to the sensors
            for (Sensor s : sensors) {
                for (Reading r : readings) {
                    if (s.getNum() == r.getNum()) {
                        s.setReadings(r);
                    }
                }
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
