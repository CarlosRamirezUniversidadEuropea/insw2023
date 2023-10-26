package com.ue.insw.proyecto.exercises.ej7json;
import java.util.List;
public class Meters {

    private int type;
    private int num;
    private List<Field> fields;
    private List<Property> properties;

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

    @Override
    public String toString() {
        return "Meters {" + "type=" + type +
                ", num=" + num +
                ", fields=" + fields +
                ", properties=" + properties +
                "}";
    }
}

class Field {
    protected String name;
    protected String unit;
    protected int decPrecision;

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

    @Override
    public String toString() {
        return "Fields {" +
                "name=" + name +
                ", unit=" + unit +
                ", decPrecision=" + decPrecision + "}, " ;
    }

}

class Property {
    protected String id;
    protected String name;

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

    @Override
    public String toString() {
        return "Property {" +
                "id=" + id +
                ", nameOwner=" + name +"}, ";
    }

}
