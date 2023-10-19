package com.ue.insw.proyecto.exercises.ej7json;

import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;

public class Meters {

    private String type;
    private int num;

    private Field field;

    private Property property;

    public Meters(String type, int num, Field field, Property property) {
        this.type = type;
        this.num = num;
        this.field = field;
        this.property = property;
    }

    public String getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public Field getField() {
        return field;
    }

    public Property getProperty() {
        return property;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Meters{" +
                "type='" + type + '\'' +
                ", num=" + num +
                ", field=" + field +
                ", property=" + property +
                '}';
    }
}

class Field {
    private String name;
    private String unit;
    private int decPrecision;

    public Field(String name, String unit, int decPrecision) {
        this.name = name;
        this.unit = unit;
        this.decPrecision = decPrecision;
    }

}

class Property {
    private String id;
    private String name;

    public Property(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
