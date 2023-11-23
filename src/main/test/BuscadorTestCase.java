import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuscadorTestCase {
    
    Buscador buscador;

    @BeforeEach
    public void setUp(){
        buscador = new Buscador();
    }

    @Test
    @DisplayName("Buscar frase 1")
    public void testBuscarFrase(){
        assertTrue(buscador.buscarFrase("Hola Mundo Qué tal", new ArrayList<String>(){{
            add("Hola Mundo Qué tal");}}),
            "La frase debería ser encontrada en la lista");
    }

    // No encuentra la frase porque busca la frase entera como un elemento de la lista
    // Después de corregir el código, encuentra la frase a la segunda iteración
    @Test
    @DisplayName("Buscar frase 2")
    public void testBuscarFrase2(){
        assertTrue(buscador.buscarFrase("Hola Mundo Qué tal", new ArrayList<String>(){{
            add("Hola");
            add("Mundo");
            add("Qué");
            add("tal");}}),
            "La frase debería ser encontrada en la lista");
    }

    // Probando con espacios, sigue dando error
    // Después de corregir el código, funciona
    @Test
    @DisplayName("Buscar frase 3")
    public void testBuscarFrase3(){
        assertTrue(buscador.buscarFrase("Hola Mundo Qué tal", new ArrayList<String>(){{
            add("Hola ");
            add("Mundo ");
            add("Qué ");
            add("tal");}}),
            "La frase debería ser encontrada en la lista");
    }

    // La encuentra si se tiene la frase entera
    @Test
    @DisplayName("Buscar frase 4")
    public void testBuscarFrase4(){
        assertTrue(buscador.buscarFrase("Hola Mundo Qué tal", new ArrayList<String>(){{
            add("Hola Mundo Qué tal");
            add("Mundo");
            add("Qué");
            add("tal");}}),
            "La frase debería ser encontrada en la lista");
    }

    @Test
    @DisplayName("Buscar palabra")
    public void testBuscarPalabra(){
        assertTrue(buscador.buscarPalabra("Hola", new ArrayList<String>(){{
            add("Hola");
            add("Mundo");
            add("Qué");
            add("tal");}}),
            "La palabra debería ser encontrada en la lista");
    }

    @Test
    @DisplayName("Devolver palabra")
    public void testDevolverPalabra(){
        assertEquals("Mundo", buscador.devolverPalabra(new ArrayList<String>(){{
            add("Hola");
            add("Mundo");
            add("Qué");
            add("tal");}}, 
            1),
                "La palabra debería ser encontrada en la posición 1");
    }

    @Test
    @DisplayName("Devolver primer elemento")
    public void testDevolverPrimerElemento(){
        assertEquals("Hola", buscador.devolverPrimerElemento(new ArrayList<String>(){{
            add("Hola");
            add("Mundo");
            add("Qué");
            add("tal");}}),
                "La palabra debería ser encontrada en la primera posición");
    }

    // Da error porque comprueba la posición igual a la longitud de la lista (IndexOutOfBoundsException)
    // Después de corregir el código, funciona
    @Test
    @DisplayName("Devolver ultimo elemento")
    public void testDevolverUltimoElemento(){
        assertEquals("tal", buscador.devolverUltimoElemento(new ArrayList<String>(){{
            add("Hola");
            add("Mundo");
            add("Qué");
            add("tal");}}),
                "La palabra debería ser encontrada en la última posición");
    }

}
