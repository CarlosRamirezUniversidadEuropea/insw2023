package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BikeBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.CarBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.TruckBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1: Interfaz");
        System.out.println("Realizado por Pablo Ribas Borrego (AWDn0n)\n");

        // COCHE
        Car coche = new Car(new BigDecimal(80000), 200, Color.BLACK, CarBrand.AUDI, Gasoline.OCTANE_95, 30);
        coche.fillCombustible(Gasoline.OCTANE_95, 25);
        System.out.println("\n");
        coche.Drive(180, 25);
        System.out.println("\n" + coche.toString() + "\n");
        coche.stop();
        System.out.println("\n");
        coche.clean();

        System.out.println("\n\n");

        // BICICLETA
        Bicycle bici = new Bicycle(new BigDecimal(1000), Color.RED, 30, BikeBrand.SPECIALIZED);
        bici.Drive(25, 10);
        System.out.println("\n" + bici.toString() + "\n");
        bici.stop();
        System.out.println("\n");
        bici.clean();

        System.out.println("\n\n");

        // CAMIÓN
        Truck camion = new Truck(new BigDecimal(100000), 100, Color.WHITE, 0, TruckBrand.DAF, Gasoline.GASOLEO_A, 100);
        camion.fillCombustible(Gasoline.GASOLEO_A, 100);
        System.out.println("\n");
        camion.Drive(80, 35);
        System.out.println("\n" + camion.toString() + "\n");
        camion.stop();
        System.out.println("\n");
        camion.clean();
    }
}
