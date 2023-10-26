package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;


public class Link2 {
    private int type;
    private int num;
    private List<Field>fields;
    private List<Properties>properties;

    public Link2(int type, int num, List<Field> fields, List<Properties> properties) {
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


    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }
}

