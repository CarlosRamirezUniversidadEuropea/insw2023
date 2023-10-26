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

        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(18000), Gasoline.OCTANE_95, 300);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        peugeot.fillCombustible(Gasoline.OCTANE_95,100);
        peugeot.startDriving(100, 10);
        System.out.println(peugeot.toString());
        peugeot.clean();

        Truck ford = new Truck(Brand.FORD, Color.BLUE, 120, new BigDecimal(60000), Gasoline.GASOLEO_A, 800);
        System.out.println(ford.getPrice());
        System.out.println(ford.getBrand());
        System.out.println(ford.getColor());
        ford.fillCombustible(Gasoline.GASOLEO_A,400);
        ford.startDriving(80, 40);
        System.out.println(ford.toString());
        peugeot.clean();

        Bicycle bici = new Bicycle(Color.LIGHT_GREY, 40, new BigDecimal(1200));
        System.out.println(bici.getPrice());
        System.out.println(bici.getColor());
        System.out.println(bici.toString());
        bici.startDriving(14, 10);
        peugeot.clean();
    }
}
