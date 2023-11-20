
//todo importar Junit en maven y ejecutar test
import static org.junit.jupiter.api.Assertions.*;

import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BuscadorTestCase {


     Buscador buscador;
     List<String> lista;
     List<String> listaVacia;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
        lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("mundo");
        lista.add("test");
    }

    @Test
    @DisplayName("searching contained phrase should work")
    void testBuscarContained() {
        assertEquals(true, buscador.buscarFrase("hola", lista),
                "searching contained phrase should work");
    }

    @Test
    @DisplayName("searching not contained phrase should work")
    void testBuscarNotContained() {
       assertEquals(false, buscador.buscarFrase("chau", lista),
                "searching not contained phrase should work");
    }
   @Test
    @DisplayName("searching on empty list should work")
    void testBuscarEmptyList() {
        assertEquals(false, buscador.buscarFrase("hola", listaVacia),
                "searching on empty list should work");
    }

    @Test
    @DisplayName("searching in null should work")
    void testBuscarListaNull() {
        assertEquals(false, buscador.buscarPalabra("hola", null),
                "searching in null should work");
    }


    @Test
    @DisplayName("searching contained word should work")
    void testBuscarPalabraContained() {
        assertEquals(true, buscador.buscarPalabra("hola", lista),
                "searching contained word should work");
    }

    @Test
    @DisplayName("searching not contained word should work")
    void testBuscarPalabraNotContained() {
       assertEquals(false, buscador.buscarPalabra("chau", lista),
                "searching not contained word should work");
    }

    @Test
    @DisplayName("searching on empty list should work")
    void testBuscarPalabraEmptyList() {
        assertEquals(false, buscador.buscarPalabra("hola", listaVacia),
                "searching on empty list should work");
    }

    @Test
    @DisplayName("searching in null should work")
    void testBuscarPalabraListaNull() {
        assertEquals(false, buscador.buscarPalabra("hola", null),
                "searching in null should work");
    }


    @Test
    @DisplayName("devolver contained word should work")
    void testDevolverPalabraContained() {
        assertEquals("hola", buscador.devolverPalabra(lista, 0),
                "devolver contained word should work");
    }

    @Test
    @DisplayName("devolver not contained word should work")
    void testDevolverPalabraNotContained() {
       assertEquals(null, buscador.devolverPalabra(lista, 3),
                "devolver not contained word should work");
    }

    @Test
    @DisplayName("devolver on empty list should work")
    void testDevolverPalabraEmptyList() {
        assertEquals(null, buscador.devolverPalabra(listaVacia, 0),
                "devolver on empty list should work");
    }

    @Test
    @DisplayName("devolver in null should work")
    void testDevolverPalabraListaNull() {
        assertEquals(null, buscador.devolverPalabra(null, 0),
                "devolver in null should work");
    }

    @Test
    @DisplayName("devolver primer elemento de lista valida should work")
    void testDevolverPrimerElementoContained() {
        assertEquals("hola", buscador.devolverPrimerElemento(lista),
                "searching contained word should work");
    }
    
    @Test
    @DisplayName("devolver primer elemento de lista vacía should work")
    void testDevolverPrimerElementoEmptyList() {
        assertEquals(null, buscador.devolverPrimerElemento(listaVacia),
                "searching contained word should work");
    }

    @Test
    @DisplayName("searching contained word should work")
    void testDevolverPrimerElementoListaNull() {
        assertEquals(null, buscador.devolverPrimerElemento(null),
                "searching contained word should work");
    }

    @Test
    @DisplayName("devolver ultimo elemento from valid  list should work")
    void testDevolverUltimoElementoContained() {
        assertEquals("test", buscador.devolverUltimoElemento(lista),
                "devolver ultimo elemento from valid list should work");
    }

    @Test
    @DisplayName("devolver ultimo elemento from empty list should work")
    void testDevolverUltimoElementoNotContained() {
        assertEquals(null, buscador.devolverUltimoElemento(listaVacia),
                "devolver ultimo elemento from empty list should return null");
    }

    @Test
    @DisplayName("devolver ultimo elemento from should work")
    void testDevolverUltimoElementoListaNull() {
        assertEquals(null, buscador.devolverUltimoElemento(null),
                "devolver ultimo elemento from null should return null");
    }

    
}
