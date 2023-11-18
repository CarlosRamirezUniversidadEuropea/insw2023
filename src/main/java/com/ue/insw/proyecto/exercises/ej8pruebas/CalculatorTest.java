package com.ue.insw.proyecto.exercises.ej8pruebas;
import  org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testMultiply(){
        assertEquals(18, calc.multiply(3,5));
    }
}
