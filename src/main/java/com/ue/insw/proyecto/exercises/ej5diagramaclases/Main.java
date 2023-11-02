package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a company with its employees and clients. Print all the information on the screen
        List<Empleado> empleadosGoogle = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado("Pedro", 30, 500);
        Directivo directivo1 = new Directivo("Juan", 40, 5000, "CEO");
        empleadosGoogle.add(empleado1);
        empleadosGoogle.add(directivo1);
        List<Cliente> clientesGoogle = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("Pablo", 30, "Google", 600987362);
        clientesGoogle.add(cliente1);
        Empresa google = new Empresa("Google", empleadosGoogle, clientesGoogle);
        System.out.println(google.toString());
        
        List<Empleado> empleadosAmazon = new ArrayList<Empleado>();
        Empleado empleado2 = new Empleado("Maria", 25, 400);
        Directivo directivo2 = new Directivo("David", 50, 3000, "CTO");
        empleadosAmazon.add(empleado2);
        empleadosAmazon.add(directivo2);
        List<Cliente> clientesAmazon = new ArrayList<Cliente>();
        Cliente cliente2 = new Cliente("Ana", 25, "Amazon", 634988362);
        clientesAmazon.add(cliente2);
        Empresa amazon = new Empresa("Amazon", empleadosAmazon, clientesAmazon);
        System.out.println(amazon.toString());
    }
}
