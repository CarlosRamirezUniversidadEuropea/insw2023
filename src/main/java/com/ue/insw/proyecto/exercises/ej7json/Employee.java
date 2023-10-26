package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    String name;
    String email;
    boolean subscribed;
    int phone;
    String birth;

    public Employee (String name, String email, boolean subscribed, int phone, String birth) {
        this.name = name;
        this.email = email;
        this.subscribed = subscribed;
        this.phone = phone;
        this.birth = birth;
    }

    public Employee(){}
    public String getName(){
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email = email;
    }
    public boolean isSubscribed() {
        return subscribed;
    }
    public void setSubscribed() {
        this.subscribed = subscribed;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone() {
        this.phone = phone;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth() {
        this.birth = birth;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "name=" + name +
                ", email=" + email +
                ", subscribed=" + subscribed +
                ", phone=" + phone +
                ", birth=" + birth +
                '}';
    }

}
