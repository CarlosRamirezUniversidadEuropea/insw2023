package com.ue.insw.proyecto.exercises.ej7json;

public class Empleados {
    protected String nombre;
    protected String email;
    protected int telefono;
    protected boolean subscribed;
    protected String cumple;

    public  Empleados(String nombre, String email, int telefono, boolean subscribed, String cumple){
        this.cumple=cumple;
        this.email=email;
        this.telefono=telefono;
        this.nombre=nombre;
        this.subscribed=subscribed;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", subscribed=" + subscribed +
                ", cumple='" + cumple + '\'' +
                '}';
    }
}

