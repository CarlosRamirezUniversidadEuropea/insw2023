import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscadorTestCase {

    Buscador buscador = new Buscador();

    @Test
    @DisplayName("BuscarFrase should work")
    void testBuscarFrase(){
        List<String> listFrases = new ArrayList<String>();
        listFrases.add("hola");
        listFrases.add("que");
        listFrases.add("tal");
        listFrases.add("me");
        listFrases.add("llamo");
        listFrases.add("Diego");
        assertEquals(false,buscador.buscarFrase("me",listFrases),"Frase econtrada");
    }
    @Test
    @DisplayName("BuscarFrase should work")
    void testBuscarFraseNull(){
        List<String> listFrases = new ArrayList<String>();
        listFrases.add("hola");
        listFrases.add("que");
        listFrases.add("tal");
        listFrases.add("me");
        listFrases.add("llamo");
        listFrases.add("Diego");
        assertEquals(false,buscador.buscarFrase(null,listFrases),"Frase econtrada");
    }
    @Test
    @DisplayName("BuscarFrase should work")
    void testBuscarFraseListaNull(){
        assertEquals(false,buscador.buscarFrase("me",null),"Frase econtrada");
    }

    @Test
    @DisplayName("BuscarPalabra should work")
    void testBuscarPalabra(){
        List<String> listPalabras = new ArrayList<String>();
        listPalabras.add("a");
        listPalabras.add("b");
        listPalabras.add("c");
        listPalabras.add("d");
        assertEquals(true,buscador.buscarPalabra("b", listPalabras),"Palabra encontrada");
    }
    @Test
    @DisplayName("BuscarPalabra should work")
    void testBuscarPalabraNull(){
        List<String> listPalabras = new ArrayList<String>();
        listPalabras.add("a");
        listPalabras.add("b");
        listPalabras.add("c");
        listPalabras.add("d");
        assertEquals(false,buscador.buscarPalabra(null, listPalabras),"Palabra encontrada");
    }
    @Test
    @DisplayName("BuscarPalabra should work")
    void testBuscarPalabraListaNull(){
        assertEquals(false,buscador.buscarPalabra("b", null),"Palabra encontrada");
    }
    @Test
    @DisplayName("DevolverPalabra should work")
    void testDevolverPalabraPosicionNegativa() throws Exception {
        List<String> listPalabras = new ArrayList<String>();
        listPalabras.add("e");
        listPalabras.add("f");
        listPalabras.add("g");
        listPalabras.add("h");
        Exception exception = assertThrows(Exception.class, () -> {
            buscador.devolverPalabra(listPalabras,-50);
        });

        String expectedMessage = "Posicion negativa, eso no es posible";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.equals(expectedMessage));
    }
    @Test
    @DisplayName("devolverPalabra should work")
    void testDevolverPalabraListaExcedida() throws Exception {
        List<String> listPalabras = new ArrayList<String>();
        listPalabras.add("e");
        listPalabras.add("f");
        listPalabras.add("g");
        listPalabras.add("h");
        Exception exception = assertThrows(Exception.class, () -> {
            buscador.devolverPalabra(listPalabras,50);
        });

        String expectedMessage = "Index out of bounds exception";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.equals(expectedMessage));
    }
    @Test
    @DisplayName("devolverPalabra should work")
    void testDevolverPalabra() throws Exception{
        List<String> listP = new ArrayList<String>();
        listP.add("i");
        listP.add("j");
        listP.add("k");
        listP.add("l");
        assertEquals("i", buscador.devolverPalabra(listP,0));
    }
    @Test
    @DisplayName("DevolverPrimerElemento should work")
    void testDevolverPrimerElemento(){
        List<String> listP = new ArrayList<String>();
        listP.add("i");
        listP.add("j");
        listP.add("k");
        listP.add("l");
        assertEquals("i", buscador.devolverPrimerElemento(listP));
    }
    @Test
    @DisplayName("DevolverPrimerElemento should work")
    void testDevolverPrimerElementoNull(){
        assertEquals("NullPointer exception", buscador.devolverPrimerElemento(null));
    }
    @Test
    @DisplayName("DevolverPrimerElemento should work")
    void testDevolverUltimoElemento(){
        List<String> listP = new ArrayList<String>();
        listP.add("i");
        listP.add("j");
        listP.add("k");
        listP.add("l");
        assertEquals("l", buscador.devolverUltimoElemento(listP));
    }
    @Test
    @DisplayName("DevolverPrimerElemento should work")
    void testDevolverUltimoElementoNull(){
        assertEquals("NullPointer exception", buscador.devolverUltimoElemento(null));
    }
}