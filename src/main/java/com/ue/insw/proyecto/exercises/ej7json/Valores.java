package com.ue.insw.proyecto.exercises.ej7json;

/**
 * Clase para los valores de los sensores
 * @author Pablo Ribas Borrego
*/
public class Valores {
    
    // Atributos
    protected double v;

    /**
     * Constructor de la clase
     * @param v Valor
     */
    public Valores(double v) {
        this.v = v;
    }

    // Getters y setters
    public double getValor() {
        return v;
    }

    public void setValor(double v) {
        this.v = v;
    }

    // Método toString
    @Override
    public String toString() {
        return "" + v;
    }
}
