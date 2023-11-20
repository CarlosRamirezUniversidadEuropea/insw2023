import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuscadorTestCase {

    private Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("Buscar frase existente en la lista debería funcionar")
    void testBuscarFraseExistente() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals(true,buscador.buscarFrase("prueba", lista));
    }

    @Test
    @DisplayName("Buscar frase no existente en la lista debe funcionar")
    void testBuscarFraseNoExistente() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals(false,buscador.buscarFrase("uno", lista));
    }

    @Test
    @DisplayName("Buscar palabra existente en la lista debe funcionar")
    void testBuscarPalabraExistente() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals(true,buscador.buscarPalabra("Adios", lista));
    }

    @Test
    @DisplayName("Buscar palabra no existente en la lista debería funcionar")
    void testBuscarPalabraNoExistente() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals(false,buscador.buscarPalabra("uno", lista));
    }

    @Test
    @DisplayName("Devolver palabra en la posición indicada debería funcionar")
    void testDevolverPalabra() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals("prueba", buscador.devolverPalabra(lista, 1));
    }

    @Test
    @DisplayName("Devolver primer elemento de la lista")
    void testDevolverPrimerElemento() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals("Hola", buscador.devolverPrimerElemento(lista));
    }

    @Test
    @DisplayName("Devolver último elemento de la lista")
    void testDevolverUltimoElemento() {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("prueba");
        lista.add("Adios");
        lista.add("");
        assertEquals("", buscador.devolverUltimoElemento(lista));
    }
}
