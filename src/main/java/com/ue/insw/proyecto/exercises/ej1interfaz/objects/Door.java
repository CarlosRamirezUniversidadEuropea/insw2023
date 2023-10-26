package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

public class Door extends Window{

    private boolean isDoorOpen;
    private boolean isWindowOpen;
    
    public Door() {
        super();
    }

    @Override
    public void openWindow() {
        System.out.println("Abriendo ventana");
        this.isWindowOpen = true;
    }

    @Override
    public void closeWindow() {
        System.out.println("Cerrando ventana");
        this.isWindowOpen = false;
    }

    public void openDoor() {
        System.out.println("Abriendo puerta");
        this.isDoorOpen = true;
    }

    public void closeDoor() {
        System.out.println("Cerrando puerta");
        this.isDoorOpen = false;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    @Override
    public String toString() {
        return "Door{" +
                "door_open=" + isDoorOpen +
                ", window_open=" + isWindowOpen() +
                ", door_open=" + isDoorOpen() +
                '}';
    }
}
