import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GestorTestCase {

    Gestor gestor;
    Producto producto;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        producto = new Producto("PatitoDeGoma", 4.99, 20);
    }

    @Test
    @DisplayName("añadirProducto deberia funcionar")
    void testAñadirProducto() throws Exception {
        assertTrue(gestor.añadirProducto(producto), "añadirProducto deberia funcionar");
    }

    @Test
    @DisplayName("añadirProducto deberia fucnionar")
    void añadirProductoNull() throws Exception {
        producto = null;
        assertFalse(gestor.añadirProducto(producto), "añadirProducto deberia funcionar");
    }

    @Test
    @DisplayName("añadirProducto deberia fucnionar")
    void añadirProductoMuchaCantidad() throws Exception {
        producto.añadirCantidad(3000);
        assertFalse(gestor.añadirProducto(producto), "añadirProducto deberia funcionar");
    }

    @Test
    @DisplayName("añadirProducto deberia fucnionar")
    void añadirProductoNull1() throws Exception {
        producto.añadirCantidad(-20);
        assertTrue(gestor.añadirProducto(producto), "añadirProducto deberia funcionar");
    }

    @Test
    @DisplayName("quitarXProducto deberia fucnionar")
    void quitarXProducto() throws Exception {
        assertTrue(gestor.quitarXProducto(producto, 3), "quitarXProducto deberia funcionar");
    }

    @Test
    @DisplayName("quitarXProducto deberia fucnionar")
    void quitarXProducto3() throws Exception {
        assertFalse(gestor.quitarXProducto(producto, 3000000), "quitarXProducto deberia funcionar");
    }

    @Test
    @DisplayName("quitarXProducto deberia fucnionar")
    void quitarXProducto4() throws Exception {
        assertFalse(gestor.quitarXProducto(null, 1), "quitarXProducto deberia funcionar");
    }

    @Test
    @DisplayName("quitarXProducto deberia fucnionar")
    void quitarXProducto5() throws Exception {
        assertFalse(gestor.quitarXProducto(producto, 0), "quitarXProducto deberia funcionar");
    }

}
