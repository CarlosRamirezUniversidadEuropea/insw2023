import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import java.util.Arrays;
import java.util.List;

class BuscadorTestCase {
    Buscador buscador;

    List<String> lista;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
        lista = Arrays.asList("libro", "comic", "novela");
    }

    @Test
    @DisplayName("Prueba de búsqueda de frase existente")
    void testBuscarFraseExistente() {
        assertTrue(buscador.buscarFrase("libro", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de frase inexistente")
    void testBuscarFraseInexistente() {
        assertFalse(buscador.buscarFrase("coche", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de palabra existente")
    void testBuscarPalabraExistente() {
        assertTrue(buscador.buscarPalabra("comic", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de palabra existente")
    void testBuscarFraseExistente2() {
        assertTrue(buscador.buscarFrase("novela", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de palabra inexistente")
    void testBuscarPalabraInexistente() {
        assertFalse(buscador.buscarPalabra("pez", lista));
    }

    @Test
    @DisplayName("Prueba de devolver palabra en posición válida")
    void testDevolverPalabraPosicionValida() {
        assertEquals("comic", buscador.devolverPalabra(lista, 1));
    }

    @Test
    @DisplayName("Prueba de devolver primer elemento de la lista")
    void testDevolverPrimerElemento() {
        assertEquals("libro", buscador.devolverPrimerElemento(lista));
    }

    @Test
    @DisplayName("Prueba de devolver último elemento de la lista")
    void testDevolverUltimoElemento() {
        assertEquals("novela", buscador.devolverUltimoElemento(lista));
    }
}