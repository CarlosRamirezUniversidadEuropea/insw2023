package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class SensorDescr {
    protected int type;
    protected int num;
    protected List<Fields> fields;
    protected List<Properties> properties;

    public SensorDescr(int type, int num, List<Fields> fields, List<Properties> properties) {
        this.type = type;
        this.num = num;
        this.fields = fields;
        this.properties = properties;
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

    public List<Fields> getFields() {
        return fields;
    }

    public void setFields(List<Fields> fields) {
        this.fields = fields;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Sensor Description {" + "type=" + type + ", num=" + num + ", fields=" + fields + ", properties=" + properties + '}';
    }
}
