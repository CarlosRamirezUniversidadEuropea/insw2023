package com.ue.insw.proyecto.exercises.ej7json;

import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;

import java.util.Properties;

public class SensorDescr {
    public int type;
    public int num;
    public List<Fields> fields;
    public List<Properties> properties;

    public SensorDescr(int type, int num, List<Fields> fields, List<Properties>properties) {
        this.type = type;
        this.num = num;
        this.fields = fields;
        this.properties = properties;
    }
    @Override
    public String toString() {
        return "SensorDescr {" +
                "Type = " + type +
                ", num = " + num +
                ", fields = " + fields +
                ", properties = " + properties +
                "-----------------" +
                '}';
    }

}
