package com.ue.insw.proyecto.exercises.ej7json;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static <Value> void main(String[] args) {
        System.out.println();
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
                System.out.println("Nombre: " + obj.getFirst_name());
                System.out.println("Apellido: " + obj.getLast_name());
                System.out.println("Localicacion: " + obj.getLocation());
                System.out.println("Seguidores: " + obj.getFollowers());
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
        System.out.println();
        String ruta2 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        File file2 = new File(ruta2);
        Gson gson2 = new Gson();
        if (file2.exists() && file2.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta2));

                // Convert the JSON string to a Java object
                Employes[] objArray = gson2.fromJson(reader, Employes[].class);

                // Print the data from the Java object
                for (Employes obj : objArray) {
                    System.out.println("Nombre: " + obj.getName());
                    System.out.println("Email: " + obj.getEmail());
                    System.out.println("Cumpleaños: " + obj.getBirth());
                    System.out.println("Numero de telefono: " + obj.getPhone());
                }
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
        System.out.println();
        String ruta3 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/Link1.json";
        File file3 = new File(ruta3);
        Gson gson3 = new Gson();
        if (file3.exists() && file3.canRead()) {
            try {

                Reader reader = Files.newBufferedReader(Paths.get(ruta3));


                Link1[] dataEntries = gson3.fromJson(reader, Link1[].class);


                for (Link1 entry : dataEntries) {
                    System.out.println("Type: " + entry.getType());
                    System.out.println("Num: " + entry.getNum());
                    System.out.println("Values:");
                    for (List<Values> valuesList : entry.getValues()) {
                        for (Values values : valuesList) {
                            System.out.println("Value: " + values.getV());
                        }
                    }
                }
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
        System.out.println();
        String ruta4 = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/Link2.json";
        File file4 = new File(ruta4);
        Gson gson4 = new Gson();
        if (file4.exists() && file4.canRead()) {

                try {
                    // Read the JSON file into a string
                    Reader reader = Files.newBufferedReader(Paths.get(ruta4));

                    // Convert the JSON string to a Java object
                    Link2[] dataEntries = gson4.fromJson(reader, Link2[].class);

                    // Print the data from the Java object
                    for (Link2 obj : dataEntries) {
                        System.out.println("Type: " + obj.getType());
                        System.out.println("Num: " + obj.getNum());

                        System.out.println("Fields:");
                        for (Field fields:obj.getFields() ) {
                            System.out.println("Name: " + fields.getName());
                            System.out.println("Unit: " + fields.getUnit());
                            System.out.println("Decimal Precision: " + fields.getDecPrecision());
                        }

                        System.out.println("Properties:");
                        for (Properties property : obj.getProperties()) {
                            System.out.println("ID: " + property.getId());
                            System.out.println("Name: " + property.getName());
                        }

                    }
                } catch (IOException e) {
                    // Handle the IOException
                }

            } else{
                System.out.println("Error: Este programa no ha hecho nada");
                // Handle the case where the file does not exist or cannot be read
            }

        }
    }







