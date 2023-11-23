
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
        list = new ArrayList<>();
        list.add("Hola");
        list.add("Que");
        list.add("Tal");
    }

    @Test
    @DisplayName("Buscar palabra que esta en la lista")
    void testBuscarFraseEnLista() {
        assertTrue(buscador.buscarFrase("Hola", list));
    }

    @Test
    @DisplayName("Buscar palabra que no esta en la lista")
    void testBuscarFraseNoEnLista() {
        assertFalse(buscador.buscarFrase("Adios", list));
    }

    @Test
    @DisplayName("Buscar palabra que esta en la lista")
    void testBuscarPalabraEnLista() {
        assertTrue(buscador.buscarPalabra("Hola", list)); // assertEquals pero con expected: true
    }

    @Test
    @DisplayName("Buscar palabra que no esta en la lista")
    void testBuscarPalabraNoEnLista() {
        assertFalse(buscador.buscarPalabra("Adios", list)); // assertEquals pero con expected: true
    }

    @Test
    @DisplayName("Devolver palabra con una posicion valida")
    void testDevolverPalabraPosicionValida() {
        assertEquals("Que", buscador.devolverPalabra(list, 1));
    }

    @Test
    @DisplayName("Devolver palabra con una posicion invalida")
    void testDevolverPalabraPosicionInvalida() {
        assertNull(null, buscador.devolverPalabra(list, 5));
    }

    @Test
    @DisplayName("Devolver el primer elemento con una lista con cosas")
    void testDevolverPrimerElemento() {
        assertEquals("Hola", buscador.devolverPrimerElemento(list));
    }

    @Test
    @DisplayName("Devolver el primer elemento con una lista null")
    void testDevolverPrimerElementoListaNUll() {
        assertNull(null, buscador.devolverPrimerElemento(null));
    }

    @Test
    @DisplayName("Devolver el ultimo elemeto con una lista con cosas")
    void testDevolverUltimoElemento() {
        assertEquals("Tal", buscador.devolverUltimoElemento(list));
    }

    @Test
    @DisplayName("Devolver ultimo elemento con una lista null")
    void testDevolverUltimoElementoListaNull() {
        assertNull(null, buscador.devolverUltimoElemento(null));
    }
}
