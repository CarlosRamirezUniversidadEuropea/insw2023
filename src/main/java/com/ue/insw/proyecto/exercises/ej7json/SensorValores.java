package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class SensorValores {

    // Atributos
    protected int type;
    protected int num;
    protected List<List<Valores>> values;

    /**
     * Constructor de la clase
     * @param type Tipo del sensor
     * @param num Número del sensor
     * @param values Valores
     */
    public SensorValores(int type, int num, List<List<Valores>> values) {
        this.type = type;
        this.num = num;
        this.values = values;
    }

    // Getters y setters
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<List<Valores>> getValues() {
        return values;
    }

    public void setValues(List<List<Valores>> values) {
        this.values = values;
    }

    // Método toString
    @Override
    public String toString() {
        return "Valores del sensor: Tipo ~> " + type + " // Número ~> " + num + " // Valores ~> " + values + "\n";
    }
}