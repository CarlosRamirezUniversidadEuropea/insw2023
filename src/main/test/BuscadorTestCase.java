import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscadorTestCase {
    Buscador buscador;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();
    }

    @Test
    @DisplayName("BuscarFrase debería funcionar")
    void testBuscarFrase() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(true, buscador.buscarFrase("a", list), "BuscarFrase debería funcionar");
    }

    @Test
    @DisplayName("BuscarPalabra debería funcionar")
    void testBuscarPalabra() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(true, buscador.buscarPalabra("b", list), "BuscadorPalabra debería funcionar");
    }
    @Test
    @DisplayName("BuscarPalabra debería funcionar")
    void testBuscarPalabraNull(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(false, buscador.buscarPalabra("z", list), "BuscadorPalabra debería funcionar");
    }

    @Test
    @DisplayName("DevolverPalabra debería funcionar")
    void testDevolverPalabra(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("b", buscador.devolverPalabra(list,1));
    }

    @Test
    @DisplayName("DevolverPrimerElemento debería funcionar")
    void testDevolverPrimerElemento(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", buscador.devolverPrimerElemento(list));
    }

    @Test
    @DisplayName("DevolverUltimoElemento debería funcionar")
    void testDevolverUltimoElemento(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("c", buscador.devolverUltimoElemento(list));
    }

}