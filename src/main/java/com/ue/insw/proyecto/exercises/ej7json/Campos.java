package com.ue.insw.proyecto.exercises.ej7json;

public class Campos {
    
    // Atributos
    protected String name;
    protected char unit;
    protected int decPrecision;

    /**
     * Constructor de la clase
     * @param name Nombre
     * @param unit Unidades de medida
     * @param decPrecision Precisión decimal
     */
    public Campos(String name, char unit, int decPrecision) {
        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;
    }

    // Getters y setters
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

    // Método toString
    @Override
    public String toString() {
        return name + " // Unidades de medida ~> " + unit + " // Precisión decimal ~> " + decPrecision;
    }
}

