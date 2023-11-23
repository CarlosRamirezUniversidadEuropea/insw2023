import static org.junit.jupiter.api.Assertions.*;

import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import AlmacenProductos.Gestor;

class GestorTestCase{
    Gestor gestor;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
    }

    @Test
    @DisplayName("Prueba de añadir producto válido")
    void testAñadirProductoValido() throws Exception {
        Producto producto = new Producto("Producto1", 100,200);
        assertTrue(gestor.añadirProducto(producto));
    }

    @Test
    @DisplayName("Prueba de añadir producto nulo")
    void testAñadirProductoNulo() throws Exception {
        assertFalse(gestor.añadirProducto(null));
    }

    @Test
    @DisplayName("Prueba de añadir producto excediendo cantidad total")
    void testAñadirProductoExcediendoCantidadTotal() throws Exception {
        Producto producto = new Producto("Producto2", 30000,2000);
        assertFalse(gestor.añadirProducto(producto));
    }

    @Test
    @DisplayName("Prueba de añadir producto con cantidad excesiva")
    void testAñadirProductoCantidadExcesiva() throws Exception {
        Producto producto = new Producto("Producto3", 300,200);
        assertFalse(gestor.añadirProducto(producto));
    }

    @Test
    @DisplayName("Prueba de quitar X producto")
    void testQuitarXProducto() throws Exception {
        Producto producto = new Producto("Producto4", 100,200);
        assertTrue(gestor.añadirProducto(producto));
        assertTrue(gestor.quitarXProducto(producto, 200));
    }

}
