package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Sensor_values {
    private int type;
    private int num;
    private List<List<Value>> values;
    public Sensor_values(int t, int n, List<List<Value>> val){
        this.type = t;
        this.num = n;
        this.values = val;
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

    public List<List<Value>> getValues() {
        return values;
    }

    public void setValues(List<List<Value>> values) {
        this.values = values;
    }
    public String toString(){
        return "Values ["+type+","+num+","+values+"]";
    }
}
