package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String base;
    private List<String> ingredients;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients) {

    }

    public void bake() {
        bakeStyle.bake(this);
    }
}
