package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    // Función para obtener JSON desde una URL
    public static String getJsonFromUrl(String urlString) throws IOException {
        StringBuilder jsonResult = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                jsonResult.append(line);
            }
        } catch (IOException e) {
            System.out.println("Error fetching JSON: " + e.getMessage());
        }
        return jsonResult.toString();
    }

    public static void main(String[] args) {
        // Ruta al archivo JSON de persona local (cambiar a la ubicación correcta)
        String ruta = "persona.json";
        File file = new File(ruta);
        Gson gson = new Gson();

        if (file.exists() && file.canRead()) {
            try {
                // Leer el archivo JSON en una cadena
                Reader reader = Files.newBufferedReader(Paths.get(ruta));

                // Convertir la cadena JSON en un objeto Java (Persona)
                Persona obj = gson.fromJson(reader, Persona.class);

                // Imprimir los datos de la persona
                System.out.println("Nombre: " + obj.getFirst_name());
                System.out.println("Apellido: " + obj.getLast_name());
                System.out.println("Ubicación: " + obj.getLocation());
                System.out.println("Seguidores: " + obj.getFollowers());
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Error: El archivo de persona no existe o no se puede leer");
        }

        // Ruta al archivo JSON de empleados local (cambiar a la ubicación correcta)
        String rutaEmployees = "employees.json";
        File fileEmployees = new File(rutaEmployees);

        if (fileEmployees.exists() && fileEmployees.canRead()) {
            try {
                // Leer el archivo JSON en una cadena
                Reader reader = Files.newBufferedReader(Paths.get(rutaEmployees));

                // Convertir la cadena JSON en un array de empleados (Employee[])
                Employee[] employees = gson.fromJson(reader, Employee[].class);

                // Imprimir los datos de los empleados
                for (Employee employee : employees) {
                    System.out.println("Nombre: " + employee.getName());
                    System.out.println("Email: " + employee.getEmail());
                    System.out.println("Teléfono: " + employee.getPhone());
                    System.out.println("Subscrito: " + employee.isSubscribed());
                    System.out.println("Fecha de Nacimiento: " + employee.getBirth());
                    System.out.println();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Error: El archivo de empleados no existe o no se puede leer");
        }

        // URLs de archivos JSON de sensores y lecturas en línea
        String urlSensors = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";
        String urlReadings = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";

        try {
            // Obtener y analizar JSON para los sensores
            String sensorsJson = getJsonFromUrl(urlSensors);
            Sensor[] sensors = gson.fromJson(sensorsJson, Sensor[].class);

            // Obtener y analizar JSON para las lecturas
            String readingsJson = getJsonFromUrl(urlReadings);
            Lector[] lector = gson.fromJson(readingsJson, Lector[].class);

            // Asignar las lecturas a los sensores correspondientes
            for (Sensor s : sensors) {
                for (Lector r : lector) {
                    if (s.getNum() == r.getNum()) {
                        s.setLector(r);
                    }
                }
                // Imprimir los datos de los sensores
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
