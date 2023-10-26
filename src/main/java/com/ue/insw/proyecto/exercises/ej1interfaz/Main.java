package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.fillCombustible(Gasoline.OCTANE_95,100);
        System.out.println(peugeot.getGasoline());
        peugeot.startDriving(90,200);
        peugeot.clean();

        Truck renault = new Truck(Brand.RENAULT, Color.BLACK, 90, new BigDecimal(70000));
        System.out.println(renault.getPrice());
        System.out.println(renault.getBrand());
        System.out.println(renault.getColor());
        System.out.println(renault.toString());
        renault.fillCombustible(Gasoline.OCTANE_95,100);
        System.out.println(renault.getGasoline());
        renault.startDriving(90,200);
        renault.clean();

        Bicycle roja = new Bicycle( Color.BLACK, 40, new BigDecimal(1000));
        System.out.println(roja.getPrice());
        System.out.println(roja.getColor());
        System.out.println(roja.toString());
        roja.startDriving(90,200);
        renault.clean();
    }
}
