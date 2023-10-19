package com.ue.insw.proyecto.exercises.ej7json;

public class Fields {

    protected String name;
    protected char unit;
    protected int decPrecision;

    @Override
    public String toString() {
        return "Fields{" + "name=" + name + ", unit=" + unit + ", decPrecision=" + decPrecision + '}';
    }

    public Fields(String name, char unit, int decPrecision) {
        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;
    }

    public String getName() {
        return name;
    }

    public char getUnit() {
        return unit;
    }

    public int getDecPrecision() {
        return decPrecision;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }

    public void setDecPrecision(int decPrecision) {
        this.decPrecision = decPrecision;
    }
}
