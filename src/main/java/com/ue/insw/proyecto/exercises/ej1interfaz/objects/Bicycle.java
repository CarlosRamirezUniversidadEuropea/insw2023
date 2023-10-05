package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable{

    /**
     * Constructor for Bicycle
     * @param color of the bicycle
     * @param price of the bicycle
     */
    public Bicycle(Color color, BigDecimal price) throws Exception {
        super(color, price, 0);
    }

    /**
     * Method toString of the class Bicycle
     * @return the information of the bicycle
     */
    @Override
    public String toString() {
        return "Bicycle{" +
                "color=" + getColor() +
                ", speed=" + getSpeed() +
                ", status=" + getStatus() +
                ", price=" + getPrice() +
                '}';
    }

    /**
     * Constructor for Bicycle
     * @param price of the bicycle
     */
    public Bicycle(BigDecimal price) {
        super(price);
    }

    /**
     * Method to pedal the bicycle
     * @param speed desired to pedal
     */
    public void pedal (int speed){
        try {
            setSpeed(speed);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method to stop pedaling the bicycle
     */
    public void stopPedaling() {
        stop();
    }

    /**
     * Cleans the bicycle
     */
    @Override
    public void clean() {
        System.out.println("Cleaning the bicycle");
    }
}
