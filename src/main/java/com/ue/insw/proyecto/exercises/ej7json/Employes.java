package com.ue.insw.proyecto.exercises.ej7json;

public class Employes {
    private String name;
    private String email;
    private int phone;
    private boolean subscribed;
    private String birth;

    public Employes(String name,String email,int phone,boolean subscribed, String birth){
        this.name =name;
        this.email=email;
        this.phone=phone;
        this.subscribed=subscribed;
        this.birth=birth;
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

    public boolean isSubscribed() {
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
