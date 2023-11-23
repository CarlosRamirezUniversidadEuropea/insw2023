import com.ue.insw.proyecto.exercises.ej6iteratorpattern.List;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscadorTestCase {


    Buscador buscador;
    List<String> lista = (List<String>) Arrays.asList("Hola", "Cómo", "Estás");

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("test BuscarFrase")
    public void testBuscarFrase() {
        // Prueba cuando la frase está en la lista
        boolean resultado1 = buscador.buscarFrase("Hola", (java.util.List<String>) lista);
        assertEquals(true, buscador.buscarFrase("Hola", (java.util.List<String>) lista));

    }

    @Test
    public void testBuscarPalabra() {

        // Prueba cuando la palabra está en la lista
        boolean resultado1 = buscador.buscarPalabra("Cómo", (java.util.List<String>) lista);
        assertEquals(true, buscador.buscarPalabra("Cómo", (java.util.List<String>) lista));
    }

    @Test
    public void testDevolverPalabra() {

        // Prueba para obtener una palabra en una posición válida
        String resultado1 = buscador.devolverPalabra((java.util.List<String>) lista, 3);
        assertEquals("Estás", buscador.devolverPalabra((java.util.List<String>) lista, 3));

        // Prueba para obtener una palabra en una posición inválida
        // Debería lanzar una IndexOutOfBoundsException
        try {
            String resultado2 = buscador.devolverPalabra((java.util.List<String>) lista, 5);
        } catch (IndexOutOfBoundsException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testDevolverPrimerElemento() {

        // Prueba para obtener el primer elemento
        String resultado = buscador.devolverPrimerElemento((java.util.List<String>) lista);
        assertEquals("Hola", buscador.devolverPrimerElemento((java.util.List<String>) lista));
    }

    @Test
    public void testDevolverUltimoElemento() {

        // Prueba para obtener el último elemento
        String resultado = buscador.devolverUltimoElemento((java.util.List<String>) lista);
        assertEquals("Estás", buscador.devolverPrimerElemento((java.util.List<String>) lista));
    }
}