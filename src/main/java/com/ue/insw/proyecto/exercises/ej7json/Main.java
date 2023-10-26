package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 7: JSON");
        System.out.println("Realizado por Pablo Ribas Borrego (AWDn0n)");

        // Guardamos la ruta
        System.out.println("\n\nLeyendo los datos de los usuarios...");
        String ruta_p = "C:/Users/pablo/Documents/Java Projects/insw2023/src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        
        // Create a File object for the JSON file
        File file_p = new File(ruta_p);
        Gson gson_p = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file_p.exists() && file_p.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta_p));

                // Convert the JSON string to a Java object
                Persona obj = gson_p.fromJson(reader, Persona.class);

                // Print the data from the Java object
                System.out.println("\nDatos del usuario: ");
                System.out.println(" - Nombre: " + obj.getFirst_name());
                System.out.println(" - Apellido(s): " + obj.getLast_name());
                System.out.println(" - Ubicación: " + obj.getLocation());
                System.out.println(" - Online (Sí/No): " + obj.isOnline());
                System.out.println(" - Seguidores: " + obj.getFollowers());
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        // Repetimos el proceso anterior pero con el JSON de empleados
        System.out.println("\n\nLeyendo los datos de los empleados...");
        String ruta_e = "C:/Users/pablo/Documents/Java Projects/insw2023/src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        
        // Create a File object for the JSON file
        File file_e = new File(ruta_e);
        Gson gson_e = new Gson();

        // Check if the file exists and if we have permission to read it
        if (file_e.exists() && file_e.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader_e = Files.newBufferedReader(Paths.get(ruta_e));

                // Convert the JSON string to a Java object
                Empleado[] obj_e = gson_e.fromJson(reader_e, Empleado[].class);

                // Print the data from the Java object
                // Bucle for para recorrer el array de empleados
                for (Empleado empleado : obj_e) {
                    System.out.println("\nEmplead@: ");
                    System.out.println(" - Nombre: " + empleado.getName());
                    System.out.println(" - Correo: " + empleado.getEmail());
                    System.out.println(" - Número de teléfono: " + empleado.getPhone());
                    System.out.println(" - Suscrito (Sí/No): " + empleado.isSubscribed());
                    System.out.println(" - Fecha de nacimiento: " + empleado.getBirth());
                }

            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        // Tratamos de leer los datos de los sensores, encapsulamiento en un try-catch por si no se pueden leer
        System.out.println("\n\nLeyendo los datos de los sensores...");

        try {

            // Definimos las URLs del enunciado
            URL URL_v = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json");
            URL URL_d = new URL("https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json");

            // Creamos los lectores
            InputStreamReader reader_v = new InputStreamReader(URL_v.openStream());
            InputStreamReader reader_d = new InputStreamReader(URL_d.openStream());

            // Convertimos las respuestas de los readers a JSON
            JsonArray jsonArray_v = JsonParser.parseReader(reader_v).getAsJsonArray();
            JsonArray jsonArray_d = JsonParser.parseReader(reader_d).getAsJsonArray();

            // Creamos los GSON
            Gson gson_v = new Gson();
            Gson gson_d = new Gson();

            // Creamos los arrays de objetos
            SensorValores[] obj_v = new SensorValores[jsonArray_v.size()];
            SensorDescripciones[] obj_d = new SensorDescripciones[jsonArray_d.size()];

            // Bucle for para ir convirtiendo cada posición del JSONArray a un JSONObject
            for (int i = 0; i < jsonArray_v.size(); i++) {
                // Vamos convirtiendo cada posición del array
                JsonObject jsonObject_v = jsonArray_v.get(i).getAsJsonObject();

                // Lo guarda en el array de objetos
                obj_v[i] = gson_v.fromJson(jsonObject_v.toString(), SensorValores.class);
            }

            // Lo mismo para el otro array
            for (int i = 0; i < jsonArray_d.size(); i++) {
                // Vamos convirtiendo cada posición del array
                JsonObject jsonObject_d = jsonArray_d.get(i).getAsJsonObject();

                // Lo guarda en el array de objetos
                obj_d[i] = gson_d.fromJson(jsonObject_d.toString(), SensorDescripciones.class);
            }

            // Bucle for para recorrer los arrays de valores y descripciones, imprimiendo los datos de cada objeto
            for (int i = 0; i < obj_v.length || i < obj_d.length; i++) {
                if (i < obj_v.length) {
                    System.out.println("\nValores del sensor " + obj_v[i].getNum() + ": ");
                    System.out.println(" - Tipo: " + obj_v[i].getType());
                    System.out.println(" - Valores: " + obj_v[i].getValues());
                }
                if (i < obj_d.length) {
                    System.out.println("\nDescripción del sensor " + obj_d[i].getNum() + ": ");
                    System.out.println(" - Tipo: " + obj_d[i].getType());
                    System.out.println(" - Campos: " + obj_d[i].getFields());
                    System.out.println(" - Propiedades: " + obj_d[i].getProperties());
                }
            }
            System.out.print("\n");

            // Cerramos los lectores
            reader_v.close();
            reader_d.close();

        } catch(Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }  
    } 
}