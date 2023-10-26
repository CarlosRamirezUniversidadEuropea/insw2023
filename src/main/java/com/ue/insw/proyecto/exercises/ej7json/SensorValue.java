package com.ue.insw.proyecto.exercises.ej7json;

import java.util.ArrayList;
import java.util.List;

public class SensorValue {
    private int type;
    private int num;
    private List<List<Value>> values;

    public SensorValue(int type, int num, List<List<Value>> values) {
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

    public List<List<Value>> getValues() {
        return values;
    }

    public void setValues(List<List<Value>> values) {
        this.values = values;
    }

    public static void main(String[] args) {
        List<List<Value>> values1 = new ArrayList<>();
        List<Value> value1 = new ArrayList<>();
        value1.add(new Value(233.19));
        value1.add(new Value(3.2));
        values1.add(value1);

        List<Value> value2 = new ArrayList<>();
        value2.add(new Value(226.2));
        value2.add(new Value(0.3));
        values1.add(value2);

        SensorValue sensorValue1 = new SensorValue(664, 2, values1);

        List<List<Value>> values2 = new ArrayList<>();
        List<Value> value3 = new ArrayList<>();
        value3.add(new Value(27.1));
        value3.add(new Value(40.3));
        values2.add(value3);

        SensorValue sensorValue2 = new SensorValue(665, 1, values2);

        List<SensorValue> sensorValues = new ArrayList<>();
        sensorValues.add(sensorValue1);
        sensorValues.add(sensorValue2);

        System.out.println(sensorValues);
    }
}

class Value {
    private double v;

    public Value(double v) {
        this.v = v;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "{\"v\": " + v + "}";
    }
}
