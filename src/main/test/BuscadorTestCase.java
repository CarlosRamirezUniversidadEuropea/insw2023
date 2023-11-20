
import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


public class BuscadorTestCase {

    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("Search sentence should work")
    public void testBuscarFrase() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");

        assertTrue(buscador.buscarFrase("Hola", lista));
        assertFalse(buscador.buscarFrase("Adiós", lista));
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
    @DisplayName("return word should work")
    public void testDevolverPalabra() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");

        assertEquals("Mundo", buscador.devolverPalabra(lista, 1));
    }

    @Test
    @DisplayName("Return first element should work")
    public void testDevolverPrimerElemento() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");

        assertEquals("Hola", buscador.devolverPrimerElemento(lista));
    }


    @RepeatedTest(3)
    @DisplayName("Return last element should work")
    public void testDevolverUltimoElemento() {
        Buscador buscador = new Buscador();
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");

        assertEquals("Java", buscador.devolverUltimoElemento(lista));
    }

}
