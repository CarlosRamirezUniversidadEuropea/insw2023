package com.ue.insw.proyecto.exercises.ej7json;


import java.util.List;

public class Link1 {
    private int type;
    private int num;
    private List<List<Values>>values;


    public Link1(int type, int num, List<List<Values>> values) {
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

    public List<List<Values>> getValues() {
        return values;
    }

    public void setValues(List<List<Values>> values) {
        this.values = values;
    }
}
