import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import AlmacenProductos.Producto;

class ProductoTestCase{
    Producto producto;
    @BeforeEach
    void setUp() {
        producto = new Producto("Producto1",20,200);
    }
    @Test
    @DisplayName("Prueba de obtener nombre del producto")
    void testObtenerNombre() {
        assertEquals("Producto1", producto.getNombre());
    }

    @Test
    @DisplayName("Prueba de obtener precio del producto")
    void testObtenerPrecio() {
        assertEquals(20, producto.getPrecio());
    }

    @Test
    @DisplayName("Prueba de obtener cantidad del producto")
    void testObtenerCantidad() {
        assertEquals(200, producto.getCantidad());
    }

    @Test
    @DisplayName("Prueba de añadir cantidad al producto")
    void testAñadirCantidad() {
        producto.añadirCantidad(50);
        assertEquals(250, producto.getCantidad());
    }
}