import AlmacenProductos.Producto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ProductoTestCase {
    Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Producto1", 10.0, 100);
    }

    @Test
    @DisplayName("Prueba de obtener nombre del producto")
    void testObtenerNombre() {
        assertEquals("Producto1", producto.getNombre());
    }

    @Test
    @DisplayName("Prueba de obtener precio del producto")
    void testObtenerPrecio() {
        assertEquals(10.0, producto.getPrecio());
    }

    @Test
    @DisplayName("Prueba de obtener cantidad del producto")
    void testObtenerCantidad() {
        assertEquals(100, producto.getCantidad());
    }

    @Test
    @DisplayName("Prueba de añadir cantidad al producto")
    void testAñadirCantidad() {
        producto.añadirCantidad(50);
        assertEquals(150, producto.getCantidad());
    }
}