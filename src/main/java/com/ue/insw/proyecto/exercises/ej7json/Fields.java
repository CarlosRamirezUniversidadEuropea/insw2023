package com.ue.insw.proyecto.exercises.ej7json;

import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;

public class Fields {
    public String name;
    public char unit;
    public int decPrecision;

    @Override
    public String toString() {
        return "Fields {" +
                "Name = " + name +
                ", unit = " + unit +
                ", decPrecision = " + decPrecision +
                "----------------------" +
                '}';
    }

    public Fields(String name, char unit, int decPrecision) {
        this.decPrecision = decPrecision;
        this.name = name;
        this.unit = unit;
    }
    public int getDecPrecision() {
        return decPrecision;
    }

    public void setDecPrecision(int decPrecision) {
        this.decPrecision = decPrecision;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }
}
