package com.ue.insw.proyecto.exercises.ej7json;

public class Fields {
    private String name, unit;
    private int decPrecision;
    public Fields(String name, String unit, int decPrecision){
        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;
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

    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", decPrecision=" + decPrecision +
                '}';
    }
}
