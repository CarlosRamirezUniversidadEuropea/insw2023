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
        Car corsa = new Car(Brand.OPEL, Color.RED, 200, new BigDecimal(20000), Gasoline.OCTANE_95, 50);
        System.out.println(corsa);

        corsa.startDriving(120, 100);
        System.out.println(corsa);

        corsa.fillCombustible(Gasoline.OCTANE_95, 50);
        corsa.clean();
        corsa.on();
        System.out.println(corsa.getStatus());

        // BICI
        Bicycle bici = new Bicycle(new BigDecimal(250), Brand.CONOR, Color.BLACK, 50);
        System.out.println("\n" + bici);

        bici.startDriving(10, 60);
        System.out.println(bici);
        bici.clean();

        // CAMION
        Truck camion = new Truck(Brand.MERCEDES, Color.WHITE, 150, new BigDecimal(70000), Gasoline.OCTANE_98, 250);
        System.out.println("\n" + camion);

        camion.startDriving(120, 100);
        System.out.println(camion);

        camion.fillCombustible(Gasoline.OCTANE_98, 50);
        camion.clean();
        camion.on();
        System.out.println(camion.getStatus());
    }
}
