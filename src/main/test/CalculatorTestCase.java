//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.ue.insw.proyecto.exercises.ej8pruebas.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTestCase {
    Calculator calculator;

    CalculatorTestCase() {
    }

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        Assertions.assertEquals(20, this.calculator.multiply(4, 5), "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        Assertions.assertEquals(0, this.calculator.multiply(0, 5), "Multiple with zero should be zero");
        Assertions.assertEquals(0, this.calculator.multiply(5, 0), "Multiple with zero should be zero");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testConcat() {
        Assertions.assertEquals("HolaMundo", this.calculator.concat("Hola", "Mundo"), "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testNull() {
        Assertions.assertEquals("Hola", this.calculator.concat("Hola", (String)null), "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testNull2() {
        Assertions.assertEquals("Hola", this.calculator.concat((String)null, "Hola"), "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testConcat2() {
        Assertions.assertEquals("HolaMundo", this.calculator.concat2("Hola", "Mundo"), "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testNull3() {
        Assertions.assertEquals("vacio", this.calculator.concat2("Hola", (String)null), "Regular concatenation should work");
    }
}
