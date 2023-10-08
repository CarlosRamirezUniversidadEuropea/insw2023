package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable{

    /**
     * Gear of the bicycle
     */
    private int gear;
    /**
     * Wheel of the bicycle, assuming that a bicycle has 2 wheels
     */
    private Wheel[] wheels = new Wheel[2];

    /**
     * Constructor for Bicycle
     * @param color of the bicycle
     * @param price of the bicycle
     * @param gear of the bicycle
     */
    public Bicycle(Color color, BigDecimal price, int gear) throws Exception {
        super(color, price, 80);
        //initializing the wheels
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
        this.setGear(gear);
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
                ", gear=" + getGear() +
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
     * Method to get the gear of the bicycle
     * @return the gear of the bicycle
     */
    public int getGear() {
        return gear;
    }

    /**
     * Method to set the gear of the bicycle. It must be 1, 2 or 3
     * @param gear of the bicycle
     */
    public void setGear(int gear) throws Exception {
        if (gear == 1 || gear == 2 || gear == 3) {
            this.gear = gear;
        } else {
            throw new Exception("The gear must be 1, 2 or 3");
        }
    }

    /**
     * Cleans the bicycle
     */
    @Override
    public void clean() {
        System.out.println("Cleaning the bicycle");
    }
}
