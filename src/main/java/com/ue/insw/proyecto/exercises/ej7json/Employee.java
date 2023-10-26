package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    private String name;
    private String email;
    private int phone;
    private boolean suscribed;
    private String birth;

    public Employee(String name, String email, int phone, boolean suscribed, String birth){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.suscribed = suscribed;
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

    public boolean isSuscribed() {
        return suscribed;
    }

    public String getBirth() {
        return birth;
    }
}
