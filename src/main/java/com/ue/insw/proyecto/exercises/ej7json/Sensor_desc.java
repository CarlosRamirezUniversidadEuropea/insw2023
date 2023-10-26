package com.ue.insw.proyecto.exercises.ej7json;

import java.util.Arrays;
import java.util.List;

public class Sensor_desc {
    private int type;
    private int num;
    private Field[] fields;
    private Property[] properties;

    public static class Field {
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

    public static class Property {
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

    public Sensor_desc(int type, int num, Field[] fields, Property[] properties) {
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

    public Field[] getFields() {
        return fields;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "type=" + type +
                ", num=" + num +
                ", fields=" + Arrays.toString(fields) +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}