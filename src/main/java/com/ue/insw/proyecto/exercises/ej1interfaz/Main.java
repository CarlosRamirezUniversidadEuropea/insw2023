package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Car renault = new Car(Brand.RENAULT, Color.BLACK, 150, new BigDecimal(120000), Gasoline.OCTANE_95,200);
            renault.fillCombustible(Gasoline.OCTANE_95, 40);
            renault.startDriving(70);
            System.out.println(renault.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
