package com.ue.insw.proyecto.exercises.ej7json;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected String location;
    protected boolean online;
    protected int seguidores;

    public Persona(String first_name, String last_name, String location, boolean online, int followers) {
        this.nombre = first_name;
        this.apellido = last_name;
        this.location = location;
        this.online = online;
        this.seguidores = followers;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", location='" + location + '\'' +
                ", online=" + online +
                ", seguidores=" + seguidores +
                '}';
    }
}