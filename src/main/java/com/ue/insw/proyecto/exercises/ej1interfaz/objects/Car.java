package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;


//todo extender de Vehicle
//todo implementar Cleanable

/**
 * Class that represents a car with its characteristics and actions that it can perform such as driving, stopping, etc.
 * @see Vehicle
 * @see Cleanable
 */
public class Car extends Vehicle implements Cleanable {

    /**
     * Brand of the car
     */
    private Brand brand;
    /**
     * Gasoline type of the car
     */
    private Gasoline gasoline;
    /**
     * Tank capacity of the car
     */
    private int tankCapacity;
    /**
     * Motor of the car
     */
    private Motor motor;
    /**
     * Wheels of the car like a vector because one wheel can be inflated and the other not
     */
    private Wheel[] wheels;
    /**
     * Windows of the car
     */
    private Window[] windows;
    /**
     * Doors of the car
     */
    private Door[] doors;

    /**
     * Constructor of the class Car
     * @param brand of the car
     * @param gasoline type of the car
     * @param color of the car
     * @param maxSpeed of the car
     * @param price of the car
     * @param tankCapacity of the car
     * @param numberWindows of the car
     * @param numberWheel of the car
     * @param numberDoors of the car
     * @throws Exception if the gasoline is not a valid type of gasoline
     */
    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, int tankCapacity, Gasoline gasoline, int numberWindows, int numberWheel, int numberDoors) throws Exception {
        super(color, price, maxSpeed);
        this.setTankCapacity(tankCapacity);
        this.setBrand(brand);
        this.setGasoline(gasoline);
        this.motor = new Motor();
        // Checking that the number of windows, wheels and doors is greater than 0
        if(this.intChecking(numberWindows)) {
            this.windows = new Window[numberWindows];
            // initialize the windows
            for (int i = 0; i < numberWindows; i++) {
                this.windows[i] = new Window();
            }
        }
        if (this.intChecking(numberWheel)) {
            this.wheels = new Wheel[numberWheel];
            // initialize the wheels
            for (int i = 0; i < numberWheel; i++) {
                this.wheels[i] = new Wheel();
            }
        }
        if (this.intChecking(numberDoors)) {
            this.doors = new Door[numberDoors];
            // initialize the doors
            for (int i = 0; i < numberDoors; i++) {
                this.doors[i] = new Door();
            }
        }
    }

    /**
     * Method toString of the class Car
     * @return the information of the car
     */
    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", gasoline=" + gasoline +
                ", color=" + getColor() +
                ", maxSpeed=" + getMaxSpeed() +
                ", speed=" + getSpeed() +
                ", status=" + getStatus() +
                ", tankCapacity=" + getTankCapacity() +
                ", price=" + getPrice() +
                ", windowsOpened=" + getWindowsOpened() + "/" + this.windows.length +
                ", doorsOpened=" + getDoorsOpened() + "/" + this.doors.length +
                ", wheelsInflated=" + getWheelsInflated() + "/" + this.wheels.length +
                '}';
    }

    /**
     * Method to fill the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        //todo Create method to fill car
        if (liters <= 0) {
            throw new Exception("Liters can't be negative");
        }
        if (liters > this.tankCapacity) {
            throw new Exception("Liters exceed tank capacity");
        }
        if (gasoline != this.gasoline) {
            throw new Exception("Incorrect type of fuel");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     * @throws Exception if the speed is negative
     */
    public void startDriving (int speed, int time) throws Exception {
        // todo Create method to start driving
        // the method setSpeed() already throws an exception if the speed is negative
        super.setSpeed(speed);
        on(); // Turn on the car (class Vehicle)
        // Put the motor on (class Motor)
        this.motor.start();
    }

    /**
     * Cleans the car
     */
    @Override
    public void clean() {
        System.out.println("Car cleaning");
    }

    /**
     * Gets the brand of the car
     * @return brand of the car
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the car
     * @param brand of the car
     */
    public void setBrand(Brand brand) throws Exception {
        //throw an exception if the brand is not a valid brand: RENAULT, PEUGEOT, FORD, TOYOTA, MERCEDES, TESLA
        try {
            if (brand != Brand.RENAULT && brand != Brand.PEUGEOT && brand != Brand.FORD && brand != Brand.TOYOTA && brand != Brand.MERCEDES && brand != Brand.TESLA) {
                throw new Exception("Incorrect brand");
            } else {
                this.brand = brand;
            }
        } catch (Exception e) {
            throw new Exception("Incorrect brand");
        }
    }


    /**
     * Gets the tank capacity of the car
     * @return tank capacity of the car
     */
    public int getTankCapacity() {
        return tankCapacity;
    }

    /**
     * Sets the tank capacity of the car. If the tank capacity is negative, it throws an exception
     * @param tankCapacity of the car
     * @throws Exception if the tank capacity is negative
     */
    public void setTankCapacity(int tankCapacity) throws Exception {
        if (tankCapacity <= 0) {
            throw new Exception("Tank capacity can't be negative");
        } else {
            this.tankCapacity = tankCapacity;
        }
    }

    /**
     * Gets the gasoline type of the car
     * @return gasoline type of the car
     */
    public Gasoline getGasoline() {
        return gasoline;
    }

    /**
     * Sets the gasoline type of the car. If the gasoline type is not a valid type of gasoline, it throws an exception
     * @param gasoline type of the car
     */
    public void setGasoline(Gasoline gasoline) throws Exception {
        try {
            if (gasoline != Gasoline.OCTANE_95 && gasoline != Gasoline.OCTANE_98 && gasoline != Gasoline.GASOLEO_A) {
                throw new Exception("Incorrect type of fuel");
            } else {
                this.gasoline = gasoline;
            }
        } catch (Exception e) {
            throw new Exception("Incorrect type of fuel");
        }

    }

    /**
     * Method to open a window of the car, it can open as many windows as the car has
     * @param numberWindow number of the window to open
     */
    public void openWindow(int numberWindow) throws Exception {
        //throw an exception if the number of the window is not valid
        if (numberWindow <= 0 || numberWindow > this.windows.length) {
            throw new Exception("Incorrect number of window. Must be > 0");
        }
        //It will open the first "x" (numberWindow) windows of the car
        for (int i = 0; i < numberWindow; i++) {
            this.windows[i].open();
        }
    }

    /**
     * Method to close a window of the car, it can close as many windows as the car has
     * @param numberWindow number of the window to close
     */
    public void closeWindow(int numberWindow) throws Exception {
        //throw an exception if the number of the window is not valid
        if (numberWindow <= 0 || numberWindow > this.windows.length) {
            throw new Exception("Incorrect number of window. Must be > 0");
        }
        //It will close the first "x" (numberWindow) windows of the car
        for (int i = 0; i < numberWindow; i++) {
            this.windows[i].close();
        }
    }

    /**
     * Method to open a door of the car, it can open as many doors as the car has
     */
    public void openDoor(int numberDoor) throws Exception {
        //throw an exception if the number of the door is not valid
        if (numberDoor <= 0 || numberDoor > this.doors.length) {
            throw new Exception("Incorrect number of door. Must be > 0");
        }
        //It will open the first "x" (numberDoor) doors of the car
        for (int i = 0; i < numberDoor; i++) {
            this.doors[i].open();
        }
    }

    /**
     * Method to close a door of the car, it can close as many doors as the car has
     * @param numberDoor number of the door to close
     */
    public void closeDoor(int numberDoor) throws Exception {
        //throw an exception if the number of the door is not valid
        if (numberDoor <= 0 || numberDoor > this.doors.length) {
            throw new Exception("Incorrect number of door. Must be > 0");
        }
        //It will close the first "x" (numberDoor) doors of the car
        for (int i = 0; i < numberDoor; i++) {
            this.doors[i].close();
        }
    }

    /**
     * Method to inflate a wheel of the car, it can inflate as many wheels as the car has
     * @param numberWheel number of the wheel to inflate
     */
    public void inflateWheel(int numberWheel) throws Exception {
        //throw an exception if the number of the wheel is not valid
        if (numberWheel <= 0 || numberWheel > this.wheels.length) {
            throw new Exception("Incorrect number of wheel. Must be > 0");
        }
        //It will inflate the first "x" (numberWheel) wheels of the car
        for (int i = 0; i < numberWheel; i++) {
            this.wheels[i].inflate();
        }
    }

    /**
     * Method to deflate a wheel of the car, it can deflate as many wheels as the car has
     * @param numberWheel number of the wheel to deflate
     */
    public void deflateWheel(int numberWheel) throws Exception {
        //throw an exception if the number of the wheel is not valid
        if (numberWheel <= 0 || numberWheel > this.wheels.length) {
            throw new Exception("Incorrect number of wheel. Must be > 0");
        }
        //It will deflate the first "x" (numberWheel) wheels of the car
        for (int i = 0; i < numberWheel; i++) {
            this.wheels[i].deflate();
        }
    }

    /**
     * Method to get the number of windows opened of the car
     * @return the number of windows opened of the car
     */
    public int getWindowsOpened() {
        int WindowsOpened = 0;
        for (Window window : this.windows) {
            if (window.isOpen()) {
                WindowsOpened++;
            }
        }
        return WindowsOpened;
    }

    /**
     * Method to get the number of doors opened of the car
     * @return the number of doors opened of the car
     */
    public int getDoorsOpened() {
        int DoorsOpened = 0;
        for (Door door : this.doors) {
            if (door.isOpen()) {
                DoorsOpened++;
            }
        }
        return DoorsOpened;
    }

    /**
     * Method to get the number of wheels inflated of the car
     * @return the number of wheels inflated of the car
     */
    public int getWheelsInflated() {
        int WheelsInflated = 0;
        for (Wheel wheel : this.wheels) {
            if (wheel.isInflated()) {
                WheelsInflated++;
            }
        }
        return WheelsInflated;
    }

    /**
     * Method to check if a value is > 0, throws an exception if it is not
     * @param value to check
     */
    private boolean intChecking(int value) throws Exception {
        boolean result = true;
        if (value <= 0) {
            result = false;
            throw new Exception("Value can't be negative");
        }
        return result;
    }


}
