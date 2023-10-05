package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car ford = new Car(Brand.FORD, Color.RED, 200, new BigDecimal(10000), 50, Gasoline.OCTANE_95);
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), 60, Gasoline.OCTANE_98);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        try {
            ford.fillCombustible(Gasoline.OCTANE_95, 20);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
