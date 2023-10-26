package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import javafx.beans.value.ObservableNumberValue;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150,50, new BigDecimal(12000), Gasoline.OCTANE_95,100, Status.ON);
        System.out.println(peugeot.getBrand());
        System.out.println("el precio del coche es: " + peugeot.getPrice() + "$");
        System.out.println("EL coche tiene un deposito maximo de: " + peugeot.getFuelCapacity()+ " litros");
        System.out.println("tiene un deposito actual de: "+ peugeot.getFuelLevel());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

       System.out.println("-----------------------------------------------------\n" +
               "-----------------------------------------------------");
        Car ford = new Car(Brand.FORD, Color.RED, 135,0, new BigDecimal(15000),Gasoline.GASOLEO_A,60,Status.STOPED);
        System.out.println(ford.toString());
        System.out.println(ford.getBrand());
        System.out.println("el precio de este coche es: "+ ford.getPrice()+ "€");
        System.out.println("el deposito de este modelo es de: "+ ford.getFuelCapacity()+ "L");
        System.out.println("actualmente tiene un nivel de gasolina de: " + ford.getFuelLevel() + "L");
        System.out.println("este modelo esta en color: " + ford.getColor());
        ford.clean();
        System.out.println("-----------------------------------------------------\n" +
                "-----------------------------------------------------");

        Car toyota = new Car(Brand.TOYOTA, Color.RED, 180, 80, new BigDecimal("25000"), Gasoline.OCTANE_98, 60, Status.ON);

        // Llenar combustible
        try {
            toyota.fillCombustible(Gasoline.OCTANE_98, 20); // Intentamos llenar 20 litros de gasolina.
            System.out.println("Combustible llenado con éxito. Nivel de combustible: " + toyota.getFuelLevel());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al llenar combustible: " + e.getMessage());
        }

        // Iniciar la conducción
        try {
            toyota.startDriving(80, 2); // Intentamos iniciar la conducción a 80 km/h durante 2 horas. y no deberia funcionar el coche ya etsa encendido
            System.out.println("Conducción iniciada a " + toyota.getSpeed() + " km/h.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al iniciar la conducción: " + e.getMessage());
        }
        System.out.println("-----------------------------------------------------\n" +
                "-----------------------------------------------------");

        Truck mercedesTruck = new Truck(Brand.MERCEDES, Color.BLACK, 90,0, new BigDecimal(150000),Gasoline.GASOLEO_A,600,Status.ON);

        System.out.println(mercedesTruck.toString());

        try {
            mercedesTruck.startDriving(0, 1); // Intentamos iniciar la conduccion
            System.out.println("Conducción iniciada a " + mercedesTruck.getSpeed() + " km/h.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al iniciar la conducción: " + e.getMessage());
        }
        try {
            mercedesTruck.fillCombustible(Gasoline.OCTANE_98, 20); // Intentamos llenar 20 litros de gasolina.
            System.out.println("Combustible llenado con éxito. Nivel de combustible: " + mercedesTruck.getFuelLevel());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al llenar combustible: " + e.getMessage());
        }

        System.out.println("-----------------------------------------------------\n" +
                "-----------------------------------------------------");

        Bicycle bicycle = new Bicycle(Brand.ORBEA, Color.RED, 30, 0, new BigDecimal("500"), 0, Status.STOPED);

        // Iniciar el viaje en bicicleta
        try {
            bicycle.startRiding(20); // Intentamos iniciar el viaje a una velocidad de 20 km/h.
            System.out.println("Viaje en bicicleta iniciado a " + bicycle.getSpeed() + " km/h.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al iniciar el viaje en bicicleta: " + e.getMessage());
        }

        // Detener la bicicleta
        bicycle.stop();
        System.out.println("La bicicleta se ha detenido.");

        // Limpieza de la bicicleta
        bicycle.clean();

    }
    }
