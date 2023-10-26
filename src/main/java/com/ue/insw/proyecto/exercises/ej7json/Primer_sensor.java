package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Primer_sensor {
    public int type;
    public int num;
    List<List<SensorValue>> values;

    public static class SensorValue {
        public double v;

        @Override
        public String toString() {
            return "Valor del sensor{" +
                    "v=" + v +
                    '}';
        }
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

    public List<List<SensorValue>> getValues() {
        return values;
    }

    public void setValues(List<List<SensorValue>> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Sensor1{" +
                "tipo=" + type +
                ", num=" + num +
                ", valores=" + values +
                '}';
    }
}