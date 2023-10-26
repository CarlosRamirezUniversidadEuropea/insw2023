package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Segundo_sensor {
    public int type;
    public int num;
    public List<Field> fields;
    public List<Property> properties;

    public static class Field {
        public String name;
        public String unit;
        public int decPrecision;

        @Override
        public String toString() {
            return "Campos{" +
                    "nombre='" + name + '\'' +
                    ", unit='" + unit + '\'' +
                    ", decPrecision=" + decPrecision +
                    '}';
        }
    }

    public static class Property {
        public String id;
        public String name;

        @Override
        public String toString() {
            return "Propiedades{" +
                    "id='" + id + '\'' +
                    ", nombre='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Sensor2{" +
                "tipo=" + type +
                ", num=" + num +
                ", campos=" + fields +
                ", propiedades=" + properties +
                '}';
    }
}