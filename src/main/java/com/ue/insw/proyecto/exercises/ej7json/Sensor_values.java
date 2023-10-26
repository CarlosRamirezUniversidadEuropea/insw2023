package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Sensor_values {
    protected int type;
    protected int num;
    protected List<List<Value>> values;

    public Sensor_values(int t, int n, List<List<Value>> values){
        this.type = t;
        this.num = n;
        this.values = values;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<List<Value>> getValues() {
        return values;
    }

    public void setValues(List<List<Value>> values) {
        this.values = values;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public String toString(){
        return "Type: " +type + "Num: " + num + "Values: " + values;
    }
}
