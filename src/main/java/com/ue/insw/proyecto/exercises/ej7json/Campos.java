package com.ue.insw.proyecto.exercises.ej7json;

public class Campos {
    private String name;
    private String unit;
    private int decPrecision;

    public Campos(String name, String unit, int decPrecision) {
        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getDecPrecision() {
        return decPrecision;
    }
}
