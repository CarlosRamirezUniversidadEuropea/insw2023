package com.ue.insw.proyecto.exercises.ej7json;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;



import java.io.IOException;

import java.io.File;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;




public class Main {

    public static void main(String[] args) {
        String personFilePath = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/person.json";
        String employeesFilePath = "src/main/java/com/ue/insw/proyecto/exercises/ej7json/employees.json";
        File personFile = new File(personFilePath);//Crea objetos archivo para los archivos json
        File employeesFile = new File(employeesFilePath);
        Gson gson = new Gson();

        if (personFile.exists() && personFile.canRead()) {//comprueba si el archivo json de persona existe y es redeable.
            try {
                Reader reader = Files.newBufferedReader(Paths.get(personFilePath));//lee el archivo JSON a un string
                Persona persona = gson.fromJson(reader, Persona.class);//convierte el JSON string a un objeto de java (Persona)
                System.out.println(persona);//printea la informacion de esta Persona
            } catch (IOException e) {
                System.out.println("Error when reading persona: " + e);
            }
        } else {
            System.out.println("Error, el archivo PERSON no existe o no se puede leer");
        }
        System.out.println();


        //Comprueba si el archivo de employees.json existe y es readeable.
        if (employeesFile.exists() && employeesFile.canRead()) {
            try {
                Reader reader = Files.newBufferedReader(Paths.get(employeesFilePath));//lee el archivo JSON a un string
                Employee[] employees = gson.fromJson(reader, Employee[].class);//convierte el JSON string a una lista de objetos de java (Employee[])
                for (Employee employee : employees) {//printea la informacion de esta lista
                    System.out.println(employee);
                }

            } catch (IOException e) {
                System.out.println("Error when reading employees: " + e);
            }
        } else {
            System.out.println("Error, el archivo employees no existe o no se puede leer");
        }


    }
}
