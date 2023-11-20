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
    List<String> list ;
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

        assertEquals(true, buscador.buscarFrase("c", list), "BuscarFrase debería funcionar");
    }
    @Test
    @DisplayName("buscarFrase debería funcionar")
    void testBuscarFraseNull(){

        assertEquals(false, buscador.buscarFrase(null, list), "BuscarFraseNull debería funcionar");
    }
    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabra(){

        assertEquals(true, buscador.buscarPalabra("b", list), "BuscadorPalabra debería funcionar");
    }

    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabraNull(){

        assertEquals(false, buscador.buscarPalabra(null, list), "BuscadorPalabra debería funcionar");
    }
    @Test
    @DisplayName("buscarPalabra debería funcionar")
    void testBuscarPalabraNull2(){

        assertEquals(false, buscador.buscarPalabra("hola", null), "BuscadorPalabra debería funcionar");
    }
    @Test
    @DisplayName("devolverPalabra debería funcionar")
    void testdevolverPalabra() throws Exception {

        assertEquals("a",buscador.devolverPalabra(list,0),"devolverPrimerElemento debería funcionar ");
    }

    @Test
    @DisplayName("devolverPalabra debería funcionar")
    void testdevolverPalabraNegative() {

        assertEquals(null,buscador.devolverPalabra(list,-1),"devolverPrimerElemento debería funcionar ");
    }
    @Test
    @DisplayName("devolverPalabra debería funcionar")
    void testdevolverPalabraMas(){

        assertEquals(null,buscador.devolverPalabra(list,3),"devolverPrimerElemento debería funcionar ");
    }
    @Test
    @DisplayName("devolverPrimerElemento debería funcionar")
    void testdevolverPrimerElemento(){

        assertEquals("a",buscador.devolverPrimerElemento(list),"devolverPrimerElemento debería funcionar ");
    }

   @Test
    @DisplayName("devolverUltimoElemento debería de funcionar")
    void testDevolverUltimoElemento(){

       assertEquals("c",buscador.devolverUltimoElemento(list),"devolverUltimoElemento debería funcionar ");
    }
}


