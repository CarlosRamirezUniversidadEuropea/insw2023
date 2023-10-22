package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), 50, Gasoline.GASOLEO_A );
        peugeot.on();
        peugeot.fillCombustible(Gasoline.GASOLEO_A, 25);
        peugeot.startDriving(70, 60);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

        Bicycle orbea = new Bicycle(new BigDecimal(300), Brand.ORBEA, Color.BLUE);
        orbea.startDriving(30, 60);
        System.out.println(orbea.getColor());
        System.out.println(orbea.getBrand());
        System.out.println(orbea.getPrice());
        System.out.println(orbea.toString());
        orbea.clean();

        Truck mercedes = new Truck(new BigDecimal(50000), Brand.MERCEDES, Color.RED, 200, 5000, Gasoline.OCTANE_98);
        mercedes.on();
        mercedes.fillCombustible(Gasoline.OCTANE_98, 600);
        mercedes.startDriving(180, 60);
        System.out.println(mercedes.toString());
    }
}
