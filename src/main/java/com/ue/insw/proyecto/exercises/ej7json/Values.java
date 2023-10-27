package com.ue.insw.proyecto.exercises.ej7json;

public class Values {
    protected float value;
    public Values(float value){
        this.value = value;
    }
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Values{" +
                "value=" + value +
                '}';
    }
}
