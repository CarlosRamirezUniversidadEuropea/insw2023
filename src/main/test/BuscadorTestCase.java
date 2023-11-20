import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BuscadorTestCase {
    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("buscarFrase debería funcionar")
    void testBuscarFrase() {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        assertEquals(true, buscador.buscarFrase("hello", list), "buscarFrase debería funcionar");
    }

    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabra() {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        assertEquals(true, buscador.buscarPalabra("banana", list), "buscarPalabra debería funcionar");
    }

    @Test
    @DisplayName("buscarPalabra con null debería funcionar")
    void testNullBuscarPalabra() {
        List<String> list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
        list.add("gamma");
        assertEquals(false, buscador.buscarPalabra(null, list), "buscarPalabra con null debería funcionar");
    }

    @Test
    @DisplayName("buscarPalabra con lista null debería funcionar")
    void testNullListBuscarPalabra() {
        assertEquals(false, buscador.buscarPalabra("hello", null), "buscarPalabra con lista null debería funcionar");
    }

    @Test
    @DisplayName("devolverPalabra debería funcionar")
    void testPalabraDevolver() {
        List<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("fish");
        assertEquals("fish", buscador.devolverPalabra(list,2), "devolverPalabra debería funcionar");
    }

    @Test
    @DisplayName("devolverPrimerElemento debería funcionar")
    void testPrimerElementoDevolver() {
        List<String> list = new ArrayList<String>();
        list.add("red");
        list.add("green");
        list.add("blue");
        assertEquals("red", buscador.devolverPrimerElemento(list), "devolverPrimerElemento debería funcionar");
    }

    @Test
    @DisplayName("devolverUltimoElemento debería funcionar")
    void testUltimoElementoDevolver() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        assertEquals("three", buscador.devolverUltimoElemento(list), "devolverUltimoElemento debería funcionar");
    }
}
