package com.ue.insw.proyecto.exercises.ej7json;

public class Property {
    private String id;
    private String name;
    public Property(String id, String n){
        this.name = n;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
