package com.ue.insw.proyecto.exercises.ej7json;

public class Empleados {
    protected String name;
    protected String email;
    protected int phone;
    protected boolean subscribed;
    protected String birth;

    public Empleados(String name, String email,int phone, boolean subscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
    }

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

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Boolean getsubscribed() {
        return subscribed;
    }
    public void setsubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
}
