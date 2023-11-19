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
    void setUp(){
        buscador = new Buscador();
    }
    @Test
    @DisplayName("BuscarFrase debería funcionar")
    void testBuscarFrase(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(false, buscador.buscarFrase("e", list), "BuscarFrase debería funcionar");
    }
    @Test
    @DisplayName("BuscarFrase debería funcionar")
    void testBuscarFraseNull(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(false, buscador.buscarFrase(null, list), "BuscarFrase debería funcionar");
    }
    @Test
    @DisplayName("BuscarFrase debería funcionar")
    void testBuscarFraseNull2(){
        assertEquals(false, buscador.buscarFrase("a", null), "BuscarFrase debería funcionar");
    }
    @Test
    @DisplayName("BuscarPalabra debería funcionar")
    void testBuscarPalabra(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(true, buscador.buscarPalabra("b", list), "BuscadorPalabra debería funcionar");
    }
    @Test
    @DisplayName("BuscarPalabra debería funcionar")
    void testBuscarPalabraNull(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(false, buscador.buscarPalabra(null, list), "BuscadorPalabra debería funcionar");
    }
    @Test
    @DisplayName("BuscarPalabra debería funcionar")
    void testBuscarPalabraNull2(){
        assertEquals(false, buscador.buscarPalabra("a", null), "BuscadorPalabra debería funcionar");
    }
    @Test
    @DisplayName("DevolverPalabra debería funcionar")
    void testDevolverPalabra(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("b", buscador.devolverPalabra(list, 1), "DevolverPalabra funciona");
    }
    @Test
    @DisplayName("DevolverPalabra debería funcionar")
    void testDevolverPalabraNegativo(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(null, buscador.devolverPalabra(list, -1), "DevolverPalabra funciona");
    }
    @Test
    @DisplayName("DevolverPalabra debería funcionar")
    void testDevolverPalabraNull(){
        assertEquals(null, buscador.devolverPalabra(null, 0), "DevolverPalabra funciona");
    }
    @Test
    @DisplayName("DevolverPrimerElemento debería funcionar")
    void testDevolverPrimerElemento(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", buscador.devolverPrimerElemento(list), "DevolverPrimerElemento funciona");
    }
    @Test
    @DisplayName("DevolverPrimerElemento debería funcionar")
    void testDevolverPrimerElementoNull(){
        assertEquals(null, buscador.devolverPrimerElemento(null), "DevolverPrimerElemento funciona");
    }
    @Test
    @DisplayName("DevolverUltimoElemento debería funcionar")
    void testDevolverUltimoElemento(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("c", buscador.devolverUltimoElemento(list), "DevolverUltimoElemento funciona");
    }
    @Test
    @DisplayName("DevolverUltimoElemento debería funcionar")
    void testDevolverUltimoElementoNull(){
        assertEquals(null, buscador.devolverUltimoElemento(null), "DevolverUltimoElemento funciona");
    }
}
