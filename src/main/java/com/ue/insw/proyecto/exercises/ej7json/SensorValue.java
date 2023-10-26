package com.ue.insw.proyecto.exercises.ej7json;

import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;

public class SensorValue {
    public int type;
    public int num;
    List<Value> values;
    public SensorValue(int type, int num, List<Value> values) {
        this.type = type;
        this.num = num;
        this.values = values;
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
    public List<Value> getValues() {
        return values;
    }
    public void setValues(List<Value> values) {
        this.values = values;
    }

}
