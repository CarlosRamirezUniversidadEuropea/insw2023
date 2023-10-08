package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable{

    /**
     * Cargo capacity of the truck
     */
    private double cargoCapacity;
    /**
     * Motor of the truck
     */
    private Motor motor;
    /**
     * Wheels of the truck like a vector because one wheel can be inflated and the other not
     */
    private Wheel[] wheels;
    /**
     * Windows of the truck
     */
    private Window[] windows;
    /**
     * Doors of the truck
     */
    private Door[] doors;

    /**
     * Constructor for Truck
     * @param color of the truck
     * @param maxSpeed of the truck
     * @param price of the truck
     */
    public Truck(Color color, int maxSpeed, BigDecimal price, double cargoCapacity, int numberWindows, int numberWheel, int numberDoors) throws Exception {
        super(color, price, maxSpeed);
        this.setCargoCapacity(cargoCapacity);
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
     * Method toString of the class Truck
     */
    @Override
    public String toString() {
        return "Truck{" +
                "color=" + getColor() +
                ", speed=" + getSpeed() +
                ", maxSpeed=" + getMaxSpeed() +
                ", status=" + getStatus() +
                ", price=" + getPrice() +
                ", cargoCapacity=" + getCargoCapacity() +
                ", windowsOpened=" + getWindowsOpened() + "/" + this.windows.length +
                ", doorsOpened=" + getDoorsOpened() + "/" + this.doors.length +
                ", wheelsInflated=" + getWheelsInflated() + "/" + this.wheels.length +
                '}';
    }

    /**
     * Starts driving the truck
     * @param speed desired to drive
     * @param time in seconds
     * @throws Exception if the speed is negative
     */
    public void startDriving (int speed, int time) throws Exception {
        // todo Create method to start driving
        // the method setSpeed() already throws an exception if the speed is negative
        super.setSpeed(speed);
        on(); // Turn on the vehicle (class Vehicle)
        // Put the motor on (class Motor)
        this.motor.start();
    }

    /**
     * Method to open a window of the truck, it can open as many windows as the truck has
     * @param numberWindow number of the window to open
     */
    public void openWindow(int numberWindow) throws Exception {
        //throw an exception if the number of the window is not valid
        if (numberWindow <= 0 || numberWindow > this.windows.length) {
            throw new Exception("Incorrect number of window. Must be > 0");
        }
        //It will open the first "x" (numberWindow) windows of the truck
        for (int i = 0; i < numberWindow; i++) {
            this.windows[i].open();
        }
    }

    /**
     * Method to close a window of the truck, it can close as many windows as the truck has
     * @param numberWindow number of the window to close
     */
    public void closeWindow(int numberWindow) throws Exception {
        //throw an exception if the number of the window is not valid
        if (numberWindow <= 0 || numberWindow > this.windows.length) {
            throw new Exception("Incorrect number of window. Must be > 0");
        }
        //It will close the first "x" (numberWindow) windows of the truck
        for (int i = 0; i < numberWindow; i++) {
            this.windows[i].close();
        }
    }

    /**
     * Method to open a door of the truck, it can open as many doors as the truck has
     */
    public void openDoor(int numberDoor) throws Exception {
        //throw an exception if the number of the door is not valid
        if (numberDoor <= 0 || numberDoor > this.doors.length) {
            throw new Exception("Incorrect number of door. Must be > 0");
        }
        //It will open the first "x" (numberDoor) doors of the truck
        for (int i = 0; i < numberDoor; i++) {
            this.doors[i].open();
        }
    }

    /**
     * Method to close a door of the truck, it can close as many doors as the truck has
     * @param numberDoor number of the door to close
     */
    public void closeDoor(int numberDoor) throws Exception {
        //throw an exception if the number of the door is not valid
        if (numberDoor <= 0 || numberDoor > this.doors.length) {
            throw new Exception("Incorrect number of door. Must be > 0");
        }
        //It will close the first "x" (numberDoor) doors of the truck
        for (int i = 0; i < numberDoor; i++) {
            this.doors[i].close();
        }
    }

    /**
     * Method to inflate a wheel of the truck, it can inflate as many wheels as the truck has
     * @param numberWheel number of the wheel to inflate
     */
    public void inflateWheel(int numberWheel) throws Exception {
        //throw an exception if the number of the wheel is not valid
        if (numberWheel <= 0 || numberWheel > this.wheels.length) {
            throw new Exception("Incorrect number of wheel. Must be > 0");
        }
        //It will inflate the first "x" (numberWheel) wheels of the truck
        for (int i = 0; i < numberWheel; i++) {
            this.wheels[i].inflate();
        }
    }

    /**
     * Method to deflate a wheel of the truck, it can deflate as many wheels as the truck has
     * @param numberWheel number of the wheel to deflate
     */
    public void deflateWheel(int numberWheel) throws Exception {
        //throw an exception if the number of the wheel is not valid
        if (numberWheel <= 0 || numberWheel > this.wheels.length) {
            throw new Exception("Incorrect number of wheel. Must be > 0");
        }
        //It will deflate the first "x" (numberWheel) wheels of the truck
        for (int i = 0; i < numberWheel; i++) {
            this.wheels[i].deflate();
        }
    }

    /**
     * Method to get the number of windows opened of the truck
     * @return the number of windows opened of the truck
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
     * Method to get the number of doors opened of the truck
     * @return the number of doors opened of the truck
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
     * Method to get the number of wheels inflated of the truck
     * @return the number of wheels inflated of the truck
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
     * Method to get the cargo capacity of the truck
     */
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Method to set the cargo capacity of the truck. It must be greater than 0
     */
    public void setCargoCapacity(double cargoCapacity) throws Exception {
        if (cargoCapacity > 0) {
            this.cargoCapacity = cargoCapacity;
        } else {
            throw new Exception("The cargo capacity must be greater than 0");
        }

    }

    /**
     * Method to clean the truck
     */
    @Override
    public void clean() {
        System.out.println("Cleaning truck");
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
