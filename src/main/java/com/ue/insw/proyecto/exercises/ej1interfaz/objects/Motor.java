package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

/**
 * Class Motor that represents a motor with its characteristics and actions that it can perform such as start, stop, etc.
 */
public class Motor {

    /**
     * Status of the motor
     */
    private boolean running;

    /**
     * Constructor of the class Motor
     */
    public Motor() {
        this.running = false;
    }

    /**
     * Method toString of the class Motor
     */
    @Override
    public String toString() {
        return "Motor{" +
                "running=" + running +
                '}';
    }

    /**
     * Method to run the motor
     *
     */
    public void start() {
        this.running = true;
    }

    /**
     * Method to stop the motor
     */
    public void stop() {
        this.running = false;
    }

    /**
     * Method to get the status of the motor
     * @return the status of the motor
     */
    public boolean isRunning() {
        return running;
    }
}
