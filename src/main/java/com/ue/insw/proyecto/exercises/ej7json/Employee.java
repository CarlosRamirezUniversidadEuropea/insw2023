package com.ue.insw.proyecto.exercises.ej7json;

public class Employee {
    
    protected String name;
    protected String email;
    protected int phone;
    protected boolean subscribed;
    protected String birth;
    protected int followers;

    public Employee(String name, String email, int phone, boolean subscribed, String birth, int followers) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
        this.followers = followers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() > 0) {
            this.email = email;
        } else {
            System.out.println("Error: El correo electrónico no puede estar vacío");
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if (phone >= 0) {
            this.phone = phone;
        } else {
            System.out.println("Error: El número de teléfono no puede ser negativo");
        }
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
        if (subscribed) {
            System.out.println("El empleado " + this.name + " está suscrito");
        } else {
            System.out.println("El empleado " + this.name + " no está suscrito");
        }
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        if (birth.length() > 0) {
            this.birth = birth;
        } else {
            System.out.println("Error: La fecha de nacimiento no puede estar vacía");
        }
    }
    public String getFirst_name() {
        return name.split(" ")[0];
    }
    
    public String getLast_name() {
        return name.split(" ")[1];
    }
    
    public String getLocation() {
        return "Unknown";
    }
    
    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) throws Exception {
        if (followers >= 0) {
            this.followers = followers;
        } else {
            throw new Exception("Error: El número de seguidores no puede ser negativo");
        }
    }
}