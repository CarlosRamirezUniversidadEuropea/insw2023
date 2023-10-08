package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

/**
 * Class Window that represents a window with its characteristics and actions that it can perform such as open, close, etc.
 */
public class Window {
    /**
     * Status of the window
     */
    private boolean open;

    /**
     * Constructor of the class Window
     */
    public Window() {
        //Usually a window is closed
        this.open = false;
    }

    /**
     * Method toString of the class Window
     */
    @Override
    public String toString() {
        return "Window{" +
                "open=" + this.open +
                '}';
    }

    /**
     * Method to open the window
     */
    public void open() {
        this.open = true;
    }

    /**
     * Method to close the window
     */
    public void close() {
        this.open = false;
    }

    /**
     * Method to get the status of the window
     * @return the status of the window
     */
    public boolean isOpen() {
        return this.open;
    }
}
