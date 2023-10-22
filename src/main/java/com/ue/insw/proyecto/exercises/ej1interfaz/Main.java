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

        Bicycle bici = new Bicycle(Color.RED, 40, new BigDecimal(700));
        System.out.println(bici.getPrice());
        System.out.println(bici.getColor());
        System.out.println(bici.toString());
        bici.clean();

        Truck mack = new Truck(Brand.MERCEDES, Color.LIGHT_GREY, 199, new BigDecimal(50000));
        System.out.println(mack.getPrice());
        System.out.println(mack.getBrand());
        System.out.println(mack.getColor());
        System.out.println(mack.toString());
        mack.clean();

    }


}
