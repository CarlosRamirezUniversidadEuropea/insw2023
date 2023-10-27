package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    private String name;
    private String email;
    private int phone;
    private boolean subscribed;
    private String birth;

    public Employee(String name, String email, int phone, boolean subscribed, String birth){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;

    }
    public String getName() {
        return name;
    }
    public void setName(String location) {
        this.name = name;
    }
    public String getMail() {
        return email;
    }
    public void setMail(String mail) {
        this.email = mail;
    }

    public int getPhone() {return phone; }
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", subscribed=" + subscribed +
                ", birth='" + birth + '\'' +
                '}';
    }
}
