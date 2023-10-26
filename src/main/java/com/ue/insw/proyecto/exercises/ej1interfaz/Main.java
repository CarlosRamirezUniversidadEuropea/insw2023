package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println ("Informacion del carro: ");
        System.out.println(peugeot.toString());
        System.out.println("Precio: " + peugeot.getPrice());
        try {
            peugeot.on();
            peugeot.stop();
            peugeot.setSpeed(100);
            peugeot.fillCombustible(Gasoline.OCTANE_95, 30, 50);
            peugeot.startDriving(60, 10);
            peugeot.setMaxSpeed(200);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
        peugeot.clean();

        System.out.println();
        Bicycle bicycle = new Bicycle( Color.RED , 30, "montaña", new BigDecimal("500.00"));
        System.out.println ("Informacion de la bicicleta: ");
        System.out.println(bicycle.toString());
        System.out.println("Precio: " + bicycle.getPrice());
        bicycle.clean();

        System.out.println();
        Truck truck = new Truck(Brand.MERCEDES, Color.WHITE, 120, "de lona", new BigDecimal("50000.00"));
        System.out.println ("Informacion del camion: ");
        System.out.println(truck.toString());
        System.out.println("Precio: " + truck.getPrice());
        truck.clean();

    }
}
