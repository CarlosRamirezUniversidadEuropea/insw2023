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

        // COCHE
        Car amg = new Car(new BigDecimal(20000), Brand.MERCEDES, Color.RED, 250, Gasoline.OCTANE_95, 50);
        System.out.println(amg);

        amg.startDriving(120, 100);
        System.out.println(amg);

        amg.fillCombustible(Gasoline.OCTANE_95, 50);
        amg.clean();
        amg.on();
        System.out.println(amg.getStatus());

        // BICI
        Bicycle bici = new Bicycle(new BigDecimal(250), Brand.TOYOTA, Color.BLACK, 50);
        System.out.println("\n" + bici);

        bici.startDriving(10, 60);
        System.out.println(bici);
        bici.clean();

        // CAMION
        Truck camion = new Truck(new BigDecimal(70000), Brand.TESLA, Color.WHITE, 150, Gasoline.OCTANE_98, 250);
        System.out.println("\n" + camion);

        camion.startDriving(120, 100);
        System.out.println(camion);

        camion.fillCombustible(Gasoline.OCTANE_98, 50);
        camion.clean();
        camion.on();
        System.out.println(camion.getStatus());
    }
}