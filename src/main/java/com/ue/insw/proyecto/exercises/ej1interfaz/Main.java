package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline.OCTANE_98;

public class Main {

    public static void main(String[] args) {
        // Creamos un coche y probamos que tódos los métodos funcionan.
        try {
            Car gt3rs = new Car(Brand.PORSCHE, Color.BLACK, 296, new BigDecimal(287000), OCTANE_98, 92);

            System.out.println("Precio: "+gt3rs.getPrice());
            System.out.println("Marca: " + gt3rs.getBrand());
            System.out.println("Color: " + gt3rs.getColor());
            System.out.println("Velocidad máxima: " + gt3rs.getMaxSpeed());
            System.out.println("Velocidad actual: " + gt3rs.getSpeed());
            System.out.println("Estado actual:" + gt3rs.getStatus());
            System.out.println(gt3rs);
            gt3rs.clean();
            try {
                gt3rs.fillCombustible(OCTANE_98, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            gt3rs.startDriving(200, 100);
            gt3rs.setSpeed(100);
            System.out.println("Velocidad actual: " + gt3rs.getSpeed());
            gt3rs.stop();
            System.out.println("Velocidad actual: " + gt3rs.getSpeed());
            System.out.println("Estado actual:" + gt3rs.getStatus());
            gt3rs.setColor(Color.RED);
            System.out.println("Nuevo Color: " + gt3rs.getColor());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}