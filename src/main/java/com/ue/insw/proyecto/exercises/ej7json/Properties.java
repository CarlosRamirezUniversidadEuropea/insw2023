package com.ue.insw.proyecto.exercises.ej7json;

public class Properties {
    protected String id;
    protected String name;

    public Properties(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Properties{" + "id=" + id + ", name=" + name + '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
