import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscadorTestCase {
    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("buscarFrase deberia funcionar")
    void testBuscarFrase() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        assertEquals(true, buscador.buscarFrase("bb", list), "buscarFrase deberia funcionar");
    }
    @Test
    @DisplayName("buscarFrase deberia funcionar")
    void testBuscarFrase1() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        assertEquals(false, buscador.buscarFrase("b", list), "buscarFrase deberia funcionar");
    }
    @Test
    @DisplayName("buscarFrase deberia funcionar")
    void testBuscarFraseNull() {
        List<String> list = new ArrayList<>();
        assertEquals(false, buscador.buscarFrase("b", list), "buscarFrase deberia funcionar");
    }

    @Test
    @DisplayName("buscarFrase deberia funcionar")
    void testBuscarFraseNull1() {
        List<String> list = new ArrayList<>();
        assertEquals(false, buscador.buscarFrase(null, list), "buscarFrase deberia funcionar");
    }

    @Test
    @DisplayName("buscarPalabra deberia funcionar")
    void testBuscarPalabra() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(true, buscador.buscarPalabra("b", list), "buscadorPalabra deberia funcionar");
    }

    @Test
    @DisplayName("buscarPalabra deberia funcionar")
    void testBuscarPalabra1() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(false, buscador.buscarPalabra("no", list), "buscadorPalabra deberia funcionar");
    }

    @Test
    @DisplayName("buscarPalabra deberia funcionar")
    void testBuscarPalabraNull() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(false, buscador.buscarPalabra(null, list), "buscadorPalabra deberia funcionar");
    }

    @Test
    @DisplayName("buscarPalabra deberia funcionar")
    void testBuscarPalabraNull2() {
        List<String> list = new ArrayList<>();
        assertEquals(false, buscador.buscarPalabra(null, list), "buscadorPalabra deberia funcionar");
    }

    @Test
    @DisplayName("buscarPalabra deberia funcionar")
    void testBuscarPalabraNull3() {
        assertEquals(false, buscador.buscarPalabra(null, null), "buscadorPalabra deberia funcionar");
    }

    @Test
    @DisplayName("devolverPalabra deberia funcionar")
    void testDevolverPalabra() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", buscador.devolverPalabra(list, 0), "devolverPalabra deberia funcionar");
    }
    @Test
    @DisplayName("devolverPalabra deberia funcionar")
    void testDevolverPalabra1() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(null, buscador.devolverPalabra(list, 9), "devolverPalabra deberia funcionar");
    }
    @Test
    @DisplayName("devolverPalabra deberia funcionar")
    void testDevolverPalabra2() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(null, buscador.devolverPalabra(list, -9), "devolverPalabra deberia funcionar");
    }
    @Test
    @DisplayName("devolverPalabra deberia funcionar")
    void testDevolverPalabraNull() {
        List<String> list = new ArrayList<>();
        assertEquals(null, buscador.devolverPalabra(list, 0), "devolverPalabra deberia funcionar");
    }

    @Test
    @DisplayName("devolverPrimerElemento deberia funcionar")
    void testDevolverPrimerElemento(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", buscador.devolverPrimerElemento(list), "devolverPrimerElemento deberia funcionar");
    }
    @Test
    @DisplayName("devolverPrimerElemento deberia funcionar")
    void testDevolverPrimerElementoNull(){
        List<String> list = new ArrayList<>();
        assertEquals(null, buscador.devolverPrimerElemento(list), "devolverPrimerElemento deberia funcionar");
    }

    @Test
    @DisplayName("devolverPrimerElemento deberia funcionar")
    void testDevolverUltimoElemento(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("c", buscador.devolverUltimoElemento(list), "devolverUltimoElemento deberia funcionar");
    }
    @Test
    @DisplayName("devolverPrimerElemento deberia funcionar")
    void testDevolverUltimoElementoNull(){
        List<String> list = new ArrayList<>();
        assertEquals(null, buscador.devolverUltimoElemento(list), "devolverUltimoElemento deberia funcionar");
    }

}