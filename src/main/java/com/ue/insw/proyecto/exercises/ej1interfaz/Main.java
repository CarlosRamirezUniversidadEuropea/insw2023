package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Bic_Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Coche");
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.OCTANE_95, 90);

        System.out.println(peugeot.toString());
        System.out.println("------------------------------------");
        System.out.println("El coche cuesta: "+peugeot.getPrice());
        System.out.println("------------------------------------");
        peugeot.on();
        System.out.println("Echamos gasolina:");
        try {
            peugeot.fillCombustible(Gasoline.OCTANE_95, 50, 100);
        }catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("------------------------------------");
        System.out.println("Empezamos a conducir:");
        try {
            peugeot.startDriving(200, 12);
        }catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("------------------------------------");
        peugeot.clean();

        System.out.println();
        System.out.println("********************************************************************************");
        System.out.println();

        System.out.println("Camión");
        Truck mercedes = new Truck(new BigDecimal(12000), Brand.MERCEDES, Color.BLACK, Gasoline.OCTANE_95, 90, 17);

        System.out.println(mercedes.toString());
        System.out.println("------------------------------------");
        System.out.println("El camión cuesta: "+mercedes.getPrice());
        System.out.println("------------------------------------");
        mercedes.on();
        System.out.println("Echamos gasolina:");
        try {
            mercedes.fillCombustible(Gasoline.OCTANE_98, 50, 300);
        }catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("------------------------------------");
        System.out.println("Empezamos a conducir:");
        try {
            mercedes.startDriving(50, 12);
        }catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("------------------------------------");
        mercedes.clean();

        System.out.println();
        System.out.println("********************************************************************************");
        System.out.println();


        System.out.println("Bicicleta");
        Bicycle toyota = new Bicycle(Bic_Brand.BH, Color.BLACK, 30, new BigDecimal(12000));

        System.out.println(toyota.toString());
        System.out.println("------------------------------------");
        System.out.println("La bicicleta cuesta: "+toyota.getPrice());
        System.out.println("------------------------------------");
        toyota.on();
        System.out.println("Empezamos a pedalear:");
        try {
            toyota.startDriving(50, 12);
        }catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("------------------------------------");
        toyota.clean();

    }
}
