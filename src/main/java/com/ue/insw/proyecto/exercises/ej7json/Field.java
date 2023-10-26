package com.ue.insw.proyecto.exercises.ej7json;

public class Field {
    protected String name;
    protected String unit;
    protected int decPrecision;

    public Field(String n, String u, int d){
        this.name = n;
        this.unit = u;
        this.decPrecision = d;
    }
    public String getNombre(){
        return name;
    }
    public void setNombre(String n) {
        this.name = n;
    }
    public String getUnit(){
        return unit;
    }
    public void setUnit(String u) {
        this.unit = u;
    }
    public int getPhone(){
        return decPrecision;
    }
    public void setPhone(int d) {
        this.decPrecision = d;
    }
    @Override
    public String toString(){
        return "Name: " + name + "Unit" + unit + "DecPrecision" + decPrecision;
    }
}
