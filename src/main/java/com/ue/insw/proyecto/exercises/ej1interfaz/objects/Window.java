package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

public class Window {

    private boolean isWindowOpen;

    public Window() {
        this.isWindowOpen= false;
    }

    public void openWindow() {
        System.out.println("Abriendo ventana");
        this.isWindowOpen= true;
    }

    public void closeWindow() {
        System.out.println("Cerrando ventana");
        this.isWindowOpen= false;
    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    @Override
    public String toString() {
        return "Window{" +
                "open=" + isWindowOpen +
                '}';
    }
}
