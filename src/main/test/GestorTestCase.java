import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTestCase {

    Gestor gestor;
    Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Kinder Bueno", 1.00, 10);
        gestor = new Gestor();
    }


    @Test
    public void testGetNombre() {
        assertEquals("Kinder Bueno", producto.getNombre());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(1.00, producto.getPrecio());
    }

    @Test
    public void testGetCantidad() {
        assertEquals(10, producto.getCantidad());
    }

    @Test
    public void testAñadirCantidad() {
        producto.añadirCantidad(5);
        assertEquals(15, producto.getCantidad());
    }

    @Test
    public void testAñadirProducto() throws Exception {
        Producto producto1 = new Producto("Producto1", 1.00, 2);
        Producto producto2 = new Producto("Producto2", 3.00, 1);
        Producto producto3 = null;

        assertTrue(gestor.añadirProducto(producto1));
        assertTrue(gestor.añadirProducto(producto2));
        assertFalse(gestor.añadirProducto(producto3)); // Comprobar que no se puede añadir un producto nulo
    }

    @Test
    public void testQuitarXProducto() {
        Producto producto1 = new Producto("Producto1", 1.00, 2);
        Producto producto2 = new Producto("Producto2", 3.00, 1);

        assertDoesNotThrow(() -> {
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        });

        assertTrue(gestor.quitarXProducto(producto1, 50));
        assertFalse(gestor.quitarXProducto(producto1, 150)); // Intentar quitar más cantidad de la existente
    }

    @Test
    public void testGetAlmacen() {
        Producto producto1 = new Producto("Producto1", 1.00, 2);
        Producto producto2 = new Producto("Producto2", 3.00, 1);

        assertDoesNotThrow(() -> {
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        });

        ArrayList<Producto> almacen = gestor.getAlmacen();
        assertEquals(2, almacen.size());
        assertTrue(almacen.contains(producto1));
        assertTrue(almacen.contains(producto2));
    }

    @Test
    public void testGetCantidadTotal() throws Exception {
        Producto producto1 = new Producto("Producto1", 1.00, 2);
        Producto producto2 = new Producto("Producto2", 3.00, 1);

        gestor.añadirProducto(producto1);
        gestor.añadirProducto(producto2);

        assertEquals(3, gestor.getCantidadTotal());
    }


}
