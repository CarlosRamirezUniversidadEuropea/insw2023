package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String ruta1 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/sensor_descr.json";
        String ruta3 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/sensor_values.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        Gson gson = new Gson();
        File file1 = new File(ruta1);
        Gson gson1 = new Gson();
        File file2 = new File(ruta1);
        Gson gson2 = new Gson();
        File file3 = new File(ruta3);
        Gson gson3 = new Gson();

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
            try{
                Reader reader1 = Files.newBufferedReader(Paths.get(ruta1));

                List<Employees> employeesList = gson1.fromJson(reader1, new TypeToken<List<Employees>>() {}.getType());
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
            if (file2.exists() && file2.canRead()) {
                try {
                    Reader reader2 = Files.newBufferedReader(Paths.get(ruta2));

                    List<SensorDescr> sensorDescrs = gson2.fromJson(reader2, new TypeToken<List<SensorDescr>>() {}.getType());
                    for (SensorDescr sensor : sensorDescrs) {
                        System.out.println("Type: " + sensor.getType());
                        System.out.println("Num: " + sensor.getNum());
                        System.out.println("Fields:");

                        List<Fields> field = sensor.getFields();
                        for (Fields fields : field) {
                            System.out.println("  Name: " + fields.getName());
                            System.out.println("  Unit: " + fields.getUnit());
                            System.out.println("  DecPrecision: " + fields.getDecPrecision());
                        }
                        System.out.println("Properties:");
                        List<Properties> prop = sensor.getProperties();
                        for (Properties property : prop) {
                            System.out.println("  Id: " + property.getId());
                            System.out.println("  Name: " + property.getName());
                        }
                        System.out.println("----------------------");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (file3.exists() && file3.canRead()) {
                    try{
                        Reader reader3 = Files.newBufferedReader(Paths.get(ruta3));
                        List<SensorValues> sensorValues = gson3.fromJson(reader3, new TypeToken<List<SensorValues>>() {}.getType());

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
    }
}}}
