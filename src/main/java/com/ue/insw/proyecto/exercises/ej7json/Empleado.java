package com.ue.insw.proyecto.exercises.ej7json;

/**
 * Clase que representa a un empleado
 * @author Pablo Ribas Borrego
*/
public class Empleado {

    // Atributos
    protected String name;
    protected String email;
    protected long phone;
    protected boolean subscribed;
    protected String birth;

    /**
     * Constructor de la clase Empleado
     * @param name Nombre del empleado
     * @param email Correo del empleado
     * @param phone Teléfono del empleado
     * @param subscribed ¿Está suscrito el empleado?
     * @param birth Fecha de nacimiento del empleado
     */
    public Empleado(String name, String email, long phone, boolean subscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String isSubscribed() {
        if (subscribed) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
