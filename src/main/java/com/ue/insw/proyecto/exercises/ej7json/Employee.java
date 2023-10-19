package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {

    protected String name;
    protected String email;
    protected boolean suscribed;
    protected String birth;

    public Employee(String name, String email, boolean suscribed, String birth) {
        this.name = name;
        this.email = email;
        this.suscribed = suscribed;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public boolean isSuscribed() {
        return suscribed;
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
    public void setSuscribed(boolean suscribed) {
        this.suscribed = suscribed;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", suscribed=" + suscribed +
                ", birth='" + birth + '\'' +
                '}';
    }
}
