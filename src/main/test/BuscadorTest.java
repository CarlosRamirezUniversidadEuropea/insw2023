//todo importar Junit en maven y ejecutar test
import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BuscadorTest {

    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    void testBuscarFrase() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hello", "World");
 
        // Test para frase encontrada en pos 0
        assertTrue(buscador.buscarFrase("Hello", lista));

        // Test para frase encontrada en pos 1
        assertTrue(buscador.buscarFrase("World", lista));
 
        // Test cuando no se encuentra la frase
        assertFalse(buscador.buscarFrase("Test", lista));
 
        // Test cuando la lista esta vacia
        assertFalse(buscador.buscarFrase("Hello", new ArrayList<>()));
    }

    @Test
    void testBuscarPalabra() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hello", "World");

        // Test para palabra encontrada en pos 0
        assertTrue(buscador.buscarPalabra("Hello", lista));

        // Test para palabra encontrada en pos 1
        assertTrue(buscador.buscarPalabra("World", lista));

        // Test para palabra no encontrada
        assertFalse(buscador.buscarPalabra("Test", lista));

        // Test para lista vacia
        assertFalse(buscador.buscarPalabra("Hello", new ArrayList<>()));
    }

    @Test
    void testDevolverPalabra() {
       Buscador buscador = new Buscador();
       List<String> lista = Arrays.asList("Hello", "World");
    
       // Test para posicion valida
       assertEquals("Hello", buscador.devolverPalabra(lista, 0));
    
       // Test para posicion invalida
       assertThrows(IndexOutOfBoundsException.class, () -> buscador.devolverPalabra(lista, 10));
    
       // Test para la lista vacia
       assertThrows(IndexOutOfBoundsException.class, () -> buscador.devolverPalabra(new ArrayList<>(), 0));
    }

    @Test
    void testDevolverPrimerElemento() {
       Buscador buscador = new Buscador();
       List<String> lista = Arrays.asList("Hello", "World");
    
       // Test cuando hay al menos un match
       assertEquals("Hello", buscador.devolverPrimerElemento(lista));
    
       // Test cuando esta vacia
       assertThrows(IndexOutOfBoundsException.class, () -> buscador.devolverPrimerElemento(new ArrayList<>()));
    }

    @Test
    void testDevolverUltimoElemento() {
       Buscador buscador = new Buscador();
       List<String> lista = Arrays.asList("Hello", "World");
    
       // Test para una lista con un match
       assertEquals("World", buscador.devolverUltimoElemento(lista));
    
       // Test para lista vacia
       assertThrows(IndexOutOfBoundsException.class, () -> buscador.devolverUltimoElemento(new ArrayList<>()));
    }
    
}