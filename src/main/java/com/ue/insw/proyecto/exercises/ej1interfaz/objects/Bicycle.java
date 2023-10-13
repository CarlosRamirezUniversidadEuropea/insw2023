package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BikeBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

/**
 * Representa una bicicleta
 * @author Pablo Ribas Borrego
 */
public class Bicycle extends Vehicle implements Cleanable {

    private BikeBrand brand;

    public Bicycle(BigDecimal price, Color color, int maxSpeed, BikeBrand brand) {
        super(price, maxSpeed, color, 0);
        setBrand(brand);
    }

    public BikeBrand getBrand() {
        return brand;
    }

    public void setBrand(BikeBrand brand) {
        if (brand != BikeBrand.SPECIALIZED && brand != BikeBrand.TREK && brand != BikeBrand.SCOTT && brand != BikeBrand.CUBE && brand != BikeBrand.CANNONDALE && brand != BikeBrand.BMC && brand != BikeBrand.ORBEA && brand != BikeBrand.SANTA_CRUZ && brand != BikeBrand.CERVELO) {
            throw new IllegalArgumentException("La marca no es válida.");
        } else {
            this.brand = brand;
        }
    }

    // Para el coche
    public void stop() {
        setSpeed(0);
        System.out.println("La bicicleta se ha parado.");
    }

    @Override
    public void clean() {
        System.out.println("FWSHHH! La bicicleta se ha limpiado.");
    }

    @Override
    public String toString() {
        return "Bicicleta de la marca " + brand + " de color " + getColor() + " con un precio de " + getPrice() + " euros y una velocidad máxima de " + getMaxSpeed() + "km/h."
                + "\nVelocidad actual: " + getSpeed() + "km/h.";
    }
}
