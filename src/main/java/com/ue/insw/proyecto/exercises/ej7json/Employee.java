package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    // Atributos de la clase Employee
    String name;
    String email;
    int phone;
    boolean subscribed;
    String birth;

    // Constructor de la clase Employee
    public Employee(String name, String email, int phone, boolean subscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
    }

    // Getters y Setters para los atributos
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public String getBirth() {
        return birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    // Método toString para representar la información del objeto como una cadena
    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", email=" + email +
                ", phone=" + phone +
                ", subscribed=" + subscribed +
                ", birth=" + birth +
                '}';
    }
}
