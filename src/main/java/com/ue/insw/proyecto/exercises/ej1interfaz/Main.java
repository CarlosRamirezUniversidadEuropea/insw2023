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
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK,  new BigDecimal(12000),Gasoline.GASOLEO_A,40,80);
        Bicycle bicicleta= new Bicycle(Brand.ENZO,Color.RED, new BigDecimal(200),40,30);
        Truck camion= new Truck(Brand.MERCEDES,Color.BLUE, new BigDecimal(130000),Gasoline.OCTANE_98,100,90);
        //Coche
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        peugeot.setMaxSpeed(150);
        System.out.println(peugeot.toString());
        peugeot.startDriving(40,10);
        peugeot.fillCombustible(Gasoline.GASOLEO_A,20);
        System.out.println(peugeot.toString());
        peugeot.clean();
        //Bicicleta
        System.out.println(bicicleta.getPrice());
        System.out.println(bicicleta.getBrand());
        System.out.println(bicicleta.getColor());
        bicicleta.setMaxSpeedBicycle(60);
        System.out.println(bicicleta.toString());
        bicicleta.clean();
        bicicleta.startPedaleando(20,7);
        bicicleta.InflarRuedas(30);
        System.out.println(bicicleta.toString());
        //Camion
        System.out.println(camion.getPrice());
        System.out.println(camion.getBrand());
        System.out.println(camion.getColor());
        camion.setMaxSpeedCamion(150);
        System.out.println(camion.toString());
        camion.ArrancarCamion(10,2);
        camion.LLenarCamion(Gasoline.OCTANE_98,100);
        camion.clean();
        System.out.println(bicicleta.toString());
    }
}
