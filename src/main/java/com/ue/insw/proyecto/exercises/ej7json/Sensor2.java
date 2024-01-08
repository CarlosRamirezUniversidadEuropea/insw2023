package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Sensor2 {
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
            return "Field= " + "name: " + name  + " unit: " + unit  + " decPrecision: " + decPrecision ;
        }
    }

    public static class Property {
        public String id;
        public String name;

        @Override
        public String toString() {
            return "Property = " + "id: " + id  + " name: " + name ;
        }
    }

    @Override
    public String toString() {
        return "2º Sensor= " + "type: " + type + ", num: " + num + ", fields: " + fields + ", properties: " + properties ;
    }

}
