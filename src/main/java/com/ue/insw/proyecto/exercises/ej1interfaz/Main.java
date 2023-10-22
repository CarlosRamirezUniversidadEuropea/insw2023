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
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        peugeot.toString();

        Truck camion = new Truck(Brand.RENAULT,Color.WHITE,120,new BigDecimal(90000));
        camion.on();
        camion.fillCombustile(Gasoline.OCTANE_98,50);
        System.out.println(camion.getMaxSpeed());
        camion.startDriving(20,18700);
        System.out.println(camion.getSpeed());
        System.out.println(camion.toString());
        camion.clean();
        camion.toString();

        Bicycle bici = new Bicycle(Color.LIGHT_GREY,70, new BigDecimal(3500));
        System.out.println(bici.getColor());
        bici.clean();
        System.out.println(bici.getMaxSpeed());
        bici.on();
        System.out.println(bici.getStatus());
        bici.toString();
    }
}
