import static org.junit.jupiter.api.Assertions.*;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuscadorTestCase {

    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("Buscar frase existente en la lista debería devolver true")
    void testBuscarFraseExistente() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertTrue(buscador.buscarFrase("Hola", lista),
                "Buscar frase existente debería devolver true");
    }

    @Test
    @DisplayName("Buscar frase no existente en la lista debería devolver false")
    void testBuscarFraseNoExistente() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertFalse(buscador.buscarFrase("Python", lista),
                "Buscar frase no existente debería devolver false");
    }

    @Test
    @DisplayName("Buscar palabra existente en la lista debería devolver true")
    void testBuscarPalabraExistente() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertTrue(buscador.buscarPalabra("Hola", lista),
                "Buscar palabra existente debería devolver true");
    }

    @Test
    @DisplayName("Buscar palabra no existente en la lista debería devolver false")
    void testBuscarPalabraNoExistente() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertFalse(buscador.buscarPalabra("Python", lista),
                "Buscar palabra no existente debería devolver false");
    }

    @Test
    @DisplayName("Devolver palabra en la posición indicada")
    void testDevolverPalabra() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertEquals("Mundo", buscador.devolverPalabra(lista, 1),
                "Devolver palabra en la posición indicada debería ser correcto");
    }

    @Test
    @DisplayName("Devolver primer elemento de la lista")
    void testDevolverPrimerElemento() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertEquals("Hola", buscador.devolverPrimerElemento(lista),
                "Devolver primer elemento de la lista debería ser correcto");
    }

    @Test
    @DisplayName("Devolver último elemento de la lista no vacía")
    void testDevolverUltimoElementoNoVacia() {
        List<String> lista = Arrays.asList("Hola", "Mundo", "Java");
        assertEquals("Java", buscador.devolverUltimoElemento(lista),
                "Devolver último elemento de la lista no vacía debería ser correcto");
    }

    @Test
    @DisplayName("Devolver 'Fin de Lista' para la lista vacía")
    void testDevolverUltimoElementoVacia() {
        List<String> lista = Arrays.asList();
        assertEquals("Fin de Lista", buscador.devolverUltimoElemento(lista),
                "Devolver 'Fin de Lista' para la lista vacía debería ser correcto");
    }

}
