package com.ue.insw.proyecto.exercises.ej7json;
import java.util.ArrayList;
import java.util.List;

public class SensorDescr extends Sensor{
    private List<Fields> fields;
    private List<Properties> properties;
    public SensorDescr(int type, int num, List<Fields> fields, List<Properties> properties){
        super(type, num);
        this.fields = new ArrayList<>(fields);
        this.properties = new ArrayList<>(properties);
    }

    @Override
    public String toString() {
        return "SensorDescr{" +
                "\ntype=" + type +
                "\n num=" + num +
                "\n fields = "+ fields.toString()+
                "\n properties = " +properties.toString() +
                "\n}";
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
}
