package com.ue.insw.proyecto.exercises.ej7json;

import com.ue.insw.proyecto.exercises.ej0documentation.Empleado;

public class Empleados {

    protected String name;
    protected String mail;
    protected int phone;
    protected boolean suscribed;
    protected String birth;

    public Empleados(String name, String mail, int phone, boolean suscribed, String birth) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.suscribed = suscribed;
        this.birth = birth;

    }

    public String getName() {
        return name;
    }

    public boolean isSuscribed() {//
        return suscribed;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setSuscribed(boolean suscribed) {//
        this.suscribed = suscribed;
    }

    public int getPhone() {//
        return phone;
    }

    public void setPhone(int phone) {//
        this.phone = phone;
    }

    public String getMail() {//
        return mail;
    }

    public void setMail(String mail) {//
        this.mail = mail;
    }

    public void setName(String name) {//
        this.name = name;
    }
}