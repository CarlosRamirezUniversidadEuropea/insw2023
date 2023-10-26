package com.ue.insw.proyecto.exercises.ej7json;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private int type;
    private int num;
    private List<Field> fields;
    private List<Property> properties;

    public Sensor(int type, int num, List<Field> fields, List<Property> properties) {
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

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();

        List<Field> fields1 = new ArrayList<>();
        fields1.add(new Field("Voltage", "V", 3));
        fields1.add(new Field("Current", "A", 1));
        List<Property> properties1 = new ArrayList<>();
        properties1.add(new Property("L1", "Meter1"));
        properties1.add(new Property("L2", "Meter2"));
        sensors.add(new Sensor(664, 2, fields1, properties1));

        List<Field> fields2 = new ArrayList<>();
        fields2.add(new Field("Temperature", "C", 1));
        fields2.add(new Field("Humidity", "%", 1));
        List<Property> properties2 = new ArrayList<>();
        properties2.add(new Property("6102", "Server-Rack"));
        sensors.add(new Sensor(665, 1, fields2, properties2));
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getDecPrecision() {
        return decPrecision;
    }

    public void setDecPrecision(int decPrecision) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
