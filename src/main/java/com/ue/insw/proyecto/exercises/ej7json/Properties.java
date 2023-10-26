package com.ue.insw.proyecto.exercises.ej7json;

public class Properties {
    public String id;
    public String name;

    public Properties(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
