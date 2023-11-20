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

    List<String> list;
    @BeforeEach
    void setUp(){
        buscador = new Buscador();
        list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

    }
    @Test
    @DisplayName("buscarFrase debería funcionar")
    void testBuscarFrase(){

        assertEquals(true, buscador.buscarFrase("c", list), "BuscarFrase tiene que funcionar bien");
    }
    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabra(){

        assertEquals(true, buscador.buscarPalabra("b", list), "BuscadorPalabra tiene que funcionar bien");
    }

    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabraNull(){

        assertEquals(false, buscador.buscarPalabra(null, list), "BuscadorPalabra tiene que funcionar bien");
    }
    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabraNull2(){

        assertEquals(false, buscador.buscarPalabra("hola", null), "BuscadorPalabra tiene que funcionar bien");
    }
    @Test
    @DisplayName("devolverPalabra tiene que funcionar bien")
    void testdevolverPalabra(){

    }
    @Test
    @DisplayName("devolverPrimerElemento tiene que funcionar bien")
    void testdevolverPrimerElemento(){

    }
    @Test
    @DisplayName("devolverUltimoElemento tiene que funcionar bien")
    void testDevolverUltimoElemento(){
        assertEquals("c",buscador.devolverUltimoElemento(list),"devolverUltimoElemento tiene que funcionar bien");
    }
}