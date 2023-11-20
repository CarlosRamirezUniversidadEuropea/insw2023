
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class BuscadorTestCase {
    private Buscador buscador;
    @BeforeEach
    void setUp(){
        buscador = new Buscador();
    }
    @DisplayName("Buscar la frase existente en la lista")
    void testBuscarFrase(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("mundo");
        lista.add("chau");
        lista.add("idk");
        assertTrue(buscador.buscarFrase("hola", lista));
        System.out.println(buscador.buscarFrase("hola",lista));
    }
    @Test
    @DisplayName("Buscar la frase que no esta en la lista")
    void testBuscarFraseNoExistente(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("mundo");
        lista.add("chau");
        lista.add("idk");
        assertFalse(buscador.buscarFrase("ola", lista));
        System.out.println(buscador.buscarFrase("ola",lista));
    }
    @Test
    @DisplayName("Buscar la palabra que esta en la lista")
    void testBuscarPalabra(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("mundo");
        lista.add("chau");
        lista.add("idk");
        assertTrue(buscador.buscarPalabra("hola", lista));
        System.out.println(buscador.buscarPalabra("hola",lista));
    }
    @Test
    @DisplayName("Buscar la palabra que no esta en la lista")
    void testBuscarPalabraNoExistente(){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("mundo");
        lista.add("chau");
        lista.add("idk");
        assertFalse(buscador.buscarPalabra("ola", lista));
        System.out.println(buscador.buscarPalabra("ola",lista));
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
    @DisplayName("Devuelve el primer elemento de una lista")
    void testDevolverPrimerElemento(){
        List<String> lista = new ArrayList<>();
        lista.add("mundo");
        lista.add("hola");
        lista.add("idk");
        lista.add("chau");
        assertEquals("mundo",buscador.devolverPrimerElemento(lista));
        System.out.println(buscador.devolverPrimerElemento(lista));
    }
    @Test
    @DisplayName("Devuelve el ultimo elemento de una lista")
    void testDevolverUltimoElemento(){
        List<String> lista = new ArrayList<>();
        lista.add("mundo");
        lista.add("hola");
        lista.add("idk");
        lista.add("chau");
        assertEquals("mundo",buscador.devolverUltimoElemento(lista));
        System.out.println(buscador.devolverUltimoElemento(lista));
    }
}


