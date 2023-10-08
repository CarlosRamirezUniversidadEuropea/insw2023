package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

/**
 * Class Door that represents a door with its characteristics and actions that it can perform such as open, close, etc.
 */
public class Door {

    /**
     * Window of the door
     */
    private Window window;
    /**
     * Status of the door
     */
    private boolean open;

    /**
     * Constructor of the class Door
     */
    public Door() {
        this.window = new Window();
        // I will assume that a door is closed
        this.open = false;
    }

    /**
     * Method to String of the class Door
     */
    @Override
    public String toString() {
        return "Door{" +
                "window=" + this.window +
                ", open=" + this.open +
                '}';
    }

    /**
     * Method to open the door
     */
    public void open() {
        open = true;
    }

    /**
     * Method to close the door
     */
    public void close() {
        open = false;
    }

    /**
     * Method to get the status of the door
     * @return the status of the door
     */
    public boolean isOpen() {
        return open;
    }
}
