import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTestCase {
    Gestor gestor;
    @BeforeEach
    void begin(){
        gestor = new Gestor();
    }
    @Test
    @DisplayName("Anadir producto debería funcionar")
    void testAnadirProducto(){
        Producto producto = new Producto("a", 5, 3);
        try {
            assertEquals(true, gestor.añadirProducto(producto), "añadir producto funciona");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Anadir producto funciona frente a null")
    void testAnadirProductoNull(){
        try {
            assertEquals(false, gestor.añadirProducto(null), "añadir producto funciona");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Anadir producto debería funcionar")
    void testAnadirProductoNegativo(){
        Producto producto = new Producto("a", -5, 3);
        try {
            assertEquals(false, gestor.añadirProducto(producto), "añadir producto funciona");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Anadir producto debería funcionar")
    void testAnadirProductoCantidad(){
        Producto producto = new Producto("a", 10, 400);
        try {
            assertEquals(false, gestor.añadirProducto(producto), "añadir producto funciona");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Anadir producto debería funcionar")
    void testAnadirProductoNombreNull(){
        Producto producto = new Producto(null, 10, 3);
        try {
            assertEquals(false, gestor.añadirProducto(producto), "añadir producto funciona");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Anadir producto debería funcionar")
    void testAnadirProductoRepetido(){
        try {
            gestor.añadirProducto(new Producto("A", 10, 5));
            assertEquals(true, gestor.añadirProducto(new Producto("A", 10, 5)), "añadir producto funciona");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("QuitarProducto debería funcionar")
    void testQuitarProducto(){
        try {
            Producto producto = new Producto("A", 4, 5);
            Producto producto1 = new Producto("B", 4, 5);
            Producto producto2 = new Producto("C", 4, 5);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(true, gestor.quitarXProducto(new Producto("B", 4, 5), 3));
    }
    @Test
    @DisplayName("QuitarProducto debería funcionar")
    void testQuitarProductoNull(){
        try {
            Producto producto = new Producto("A", 4, 5);
            Producto producto1 = new Producto("B", 4, 5);
            Producto producto2 = new Producto("C", 4, 5);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(null, 3));
    }
    @Test
    @DisplayName("QuitarProducto debería funcionar")
    void testQuitarProductoNull2(){
        try {
            Producto producto = new Producto("A", 4, 5);
            Producto producto1 = new Producto("B", 4, 5);
            Producto producto2 = new Producto("C", 4, 5);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(new Producto(null, 4, 5), 3));
    }
    @Test
    @DisplayName("QuitarProducto debería funcionar")
    void testQuitarProductoNegativo(){
        try {
            Producto producto = new Producto("A", 4, 5);
            Producto producto1 = new Producto("B", 4, 5);
            Producto producto2 = new Producto("C", 4, 5);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(new Producto("B", 4, 5), -3));
    }
    @Test
    @DisplayName("QuitarProducto debería funcionar")
    void testQuitarProductoNegativo2(){
        try {
            Producto producto = new Producto("A", 4, 5);
            Producto producto1 = new Producto("B", 4, -3);
            Producto producto2 = new Producto("C", 4, 5);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(new Producto("B", 4, -3), -3));
    }
}
