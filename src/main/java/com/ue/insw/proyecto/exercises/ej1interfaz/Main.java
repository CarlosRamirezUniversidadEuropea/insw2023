package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception{
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.OCTANE_95,50,30);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.fillCombustible(Gasoline.OCTANE_95,2);
        peugeot.startDriving(50);
        peugeot.clean();
        Truck t = new Truck(new BigDecimal(30000),Gasoline.OCTANE_95,150,0,Status.STOPED,200);
        System.out.println(t.toString());
        t.startDriving(40);
        Bicycle b = new Bicycle(new BigDecimal(1000),Status.STOPED);
        System.out.println(b.toString());
        b.startDriving(10);
    }
}
