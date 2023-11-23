
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTestCase {
    Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("PatitoDeGoma", 4.99, 20);
    }

    @Test
    @DisplayName("getNombre deberia funcionar")
    void getNombre(){
        assertEquals("PatitoDeGoma", producto.getNombre(), "getNombre deberia funcionar");
    }

    @Test
    @DisplayName("getPrecio deberia funcionar")
    void getPrecio(){
        assertEquals(4.99, producto.getPrecio(), "getPrecio deberia funcionar");
    }

    @Test
    @DisplayName("getCantidad deberia funcionar")
    void getCantidad(){
        assertEquals(20, producto.getCantidad(), "getCantidad deberia funcionar");
    }

    @Test
    @DisplayName("getCantidad deberia funcionar")
    void añadirCantidad(){
        producto.añadirCantidad(30);
        assertEquals(50, producto.getCantidad(), "getCantidad deberia funcionar");
    }

    @Test
    @DisplayName("getCantidad deberia funcionar")
    void añadirCantidadResta(){
        producto.añadirCantidad(-10);
        assertEquals(10, producto.getCantidad(), "getCantidad deberia funcionar");
    }
}
