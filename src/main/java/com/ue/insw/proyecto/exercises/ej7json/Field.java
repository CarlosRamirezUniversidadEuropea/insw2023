package com.ue.insw.proyecto.exercises.ej7json;

public class Field {
    private String name;
    private String unit;
    private int decPrecision;
    public Field(String n, String u, int dp){
        this.name = n;
        this.unit = u;
        this.decPrecision = dp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public int getDecPrecision() {
        return decPrecision;
    }
    public void setDecPrecision(int decPrecision) {
        this.decPrecision = decPrecision;
    }
}
