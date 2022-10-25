package com.ue.insw.proyecto.exercises.ej1;

import com.ue.insw.proyecto.exercises.ej1.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
    }
}
