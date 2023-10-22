package com.ue.insw.proyecto.exercises.ej7json;

import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;

public class Sensor {
    protected int type, num;
    public Sensor(int type, int num){
        this.type=type;
        this.num = num;
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
}
