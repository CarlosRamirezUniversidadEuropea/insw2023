package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;

public class  Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        String url1 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";
        String url2 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        File file2 = new File(ruta2);
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
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }

        if(file2.exists() && file2.canRead()){
            try{
                Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));
               Vector<Employee> employeeList = gson.fromJson(reader2, new TypeToken<Vector<Employee>>(){}.getType());
                for (Employee employee : employeeList){
                    System.out.println(employee.getName());
                    System.out.println(employee.getEmail());
                    System.out.println(employee.getPhone());
                    System.out.println(employee.getBirth());
                    System.out.println(employee.isSuscribed());
                }
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
        else{
            System.out.println("No ha hecho nada");
        }

        try{
            URL urlObjeto = new URL(url1);
            HttpURLConnection connection = (HttpURLConnection) urlObjeto.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if(responseCode == 200){
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder respuesta = new StringBuilder();
                while ((inputLine = in.readLine()) != null){
                    respuesta.append(inputLine);
                }
                in.close();
                Vector<Sensor2> sensor2s = gson.fromJson(respuesta.toString(), new TypeToken<Vector<Sensor2>>(){}.getType());

                for (Sensor2 sensor2 : sensor2s){
                    System.out.println(sensor2.getNum());
                    System.out.println(sensor2.getType());
                    for(Campos field : sensor2.getFields()){
                        System.out.println(field.getUnit() + ", " + field.getName() + ", " + field.getDecPrecision());
                    }
                    for(Propiedades proper : sensor2.getProperties()){
                        System.out.println(proper.getId() + ", " + proper.getName());
                    }

                }
            }
            else{
                System.out.println("Error al acceder al Json");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            URL urlObjeto2 = new URL(url2);
            HttpURLConnection connection2 = (HttpURLConnection) urlObjeto2.openConnection();
            connection2.setRequestMethod("GET");

            int responseCode2 = connection2.getResponseCode();
            if(responseCode2 == 200){
                BufferedReader in2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
                String inputLine2;
                StringBuilder respuesta2 = new StringBuilder();
                while ((inputLine2 = in2.readLine()) != null){
                    respuesta2.append(inputLine2);
                }
                in2.close();
                Vector<Sensor1> sensor1s = gson.fromJson(respuesta2.toString(), new TypeToken<Vector<Sensor1>>(){}.getType());

                for (Sensor1 sensor1 : sensor1s){
                    System.out.println(sensor1.getType());
                    System.out.println(sensor1.getNum());
                    for(Vector<Valores> vectorVal : sensor1.getValues()){
                        for(Valores val : vectorVal){
                            System.out.println(val.getV());
                        }
                    }
                }
            }
            else{
                System.out.println("Error al acceder al Json");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
