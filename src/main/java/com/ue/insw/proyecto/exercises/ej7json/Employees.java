package com.ue.insw.proyecto.exercises.ej7json;

public class Employees {
    private String name;
    private String email;
    private String birth;
    private boolean subscribed;
    private int phone;

    // Constructor sin argumentos requerido para la deserialización de Gson
    public Employees() {
    }

    // Getters y setters para todas las propiedades
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // Método toString (opcional) para imprimir el objeto
    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth='" + birth + '\'' +
                ", subscribed=" + subscribed +
                ", phone=" + phone +
                '}';
    }
}
