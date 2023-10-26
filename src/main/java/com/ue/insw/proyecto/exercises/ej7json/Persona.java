package com.ue.insw.proyecto.exercises.ej7json;

public class Persona {

    // Atributos
    protected String first_name;
    protected String last_name;
    protected String location;
    protected boolean online;
    protected int followers;

    /**
     * Constructor de la clase
     * @param first_name Nombre
     * @param last_name Apellido(s)
     * @param location Ubicación
     * @param online ¿Está conectado?
     * @param followers Número de seguidores
     */
    public Persona(String first_name, String last_name, String location, boolean online, int followers) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.location = location;
        this.online = online;
        this.followers = followers;
    }

    // Getters y setters
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String isOnline() {
        if (online) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
