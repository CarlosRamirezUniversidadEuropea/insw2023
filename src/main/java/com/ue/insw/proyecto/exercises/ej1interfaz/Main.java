package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
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
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

        Bicycle bicycle = new Bicycle(30)
    }
}
