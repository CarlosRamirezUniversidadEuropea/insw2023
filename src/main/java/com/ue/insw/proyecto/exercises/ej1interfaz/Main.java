package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car gt3rs = null;
        try {
            gt3rs = new Car(Brand.PORSCHE, Color.BLACK, 296, new BigDecimal(287000), Gasoline.OCTANE_98, 92);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (gt3rs != null) {
            System.out.println(gt3rs.getPrice());
            System.out.println(gt3rs.getBrand());
            System.out.println(gt3rs.getColor());
            System.out.println(gt3rs.toString());
            gt3rs.clean();
        }
    }
}
