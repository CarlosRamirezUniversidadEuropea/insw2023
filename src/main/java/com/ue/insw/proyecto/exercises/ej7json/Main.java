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
    static String reedJSONURL(String url, Object object) {
        Gson gson1 = new Gson();
        StringBuilder datos = new StringBuilder();

        try {
            URL jsonUrl = new URL(url);
            InputStreamReader rdr3 = new InputStreamReader(jsonUrl.openStream());
            Object[] objects = gson1.fromJson(rdr3, Object[].class);
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
    public static void main(String[] args) {
        String rutaPersona = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String rutaEmpleado = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        String sensor1 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_values.json";
        String sensor2 = "https://raw.githubusercontent.com/CarlosRamirezUniversidadEuropea/json-data/main/sensor_descr.json";

        Gson gson = new Gson();
        File fileEmpleado = new File(rutaEmpleado);
        File filePersona = new File(rutaPersona);

        if (filePersona.exists() && filePersona.canRead()) {
            try {
                Reader rdr1 = Files.newBufferedReader(Paths.get(rutaPersona));

                Persona prsn = gson.fromJson(rdr1, Persona.class);
                System.out.println(prsn);

            } catch (IOException e) {
                System.out.println(" Error para leer Persona: " + e);
            }
        } else {
            System.out.println("Error: The file does not exist or cannot be read");
        }

        System.out.println();
        if (fileEmpleado.exists() && fileEmpleado.canRead()) {
            try {
                Reader rdr2 = Files.newBufferedReader(Paths.get(rutaEmpleado));
                Empleado[] empleado = gson.fromJson(rdr2, Empleado[].class);
                for (Empleado empleado1 : empleado) {
                    System.out.println(empleado1);
                }

            } catch (IOException e) {
                System.out.println("Error para leer Persona: " + e);
            }
        } else {
            System.out.println("Error: This file does not exist or cannot be read");
        }

        System.out.println("1º Sensor : \n" + reedJSONURL(sensor1, Sensor1.class));

        System.out.println("2º Sensor : \n" + reedJSONURL(sensor2, Sensor2.class));
    }


}
