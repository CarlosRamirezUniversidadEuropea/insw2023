package com.ue.insw.proyecto.exercises.ej7json;
import java.util.List;

public class Value {

    private int type;
    private int num;
    List<List<Values>> values;

    public Value(int type, int num, List<List<Values>> values) {
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

    public List<List<Values>> getFields() {
        return values;
    }

    public void setFields(List<Values> fields) {
        this.values = values;
    }


    @Override
    public String toString() {
        return "Meters {" + "type=" + type +
                ", num=" + num +
                ", fields=" + values + "}";
    }
}

class Values {
    double valor;
    @Override
    public String toString() {
        return "Val{" +
                "valor=" + valor +
                '}';
    }
}
