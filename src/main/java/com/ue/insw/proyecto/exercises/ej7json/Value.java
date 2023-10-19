package com.ue.insw.proyecto.exercises.ej7json;

public class Value {

    protected double v;

    @Override
    public String toString() {
        return "Value{" + "v=" + v + '}';
    }

    public Value(double v) {
        this.v = v;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
