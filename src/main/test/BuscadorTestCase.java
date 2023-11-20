
import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BuscadorTestCase {

    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }


    @Test
    @DisplayName("Search sentence should work")
    public void testBuscarFrase_Existente() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertTrue(buscador.buscarFrase("Mundo", lista));
    }

    @Test
    @DisplayName("Search sentence should not exist ")
    public void testBuscarFrase_NoExistente() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertFalse(buscador.buscarFrase("Python", lista));
    }

    @Test
    @DisplayName("Search sentence is null")
    public void testBuscarFrase_Null() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertFalse(buscador.buscarFrase(null, lista));
    }

    @Test
    @DisplayName("List is empty")
    public void testBuscarFrase_ListaVacia() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList();
        assertFalse(buscador.buscarFrase("Java", lista));
    }

    @Test
    @DisplayName("List is null")
    public void testBuscarFrase_ListaNull() {
        Buscador buscador = new Buscador();
        List<String> lista = null;
        assertFalse(buscador.buscarFrase("Java", lista));
    }

    @Test
    @DisplayName("Search word should work")
    public void testBuscarPalabra() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertTrue(buscador.buscarPalabra("Mundo", lista));
        assertFalse(buscador.buscarPalabra("Python", lista));
    }

    @Test
    @DisplayName("reutn valid position should work")
    public void testDevolverPalabra_PosicionValida() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertEquals("Mundo", buscador.devolverPalabra(lista, 1));
    }

    @Test
    @DisplayName("return invalid position should work")
    public void testDevolverPalabra_PosicionInvalida() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> buscador.devolverPalabra(lista, 5));

        assertEquals("Posición fuera de rango", exception.getMessage());
    }

    @Test
    @DisplayName("return null list should work")
    public void testDevolverPalabra_ListaNull() {
        Buscador buscador = new Buscador();
        List<String> lista = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> buscador.devolverPalabra(lista, 2));
        assertEquals("La lista no puede ser nula", exception.getMessage());
    }

    @RepeatedTest(3)
    @DisplayName("return first element should work")
    public void testDevolverPrimerElemento() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("A", "B", "C");
        assertEquals("A", buscador.devolverPrimerElemento(lista));
    }

    @Test
    @DisplayName("return null list should work")
    public void testDevolverPrimerElemento_ListaNula() {
        Buscador buscador = new Buscador();
        List<String> lista = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> buscador.devolverPrimerElemento(lista));
        assertEquals("La lista es nula o esta vacía", exception.getMessage());
    }

    @Test
    @DisplayName("return empty list should work")
    public void testDevolverPrimerElemento_ListaVacia() {
        Buscador buscador = new Buscador();
        List<String> lista = Collections.emptyList();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> buscador.devolverPrimerElemento(lista));
        assertEquals("La lista es nula o esta vacía", exception.getMessage());
    }

    @Test
    @DisplayName("return last element should work")
    public void testDevolverUltimoElemento() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Paula", "Alejandra", "Raquel");
        assertEquals("Raquel", buscador.devolverUltimoElemento(lista));
    }

    @Test
    @DisplayName("return null list should work")
    public void testDevolverUltimoElemento_ListaNula() {
        Buscador buscador = new Buscador();
        List<String> lista = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> buscador.devolverUltimoElemento(lista));
        assertEquals("La lista es nula o esta vacía", exception.getMessage());
    }

    @Test
    @DisplayName("return list is empty should work")
    public void testDevolverUltimoElemento_ListaVacia() {
        Buscador buscador = new Buscador();
        List<String> lista = Collections.emptyList();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> buscador.devolverUltimoElemento(lista));
        assertEquals("La lista es nula o esta vacía", exception.getMessage());
    }

}
