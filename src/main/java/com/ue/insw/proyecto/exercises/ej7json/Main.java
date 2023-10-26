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

            // Usamos un for para recorrer los arrays y guardarlos en los jsonObjects
            for (int i = 0; i < jsonArray_v.size(); i++) {
                System.out.println("\nSensor " + (i+1) + ": ");
                JsonObject jsonObject_v = jsonArray_v.get(i).getAsJsonObject();
                System.out.println("Valores del sensor: " + jsonObject_v.toString());
                JsonObject jsonObject_d = jsonArray_d.get(i).getAsJsonObject();
                System.out.println("Descripción del sensor: " + jsonObject_d.toString());
            }

            /** 
             * QUERÍA IMPRIMIRLO BONITO PERO DA ERROR POR LA ESTRUCTURA DEL JSON :(
             * 
            // Guardamos el JsonArray como JSON en un fichero
            Files.write(Paths.get("C:/Users/pablo/Documents/Java Projects/insw2023/src/main/java/com/ue/insw/proyecto/exercises/ej7json/valores.json"), jsonValores.toString().getBytes());
            Files.write(Paths.get("C:/Users/pablo/Documents/Java Projects/insw2023/src/main/java/com/ue/insw/proyecto/exercises/ej7json/descripciones.json"), jsonDescripciones.toString().getBytes());

            // Repetimos el proceso que se usó anteriormente pero con los ficheros que acabamos de crear
            String ruta_v = "C:/Users/pablo/Documents/Java Projects/insw2023/src/main/java/com/ue/insw/proyecto/exercises/ej7json/valores.json";
            String ruta_d = "C:/Users/pablo/Documents/Java Projects/insw2023/src/main/java/com/ue/insw/proyecto/exercises/ej7json/descripciones.json";

            // Creamos files y gson para ambos
            File file_v = new File(ruta_v);
            Gson gson_v = new Gson();
            File file_d = new File(ruta_d);
            Gson gson_d = new Gson();

            // Miramos si existen y se pueden leer
            if (file_v.exists() && file_v.canRead() && file_d.exists() && file_d.canRead()) { 
                try {
                    // Read the JSON file into a string
                    Reader reader_v_f = Files.newBufferedReader(Paths.get(ruta_v));
                    Reader reader_d_f = Files.newBufferedReader(Paths.get(ruta_d));

                    // Convert the JSON string to a Java object
                    ObjetoValores[] obj_v = gson_v.fromJson(reader_v_f, ObjetoValores[].class);
                    ObjetoDescripciones[] obj_d = gson_d.fromJson(reader_d_f, ObjetoDescripciones[].class);

                    // Print the data from the Java object
                    // Bucle for para recorrer el array de empleados
                    for (ObjetoValores objetoValores : obj_v) {
                        System.out.println("\nValores del sensor " + objetoValores.getNum() + ": ");
                        System.out.println(" - Tipo: " + objetoValores.getType());
                        System.out.println(" - Valores: " + objetoValores.getValues());
                    }

                    // Hacemos lo mismo con las descripciones
                    for (ObjetoDescripciones objetoDescripciones : obj_d) {
                        System.out.println("\nDescripción del sensor " + objetoDescripciones.getNum() + ": ");
                        System.out.println(" - Tipo: " + objetoDescripciones.getType());
                        System.out.println(" - Campos: " + objetoDescripciones.getFields());
                        System.out.println(" - Propiedades: " + objetoDescripciones.getProperties());
                    }

                } catch (IOException e) {
                    // Handle the IOException
                }
            } else {
                System.out.println("Error: Este programa no ha hecho nada");
                // Handle the case where the file does not exist or cannot be read
            }

            // Cerramos los lectores
            reader_v.close();
            reader_d.close(); */

        } catch(Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }  
    } 
}