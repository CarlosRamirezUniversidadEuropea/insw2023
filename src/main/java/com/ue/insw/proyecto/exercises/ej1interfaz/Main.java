package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Coche:" );

        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        try {
            peugeot.fillCombustible(Gasoline.GASOLEO_A,80);
        } catch (Exception e) {
            System.out.println(e);;
        }
        peugeot.startDriving(40);
        peugeot.setMaxSpeed(-40);
        System.out.println(peugeot.toString());
        peugeot.clean();
        System.out.println();

        System.out.println("Camión:" );

        Truck Man = new Truck(Brand.MAN, Color.WHITE, 89, new BigDecimal(12000), 60);
        System.out.println(Man.getPrice());
        System.out.println(Man.getBrand());
        System.out.println(Man.getColor());
        System.out.println(Man.setMaxSpeed(95));

        System.out.println(Man.toString());
        Man.fillCombustible(Gasoline.GASOLEO_A,40);
        Man.startDriving(90);

        Man.clean();
        Man.stop();

        System.out.println( );


        System.out.println("Bicicleta:" );

        Bicycle bmx = new Bicycle(new BigDecimal(12000),Color.RED, 40, 33,Brand.ORBEA,100,60);
        System.out.println(bmx.getPrice());
        System.out.println(bmx.getColor());
        System.out.println(bmx.toString());
        bmx.stop();
        bmx.clean();
        bmx.fillRuedas(40);


    }
}
