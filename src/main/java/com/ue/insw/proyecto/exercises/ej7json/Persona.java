package com.ue.insw.proyecto.exercises.ej7json;

public class Persona {

    protected String first_name;
    protected String last_name;
    protected String location;
    protected boolean online;
    protected int followers;
    protected String name;
    protected String email;
    protected int phone;
    protected boolean subscribed;
    protected String birth;


    public Persona(String first_name, String last_name, String location, boolean online, int followers) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.location = location;
        this.online = online;
        this.followers = followers;
    }
    public Persona(String name, String email, int phone, boolean subscribed, String birth){
        this.name = name;
        this.email = email;
        this.birth = birth;
        this.subscribed = subscribed;
        this.phone = phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
