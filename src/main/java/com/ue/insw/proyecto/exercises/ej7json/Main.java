package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta1 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        String sensorVal = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        String sensorDescrp = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        File file1 = new File(ruta1);
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

                System.out.println("\n");
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
        if (file1.exists() && file1.canRead()) {
            try {
                Reader reader1 = Files.newBufferedReader(Paths.get(ruta1));

                List<Employees> employeesList = gson.fromJson(reader1, new TypeToken<List<Employees>>() {
                }.getType());
                for (Employees employee : employeesList) {
                    System.out.println("Nombre: " + employee.getName());
                    System.out.println("Email: " + employee.getEmail());
                    System.out.println("Teléfono: " + employee.getPhone());
                    System.out.println("Fecha de Nacimiento: " + employee.getBirth());
                    System.out.println("Subscrito: " + employee.isSubscribed());
                    System.out.println("-----");
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Este es el sensor de datos");

            StringBuilder sensorDatosDesc = new StringBuilder();
            try {

                URL sensor1 = new URL(sensorDescrp);
                InputStreamReader reader = new InputStreamReader(sensor1.openStream());

                List<SensorDescr> sensorDescList = gson.fromJson(reader, new TypeToken<List<SensorDescr>>() {
                }.getType());
                for (SensorDescr sensor : sensorDescList) {
                    sensorDatosDesc.append((sensor.toString()));
                    sensorDatosDesc.append("\n");

                }
                System.out.println(sensorDatosDesc);
            } catch (Exception e) {
                System.out.println(e);
            }
            StringBuilder sensorDatosValues = new StringBuilder();
            try {

                URL sensor1 = new URL(sensorVal);
                InputStreamReader reader = new InputStreamReader(sensor1.openStream());

                List<SensorValues> sensorValList = gson.fromJson(reader, new TypeToken<List<SensorValues>>() {
                }.getType());
                for (SensorValues sensor : sensorValList) {
                    sensorDatosValues.append((sensor.toString()));
                    sensorDatosValues.append("\n");

                }
                System.out.println(sensorDatosValues);
            } catch (Exception e) {
                System.out.println(e);
            }

/**
 *
 if (file3.exists() && file3.canRead()) {
 try{
 Reader reader3 = Files.newBufferedReader(Paths.get(ruta3));
 List<SensorValues> sensorValues = gson.fromJson(reader3, new TypeToken<List<SensorValues>>() {}.getType());

 for (SensorValues sensor : sensorValues) {
 System.out.println("Type: " + sensor.getType());
 System.out.println("Num: " + sensor.getNum());
 System.out.println("Values:");

 List<List<Values>> valueLists = sensor.getValues();
 for (List<Values> innerList : valueLists) {
 for (Values value : innerList) {
 System.out.println("v: " + value.getV());
 }
 }
 }

 } catch (IOException e) {
 throw new RuntimeException(e);
 }
 }
 */
        }
    }
}
