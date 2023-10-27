package com.ue.insw.proyecto.exercises.ej7json;

public class Field {
    //name, unit,decPrecision
    private String name;
    private String unit;
    private int decPrecision;

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
        return "Field{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", decPrecision=" + decPrecision +
                '}';
    }
}
