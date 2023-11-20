import AlmacenProductos.Producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTestCase {

    Producto leche;

    @BeforeEach
    public void setUp(){
        leche = new Producto("Leche", 0.80, 5);
    }

    @Test
    @DisplayName("Get nombre")
    public void testGetNombre(){
        assertEquals("Leche", leche.getNombre(), "El nombre debería ser Leche");
    }

    @Test
    @DisplayName("Get precio")
    public void testGetPrecio(){
        assertEquals(0.80, leche.getPrecio(), "El precio debería ser 0.80");
    }

    @Test
    @DisplayName("Get cantidad")
    public void testGetCantidad(){
        assertEquals(5, leche.getCantidad(), "La cantidad debería ser 5");
    }

    @Test
    @DisplayName("Añadir cantidad 1")
    public void testAñadirCantidad1(){
        leche.añadirCantidad(5);
        assertEquals(10, leche.getCantidad(), "La cantidad debería ser 10");
    }

    @Test
    @DisplayName("Añadir cantidad 2")
    public void testAñadirCantidad2(){
        leche.añadirCantidad(-1);
        assertEquals(5, leche.getCantidad(), "La cantidad debería mantenerse en 5 porque no se puede añadir una cantidad negativa");
    }

}
