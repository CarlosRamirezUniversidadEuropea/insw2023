import AlmacenProductos.Producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductoTestCase {
    Producto producto;

    @BeforeEach
    void setup() {
        producto = new Producto("Patatas", 1, 1);
    }

    @Test
    @DisplayName("getName funciona")
    void testGetNombreVacio() {
        assertEquals("Patatas", producto.getNombre(), "El nombre del producto no puede estar vacio");
    }

    @Test
    @DisplayName("getPrecio positivo")
    void testGetPrecioPositivo() {
        assertEquals(1, producto.getPrecio());
    }

    @Test
    @DisplayName("getPrecio negativo")
    void testGetPrecioNegativo() {
        assertTrue(producto.getPrecio() >= 0, "El precio debe ser positivo");
    }

    @Test
    @DisplayName("getCantidad positivo")
    void testGetCantidadPositivo() {
        assertEquals(1, producto.getCantidad());
    }

    @Test
    @DisplayName("getCantidad negativo")
    void testGetCantidadNegativo() {
        assertTrue(producto.getCantidad() >= 0, "La cantidad debe ser positiva");
    }

    @Test
    @DisplayName("Añadir cantidad con numero valido")
    void testAñadirCantidadValida() {
        producto.añadirCantidad(3);
        assertEquals(4, producto.getCantidad());
    }

    @Test
    @DisplayName("Añadir cantidad negativa")
    void testAñadirCantidadNegativa() {
        producto.añadirCantidad(-3);
        assertTrue(producto.getCantidad() >= 0, "No se deberia poder agregar una cantidad negativa");
    }
}
