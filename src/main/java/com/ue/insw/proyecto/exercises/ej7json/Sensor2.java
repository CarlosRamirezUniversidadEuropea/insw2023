package com.ue.insw.proyecto.exercises.ej7json;

import java.util.Vector;

public class Sensor2 {
    private int type;
    private int num;
    Vector<Campos> fields;
    Vector<Propiedades> properties;

    public Sensor2(int type, int num, Vector<Campos> fields, Vector<Propiedades> properties) {
        this.type = type;
        this.num = num;
        this.fields = fields;
        this.properties = properties;
    }

    public int getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public Vector<Campos> getFields() {
        return fields;
    }

    public Vector<Propiedades> getProperties() {
        return properties;
    }
}
