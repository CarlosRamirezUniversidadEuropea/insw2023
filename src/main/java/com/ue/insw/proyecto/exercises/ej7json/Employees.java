package com.ue.insw.proyecto.exercises.ej7json;

public class Employees {

    protected String name;
    protected String email;
    protected int phone;
    protected boolean suscribed;
    protected String birth;

    public Employees(String name, String email, int phone, boolean suscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.suscribed = suscribed;
        this.birth = birth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public boolean getSuscribed() {
        return suscribed;
    }

    public void setSuscribed(boolean suscribed){
        this.suscribed = suscribed;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String address){
        this.birth = address;
    }




}





