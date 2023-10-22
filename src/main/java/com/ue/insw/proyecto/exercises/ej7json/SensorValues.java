package com.ue.insw.proyecto.exercises.ej7json;

import java.util.ArrayList;
import java.util.List;

public class SensorValues extends Sensor{
    List<List<Values>> values;
    public SensorValues(int num, int type, List<List<Values>> v){
        super(type, num);
        this.values = new ArrayList<>(v);
    }

    public List<List<Values>> getValues() {
        return values;
    }

    public void setValues(List<List<Values>> values) {
        this.values = values;
    }
}
