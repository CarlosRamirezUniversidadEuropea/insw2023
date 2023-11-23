import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GestorTestCase {
    Gestor gestor;
    Producto producto;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        producto = new Producto("Pegamento", 1, 1);
    }

    @Test
    @DisplayName("añadir producto null")
    void testAñadirProductoNull() throws Exception {
        assertFalse(gestor.añadirProducto(null), "El producto no puede ser null");
    }

    @Test
    @DisplayName("añadir producto que supera o iguala el limite del almacen (30000)")
    void testAñadirProductoMaxAlmacen() {
        assertFalse(producto.getCantidad() + gestor.getCantidadTotal() >= 30000,
                "Se ha alcanzado el limite del almacen");
    }

    @Test
    @DisplayName("añadir una cantidad de producto superior a 250")
    void testAñadirProductoMaxCantProducto(){
        assertFalse(producto.getCantidad() > 250, "Demasiada cantidad de producto");
    }

    @Test
    @DisplayName("añadir una producto")
    void añadirProductoExitoso() throws Exception {
        assertTrue(gestor.añadirProducto(producto));
        assertTrue(gestor.getAlmacen().contains(producto));
    }

    @Test
    @DisplayName("quitar una producto valido")
    void testQuitarXProducto() {
        assertTrue(gestor.quitarXProducto(producto, 1));
    }

    @Test
    @DisplayName("quitar una producto null")
    void testQuitarXProductoNull() {
        assertFalse(gestor.quitarXProducto(null, 1), "El producto no puede ser null");
    }

    @Test
    @DisplayName("quitar una cantidad de producto negativa")
    void testQuitarXProductoCantNegativa() {
        assertFalse(gestor.quitarXProducto(producto, -1),
                "La centidad del producto no puede ser negativa");
    }
}
