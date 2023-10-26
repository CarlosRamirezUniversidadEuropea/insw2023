    package com.ue.insw.proyecto.exercises.ej7json;


    import java.util.Arrays;

    public class Sensor_Values {
        private int type;
        private int num;
        private Value[][] values;

        public static class Value {
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
        }

        public Sensor_Values(int type, int num, Value[][] values) {
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

        public Value[][] getValues() {
            return values;
        }

        public void setValues(Value[][] values) {
            this.values = values;
        }

        @Override
        public String toString() {
            return "SensorValues{" +
                    "type=" + type +
                    ", num=" + num +
                    ", values=" + Arrays.deepToString(values) +
                    '}';
        }
    }