package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        System.out.println();

        Truck mercedes = new Truck(Brand.MERCEDES, Color.BLACK, 100, new BigDecimal(40000));
        System.out.println(mercedes.getPrice());
        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.getColor());
        System.out.println(mercedes.toString());
        peugeot.clean();
        System.out.println();

        Bicycle specialized = new Bicycle(Brand.SPECIALIZED, Color.BLACK, 50, new BigDecimal(1000));
        System.out.println(specialized.getPrice());
        System.out.println(specialized.getBrand());
        System.out.println(specialized.getColor());
        System.out.println(specialized.toString());
        specialized.clean();
        System.out.println();

    }
}
