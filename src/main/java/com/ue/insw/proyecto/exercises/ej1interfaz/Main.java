package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create a toyota
        Car toyota = new Car(Brand.TOYOTA, Color.BLUE, 180, BigDecimal.valueOf(25000), 60, Gasoline.OCTANE_95);

        // Call methods with different values
        toyota.on();
        toyota.setSpeed(60);
        toyota.startDriving(60, 10);
        toyota.fillCombustible(Gasoline.OCTANE_95, 50);
        toyota.clean();
        toyota.stop();
        System.out.println(toyota.toString());

        System.out.println("--------------------------------------------------");

        // Create truck and test all the methods in it
        Truck truck = new Truck(Color.BLACK, 100, BigDecimal.valueOf(100000), 1000);
        truck.on();
        truck.setSpeed(60);
        //truck.startDriving(60, 10);
        //truck.fillCombustible(Gasoline.OCTANE_95, 50);
        truck.clean();
        truck.stop();
        System.out.println(truck.toString());

        System.out.println("--------------------------------------------------");

        // Create a bicycle and test all the methods in it
        Bicycle bicycle = new Bicycle(Color.RED, BigDecimal.valueOf(1000));
        bicycle.on();
        bicycle.setSpeed(60);
        bicycle.clean();
        bicycle.stop();
        System.out.println(bicycle.toString());

        System.out.println("--------------------------------------------------");

    }
}
