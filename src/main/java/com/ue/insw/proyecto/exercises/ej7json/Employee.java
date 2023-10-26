package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    protected String name;
    protected String email;
    protected int phone;
    protected boolean suscribed;
    protected String birth;

    public Employee(String n, String c, int t, boolean s, String b){
        this.name = n;
        this.email = c;
        this.phone = t;
        this.suscribed = s;
        this.birth = b;
    }

    public String getNombre(){
        return name;
    }
    public void setNombre(String n) {
        this.name = n;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String c) {
        this.email = c;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int t) {
        this.phone = t;
    }
    public boolean isSuscribed(){
        return suscribed;
    }
    public void setNombre(boolean s) {
        this.suscribed = s;
    }
    public String getBirth(){
        return birth;
    }
    public void setBirth(String b) {
        this.birth = b;
    }
    @Override
    public String toString(){
        return "Name: " + name + "Email: " + email + "Phone: " + phone + "Suscribed: " + suscribed + "Birth: " + birth;
    }
}
