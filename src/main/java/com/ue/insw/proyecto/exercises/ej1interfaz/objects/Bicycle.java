package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;

    /**
     * Constructor de Bicycle
     *
     * @param price    // Precio de la bici
     * @param brand    // Marca de la bici
     * @param color    // Color de la bici
     * @param maxSpeed // Maxima velocidad de la bici
     */
    public Bicycle(BigDecimal price, Brand brand, Color color, int maxSpeed) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    public Bicycle(BigDecimal price) {
        super(price);
    }

    /**
     * Starts driving the bicycle
     *
     * @param speed desired to drive (Km/h)
     * @param time  in seconds
     */
    public void startDriving(int speed, int time) throws Exception {
        if (speed >= 0 && time > 0) {
            this.speed = speed;
            System.out.println("Se ha empezado a conducir a " + speed + " Km/h ");
        } else {
            throw new Exception("La velocidad o el tiempo no pueden ser negativos");
        }
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed < 0) {
            throw new Exception("La velocidad no puede ser negativa");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) throws Exception {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void clean() {
        System.out.println("Bici limpiándose");
    }
}
