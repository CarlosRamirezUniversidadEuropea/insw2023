package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.GASOLEO_A,100);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.on();
        System.out.println(peugeot.toString());
        peugeot.setSpeed(100);
        System.out.println(peugeot.toString());
        peugeot.stop();
        System.out.println(peugeot.toString());
        try {
            peugeot.fillCombustible(Gasoline.GASOLEO_A, 8);
            peugeot.startDriving(50,10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(peugeot.toString());

        peugeot.clean();

    }
}
