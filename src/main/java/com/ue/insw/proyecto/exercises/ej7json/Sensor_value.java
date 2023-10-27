package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Sensor_value {
    protected int type;
    protected int num;
    protected List<List<Values>> values;

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
    public List<List<Values>> getValues() {
        return values;
    }

    public void setValues(List<List<Values>> values) {
        this.values = values;
    }
    @Override
    public String toString() {
        return "Sensor_values{" +
                "type=" + type +
                ", num=" + num +
                ", values=" + values +
                '}';
    }
}
