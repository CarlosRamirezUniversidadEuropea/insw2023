package com.ue.insw.proyecto.exercises.ej7json;

import java.util.Vector;

public class Sensor1 {
    private int type;
    private int num;
    private Vector<Vector<Valores>> values;

    public Sensor1(int type, int num, Vector<Vector<Valores>> values) {
        this.type = type;
        this.num = num;
        this.values = values;
    }

    public int getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public Vector<Vector<Valores>> getValues() {
        return values;
    }
}
