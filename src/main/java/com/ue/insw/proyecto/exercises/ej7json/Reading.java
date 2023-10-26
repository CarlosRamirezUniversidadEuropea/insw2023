package com.ue.insw.proyecto.exercises.ej7json;

import java.util.List;

public class Reading{
        int type;
        int num;
        List<List<Val>> values;

        public Reading(int type, int num, List<List<Val>> values) {
            this.type = type;
            this.num = num;
            this.values = values;
        }
        public List<List<Val>> getValues() {
            return values;
        }
        public int getNum() {
            return num;
        }
        public int getType() {
            return type;
        }
        public void setValues(List<List<Val>> values) {
            this.values = values;
        }
        @Override
        public String toString() {
            return "\n\t\tReading{" + "\n\t\ttype=" + type + ", \n\t\tnum=" + num + ", \n\t\tvalues=" + values + '}';
        }
        public class Val{
            double v;
            @Override
            public String toString() {
                return "Val{" + "v=" + v + '}';
            }
        }
    }