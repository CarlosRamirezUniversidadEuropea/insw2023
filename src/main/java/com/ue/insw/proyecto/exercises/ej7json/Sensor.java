package com.ue.insw.proyecto.exercises.ej7json;
import java.util.List;

public class Sensor {
    private int type;
    private int num;
    private List<Field> fields;
    private List<Property> properties;

    private Reading readings;

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
    public Reading getReadings() {
        return readings;
    }
    public void setReadings(Reading readings) {
        this.readings = readings;
    }
    @Override
    public String toString() {
        return "Sensor{" + "type=" + type + ", \n\tnum=" + num + ", \n\tfields=" + fields + ", \n\tproperties=" + properties + ", \n\treadings=" + readings + '}';
    }

    public static class Field {
        private String name;
        private String unit;
        private int decPrecision;

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
        @Override
        public String toString() {
            return "Field{" + "name=" + name + ", unit=" + unit + ", decPrecision=" + decPrecision + '}';
        }
    }

    public static class Property {
        private String id;
        private String name;

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
        @Override
        public String toString() {
            return "Property{" + "id=" + id + ", name=" + name + '}';
        }
    }

}