import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscadorTestCase {
    Buscador buscador;

    BuscadorTestCase() {
    }
    @BeforeEach
    void setUp() {
        this.buscador = new Buscador();
    }
    @Test
    @DisplayName("Simple phrase search should work")
    void testBuscarFrase() {
        assertEquals(true, this.buscador.buscarFrase("Mundo", Arrays.asList("Hola", "Mundo")), "Regular word search should work");

    }
    @Test
    @DisplayName("Simple word search should work")
    void testBuscarPalabra() {
        assertEquals(true, this.buscador.buscarPalabra("Hola", Arrays.asList("Hola", "Mundo")), "Regular word search should work");
    }

    @Test
    @DisplayName("Simple element search should work")
    void testDevolverPalabra() {
        assertEquals("Hola", this.buscador.devolverPalabra(Arrays.asList("Hola", "Mundo"), 0), "Regular element search should work");

    }

    @Test
    @DisplayName("Simple element search should work")
    void testDevolverPrimerElemento() {
        assertEquals("Hola", this.buscador.devolverPrimerElemento(Arrays.asList("Hola", "Mundo")), "Regular first element search should work");

    }

    @Test
    @DisplayName("Simple last element search should work")
    void testDevolverUltimoElemento() {
        assertEquals("Mundo", this.buscador.devolverUltimoElemento(Arrays.asList("Hola", "Mundo")), "Regular last element search should work");

    }
}
