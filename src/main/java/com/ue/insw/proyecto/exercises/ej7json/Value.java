package com.ue.insw.proyecto.exercises.ej7json;

public class Value {
    protected float v;

    public Value(float v){
        this.v = v;
    }
    public float getV(){
        return v;
    }
    public void setV(float v) {
        this.v = v;
    }
    @Override
    public String toString(){
        return "V: " +v;
    }
}
