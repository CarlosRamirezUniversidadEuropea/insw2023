import AlmacenProductos.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTestCase {
    @Test
    void crearProductoCorrectamente() {
        Producto producto = new Producto("Camiseta", 20.0, 100);
        assertNotNull(producto);
    }

    @Test
    void obtenerNombreDelProducto() {
        Producto producto = new Producto("Zapatos", 25.5, 50);
        assertEquals("Zapatos", producto.getNombre());
    }

    @Test
    void obtenerPrecioDelProducto() {
        Producto producto = new Producto("Zapatos", 25.5, 50);
        assertEquals(25.5, producto.getPrecio(), 0.001);
    }

    @Test
    void obtenerCantidadDelProducto() {
        Producto producto = new Producto("Zapatos", 25.5, 50);
        assertEquals(50, producto.getCantidad());
    }

    @Test
    void añadirCantidadAlProducto() {
        Producto producto = new Producto("Camiseta", 20.0, 30);
        producto.añadirCantidad(20);
        assertEquals(50, producto.getCantidad());
    }
}


