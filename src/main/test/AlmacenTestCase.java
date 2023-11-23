import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlmacenTestCase {

    Gestor gestor;
    Producto producto;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        producto = new Producto("Patatas", 2, 50);
    }
// Test de Producto

    @Test
    @DisplayName("getCantidad debería funcionar")
    void comprobarProductoCantidad() throws Exception{
        assertEquals(50,producto.getCantidad(), "getCantidad debería funcionar");
    }
    @Test
    @DisplayName("getNombre debería funcionar")
    void comprobarProductoNombre() throws Exception{
        assertEquals("Patatas",producto.getNombre(), "getNombre debería funcionar");
    }

    @Test
    @DisplayName("getPrecio debería funcionar")
    void comprobarProductoPrecio() throws Exception{
        assertEquals(2,producto.getPrecio(), "getPrecio debería funcionar");
    }

    @Test
    @DisplayName("añadirProductoNull debería funcionar")
    void añadirCantidad() throws Exception{
        producto.añadirCantidad(50);
        assertEquals(100,producto.getCantidad(), "añadirProducto debería funcionar");
    }



// Test de Gestor
    @Test
    @DisplayName("añadirProductoNull debería funcionar")
    void añadirProductoNull() throws Exception{
        assertEquals(false,gestor.añadirProducto(null), "añadirProducto debería funcionar");
    }

    @Test
    @DisplayName("GetAlmacen debería funcionar")
    void testGetAlmacen() throws Exception{
        assertEquals(true ,gestor.getAlmacen(), "GetAlmacen debería funcionar");
    }

    @Test
    @DisplayName("GetCantidadTotal debería funcionar")
    void testGetCantidadTotal() throws Exception{
        assertEquals(0,gestor.getCantidadTotal(), "GetCantidadTotal debería funcionar");
    }

    @Test
    @DisplayName("quitarXProducto debería funcionar")
    void testQuitarXProducto() throws Exception{
        gestor.añadirProducto(producto);
        assertEquals(true, gestor.quitarXProducto(producto,50), "añadirProducto debería funcionar");
    }

}
