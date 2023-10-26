package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    String name;
    String email;
    int phone;
    boolean subscribed;
    String birth;

    public Employee(String name, String email, int phone, boolean subscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
    }

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

    @Override
    public String toString() {
        return "Employee{ name " + name + "\n, email " + email + "\n, subscribed " + subscribed + "\n, phone=" + phone + "\n, birth " + birth + '}';

    }
}
