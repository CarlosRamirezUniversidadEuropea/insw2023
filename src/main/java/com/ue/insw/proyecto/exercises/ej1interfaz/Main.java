package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 170, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

        Truck mercedes = new Truck(Brand.MERCEDES, Color.WHITE, 90, new BigDecimal(455000));
        System.out.println(mercedes.getPrice());
        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.getColor());
        System.out.println(mercedes.toString());
        mercedes.clean();

        Bicycle orbea = new Bicycle(Brand.ORBEA, Color.BLUE, 60, new BigDecimal(1200));
        System.out.println(orbea.getPrice());
        System.out.println(orbea.getBrand());
        System.out.println(orbea.getColor());
        System.out.println(orbea.toString());
        orbea.clean();



    }
}
