import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
class BuscadorTestCase{

    private Buscador buscador;
    @BeforeEach
    void setUp(){
        buscador = new Buscador();
    }
    @Test
    @DisplayName("buscar frase que esta en la lista")
    void testBuscarFraseExistente(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("ghdufgnd");
        lista.add("frerweozñ");
        lista.add("si");
        assertTrue(buscador.buscarFrase("hola", lista));
        System.out.println(buscador.buscarFrase("hola",lista));
    }
    @Test
    @DisplayName("buscar frase que no esta en la lista")
    void testBuscarFraseNoExistente(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("ghdufgnd");
        lista.add("frerweozñ");
        lista.add("si");
        assertFalse(buscador.buscarFrase("no", lista));
        System.out.println(buscador.buscarFrase("no",lista));
    }
    @Test
    @DisplayName("buscar una palabra que esta en la lista")
    void testBuscarPalabraExistente(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("ghdufgnd");
        lista.add("frerweozñ");
        lista.add("si");
        assertTrue(buscador.buscarPalabra("hola", lista));
        System.out.println(buscador.buscarPalabra("hola",lista));
    }
    @Test
    @DisplayName("buscar una palabra que no esta en la lista")
    void testBuscarPalabraNoExistente(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("ghdufgnd");
        lista.add("frerweozñ");
        lista.add("si");
        assertFalse(buscador.buscarPalabra("no", lista));
        System.out.println(buscador.buscarPalabra("no",lista));
    }
    @Test
    @DisplayName("devolver una palabra de la lista indicando la posicion")
    void testDevolverPalabra(){
        List<String> lista = new ArrayList<>();
        lista.add("hdffigkhd");
        lista.add("rsighr");
        lista.add("hola");
        lista.add("si");
        assertEquals("hola",buscador.devolverPalabra(lista,2));
        System.out.println(buscador.devolverPalabra(lista, 2));
    }
    @Test
    @DisplayName("devuelve el primer elemento de una lista")
    void testDevolverPrimerElemento(){
        List<String> lista = new ArrayList<>();
        lista.add("hdffigkhd");
        lista.add("rsighr");
        lista.add("hola");
        lista.add("si");
        assertEquals("hdffigkhd",buscador.devolverPrimerElemento(lista));
        System.out.println(buscador.devolverPrimerElemento(lista));
    }
    @Test
    @DisplayName("devolver el ultimo elemento de una lista")
    void testDevolverUltimoElemento(){
        List<String> lista = new ArrayList<>();
        lista.add("hdffigkhd");
        lista.add("rsighr");
        lista.add("hola");
        assertEquals("hola",buscador.devolverUltimoElemento(lista));
        System.out.println(buscador.devolverUltimoElemento(lista));
    }
}