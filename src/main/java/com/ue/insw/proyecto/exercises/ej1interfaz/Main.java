package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline.GASOLEO_A;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline.OCTANE_95;

public class Main {

    public static void main(String[] args) throws Exception{

        //coche
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), OCTANE_95, 100);
        System.out.println(peugeot);

        peugeot.startDriving(100, 200);
        System.out.println(peugeot);

        peugeot.fillCombustible(OCTANE_95, 30);
        peugeot.clean();
        peugeot.on();
        System.out.println(peugeot.getStatus());

        //bici
        Bicycle bicycle = new Bicycle(Brand.ALAN, Color.RED, 90, new BigDecimal(100));
        System.out.println(bicycle);

        bicycle.startDriving(70);
        System.out.println(bicycle);
        bicycle.clean();

        //camion
        Truck camion = new Truck(Brand.RENAULT, Color.WHITE, 200, new BigDecimal(150000), Gasoline.GASOLEO_A, 300);
        System.out.println(camion);

        camion.startDriving(200, 500);
        System.out.println(camion);

        camion.fillCombustible(GASOLEO_A, 30);
        camion.clean();
        camion.on();
        System.out.println(camion.getStatus());
    }
}
