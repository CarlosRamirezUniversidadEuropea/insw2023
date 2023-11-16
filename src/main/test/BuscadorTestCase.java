import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BuscadorTestCase {
    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("Ensuring that the phrase is found at the first position")
    void testBuscarFrase() {
        assertEquals(true, buscador.buscarFrase("Hola", List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the phrase is found at the first position");
    }

    @Test
    @DisplayName("Ensuring that the phrase is found at the last position")
    void testBuscarFrase2() {
        assertEquals(true, buscador.buscarFrase("Magdalenas", List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the phrase is found at the last position");
    }

    @Test
    @DisplayName("Ensuring that the phrase is found")
    void testBuscarFrase3() {
        assertEquals(true, buscador.buscarFrase("Croqueta", List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the phrase is found");
    }

    @Test
    @DisplayName("Ensuring that the phrase is not found")
    void testBuscarFrase4() {
        assertEquals(false, buscador.buscarFrase("Croqueta", List.of("Hola", "Mundo", "Magdalenas")),
                "the phrase is not found");
    }

    @Test
    @DisplayName("Ensuring that the word is found at the first position")
    void testBuscarPalabra() {
        assertEquals(true, buscador.buscarPalabra("Hola", List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the word is found at the first position");
    }

    @Test
    @DisplayName("Ensuring that the word is found at the last position")
    void testBuscarPalabra2() {
        assertEquals(true, buscador.buscarPalabra("Magdalenas", List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the word is found at the last position");
    }

    @Test
    @DisplayName("Ensuring that the word is found")
    void testBuscarPalabra3() {
        assertEquals(true, buscador.buscarPalabra("Croqueta", List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the word is found");
    }

    @Test
    @DisplayName("Ensuring that the word is not found")
    void testBuscarPalabra4() {
        assertEquals(false, buscador.buscarPalabra("Croqueta", List.of("Hola", "Mundo", "Magdalenas")),
                "the word is not found");
    }

    @Test
    @DisplayName("Ensuring that the word is returned")
    void testDevolverPalabra() {
        assertEquals("Hola", buscador.devolverPalabra(List.of("Hola", "Mundo", "Croqueta", "Magdalenas"), 0),
                "the word is returned");
    }

    @Test
    @DisplayName("Ensuring that the word is returned with position 100")
    void testDevolverPalabra2() {
        assertEquals("Posición no válida", buscador.devolverPalabra(List.of("Hola", "Mundo", "Croqueta", "Magdalenas"), 100),
                "the word is returned with position 100");
    }

    @Test
    @DisplayName("Ensuring that the word is returned with a null list")
    void testDevolverPalabra3() {
        assertEquals("Lista vacía", buscador.devolverPalabra(null, 0),
                "the word is returned with a null list");
    }

    @Test
    @DisplayName("Ensuring that the word is returned at the first position")
    void testDevolverPrimerElemento() {
        assertEquals("Hola", buscador.devolverPrimerElemento(List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the word is returned at the first position");
    }

    @Test
    @DisplayName("Ensuring that the first word is returned with a null list")
    void testDevolverPrimerElemento2() {
        assertEquals("Lista vacía", buscador.devolverPrimerElemento(null),
                "the word is returned with a null list");
    }

    @Test
    @DisplayName("Ensuring that the word is returned at the last position")
    void testDevolverUltimoElemento() {
        assertEquals("Magdalenas", buscador.devolverUltimoElemento(List.of("Hola", "Mundo", "Croqueta", "Magdalenas")),
                "the word is returned at the last position");
    }

    @Test
    @DisplayName("Ensuring that the last word is returned with a null list")
    void testDevolverUltimoElemento2() {
        assertEquals("Lista vacía", buscador.devolverUltimoElemento(null),
                "the word is returned with a null list");
    }
}
