package com.ue.insw.proyecto.exercises.ej7json;

public class Employees {
    protected String name;
    protected String email;
    protected int phone;
    protected boolean subscribed;
    protected String birth;
    public void Persona(String n, String e, int p, boolean s, String b){
        this.name = n;
        this.email = e;
        this.phone = p;
        this.subscribed = s;
        this.birth = b;
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
    public boolean getSubscribed() {
        return subscribed;
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
