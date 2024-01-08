package com.ue.insw.proyecto.exercises.ej7json;

public class Empleados {
    protected String name;
    protected String email;
    protected int phone;
    protected boolean subscribed;
    protected String birthday;

    public  Empleados(String name, String email, int phone, boolean subscribed, String birthday){
        this.birthday=birthday;
        this.email=email;
        this.phone=phone;
        this.name=name;
        this.subscribed=subscribed;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getphone() {
        return phone;
    }

    public void setphone(int phone) {
        this.phone = phone;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getbirthday() {
        return birthday;
    }

    public void setbirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", subscribed=" + subscribed +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}