
//todo importar Junit en maven y ejecutar test

import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BuscadorTestCase {


    Buscador buscador;
    List<String> list;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("BuscarFrase")
    void testBuscarFrase() {
        list = new ArrayList<>();
        list.add("Hola");
        list.add("Que");
        list.add("Tal");
        assertTrue(buscador.buscarFrase("Hola", list)); // assertEquals pero con expected: true
    }
    @Test
    @DisplayName("BuscarPalabra")
    void testBuscarPalabra() {
        list = new ArrayList<>();
        list.add("Hola");
        list.add("Que");
        list.add("Tal");
        assertTrue(buscador.buscarPalabra("Hola", list)); // assertEquals pero con expected: true
    }

    @Test
    @DisplayName("DevolverPalabra")
    void testDevolverPalabra() {
        list = new ArrayList<>();
        list.add("Hola");
        list.add("Que");
        list.add("Tal");
        assertEquals("Que", buscador.devolverPalabra(list, 1));
    }

    @Test
    @DisplayName("DevolverPrimerElemento")
    void testDevolverPrimerElemento() {
        list = new ArrayList<>();
        list.add("Hola");
        list.add("Que");
        list.add("Tal");
        assertEquals("Hola", buscador.devolverPrimerElemento(list));
    }

    @Test
    @DisplayName("DevolverUltimoElemento")
    void testDevolverUltimoElemento() {
        list = new ArrayList<>();
        list.add("Hola");
        list.add("Que");
        list.add("Tal");
        assertEquals("Tal", buscador.devolverUltimoElemento(list));
    }
}
