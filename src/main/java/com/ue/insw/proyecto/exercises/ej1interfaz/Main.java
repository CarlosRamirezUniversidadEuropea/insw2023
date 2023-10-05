package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

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

        // Print toyota details
        System.out.println(toyota.toString());

    }
}
