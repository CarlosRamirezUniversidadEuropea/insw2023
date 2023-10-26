package com.ue.insw.proyecto.exercises.ej7json;
import java.util.List;

public class SensorValues {
    private int type;
    private int num;
    private List<List<Value>> values;
    public SensorValues(int type, int num, List<List<Value>> valu){
        this.type = type;
        this.num = num;
        this.values = valu;
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
}
