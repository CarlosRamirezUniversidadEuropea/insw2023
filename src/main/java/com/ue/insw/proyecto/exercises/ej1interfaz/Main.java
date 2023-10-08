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
        System.out.println("Must be known that for default the vehicles: \n-Motor is off \n-The wheels are inflated \n-The windows are closed \n-The doors are closed \n-The vehicle is stopped \n-The maximum speed of a bicycle is 80km/h");
        System.out.println("\n----------------------CAR----------------------");
        // Create a toyota
        Car toyota = new Car(Brand.TOYOTA, Color.BLUE, 180, BigDecimal.valueOf(25000), 60, Gasoline.OCTANE_95, 4, 4, 4);

        // Call methods with different values
        toyota.on();
        toyota.setSpeed(60);
        toyota.startDriving(60, 10);
        toyota.fillCombustible(Gasoline.OCTANE_95, 50);
        toyota.clean();
        toyota.stop();
        System.out.println(toyota.toString());

        System.out.println("\n--------------------TRUCK----------------------");

        // Create truck and test all the methods in it
        Truck truck = new Truck(Color.BLACK, 100, BigDecimal.valueOf(100000), 1000, 4, 4, 4);
        truck.on();
        truck.setSpeed(60);
        //truck.startDriving(60, 10);
        //truck.fillCombustible(Gasoline.OCTANE_95, 50);
        truck.clean();
        truck.stop();
        System.out.println(truck.toString());

        System.out.println("\n---------------------BICYCLE---------------------");

        // Create a bicycle and test all the methods in it
        Bicycle bicycle = new Bicycle(Color.RED, BigDecimal.valueOf(1000), 1);
        bicycle.on();
        bicycle.setSpeed(60);
        bicycle.clean();
        bicycle.stop();
        System.out.println(bicycle.toString());

        System.out.println("\n--------------------EXTRA-----------------------");
        // Creating a ford car with: 1 motor, 2 windows, 10 wheels and 3 doors
        Car ford = new Car(Brand.FORD, Color.BLACK, 180, BigDecimal.valueOf(25000), 60, Gasoline.OCTANE_95, 2, 10, 3);
        ford.startDriving(60, 10);
        ford.startDriving(60, 10);
        ford.openWindow(1);
        System.out.println(ford.toString());

        //Creating bicycle, for default has 2 wheels
        Bicycle bicycle1 = new Bicycle(Color.RED, BigDecimal.valueOf(1000), 2);
        System.out.println(bicycle1.toString());

        //Creating a truck with a motor, 10 wheels, 3 doors and 2 windows
        Truck truckExtra = new Truck(Color.BLACK, 100, BigDecimal.valueOf(100000), 1000, 2, 10, 3);
        truckExtra.deflateWheel(5);
        truckExtra.openWindow(1);
        truckExtra.openDoor(2);
        System.out.println(truckExtra.toString());
    }
}
