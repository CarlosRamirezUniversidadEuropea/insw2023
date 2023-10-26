package com.ue.insw.proyecto.exercises.ej7json;
import com.ue.insw.proyecto.exercises.ej7json.Persona;
public class Employee {
    /*
     * {
    "name":"Bob",
    "email":"bob32@gmail.com",
    "phone": 634858013,
    "subscribed" : false,
    "birth" : "2001-10-31"
  }
     */
    String name;
    String email;
    int phone;
    boolean subscribed;
    String birth;

    public Employee(String name, String email, int phone, boolean subscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone() {
        return phone;
    }
    public boolean isSubscribed() {
        return subscribed;
    }
    public String getBirth() {
        return birth;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", subscribed=" + subscribed + ", birth=" + birth + '}';
    }

    
}
