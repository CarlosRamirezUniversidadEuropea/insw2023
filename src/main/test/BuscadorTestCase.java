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
        lista = Arrays.asList("casa", "perro", "gato");
    }

    @Test
    @DisplayName("Prueba de búsqueda de frase existente")
    void testBuscarFraseExistente() {
        assertTrue(buscador.buscarFrase("casa", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de frase inexistente")
    void testBuscarFraseInexistente() {
        assertFalse(buscador.buscarFrase("coche", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de palabra existente")
    void testBuscarPalabraExistente() {
        assertTrue(buscador.buscarPalabra("perro", lista));
    }

    @Test
    @DisplayName("Prueba de búsqueda de palabra inexistente")
    void testBuscarPalabraInexistente() {
        assertFalse(buscador.buscarPalabra("pez", lista));
    }

    @Test
    @DisplayName("Prueba de devolver palabra en posición válida")
    void testDevolverPalabraPosicionValida() {
        assertEquals("perro", buscador.devolverPalabra(lista, 1));
    }

    @Test
    @DisplayName("Prueba de devolver primer elemento de la lista")
    void testDevolverPrimerElemento() {
        assertEquals("casa", buscador.devolverPrimerElemento(lista));
    }

    @Test
    @DisplayName("Prueba de devolver último elemento de la lista")
    void testDevolverUltimoElemento() {
        assertEquals("gato", buscador.devolverUltimoElemento(lista));
    }
}