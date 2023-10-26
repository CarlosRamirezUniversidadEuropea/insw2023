package com.ue.insw.proyecto.exercises.ej7json;

import java.util.Collections;
import java.util.List;

public class Object1 {

    protected int type;
    protected int num;
    protected List<List<Value>> values;

    @Override
    public String toString() {
        return "Object1{" + "type=" + type + ", num=" + num + ", values=" + values + '}';
    }

    public Object1(int type, int num, List<Value> values) {
        this.type = type;
        this.num = num;
        this.values = Collections.singletonList(values);
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

    public void setValues(List<Value> values) {
        this.values = Collections.singletonList(values);
    }
}
