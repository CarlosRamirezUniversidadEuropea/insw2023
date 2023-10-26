package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Sensor_descr {
    private int type;
    private int num;
    private List<Field> fields;
    private List<Property> properties;
    public Sensor_descr(int t, int n,List<Field> f,List<Property> p){
        this.type = t;
        this.num = n;
        this.fields = f;
        this.properties = p;
    }

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

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
