import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GestorTestCase {
    Gestor gestor;

    @BeforeEach
    void setUp(){
        gestor = new Gestor();

    }

    @Test
    @DisplayName("añadirProducto debería funcionar")
    void testAñadirProducto() throws Exception {
        Producto nocilla = new Producto("nocilla",1.5,1 );
        assertEquals(true, gestor.añadirProducto (nocilla), "añadirProducto debería funcionar");
    }
    @Test
    @DisplayName("añadirProducto debería funcionar")
    void testAñadirProductoNegativo() throws Exception {
        Producto nocilla = new Producto("nocilla",1.5,-1 );
        assertEquals(false, gestor.añadirProducto (nocilla), "añadirProducto debería funcionar");
    }
    @Test
    @DisplayName("añadirProducto debería funcionar")
    void testAñadirProductoNull() throws Exception {

        assertEquals(false, gestor.añadirProducto (null), "añadirProducto debería funcionar");
    }
    @Test
    @DisplayName("añadirProducto debería funcionar")
    void testAñadirProductoNombreNull() throws Exception {
        Producto nocilla = new Producto(null,1.5,-1 );
        assertEquals(false, gestor.añadirProducto (nocilla), "añadirProducto debería funcionar");
    }


    @Test
    @DisplayName("quitarXProducto debería funcionar")
    void testQuitarXProducto() throws Exception {

        Producto nocilla = new Producto("nocilla",1.5,1 );
        gestor.añadirProducto(nocilla);
        assertEquals(true, gestor.quitarXProducto(nocilla,1 ), "quitarXProducto debería funcionar");
    }
    @Test
    @DisplayName("quitarXProducto debería funcionar")
    void testQuitarXProductoMasCantidad() throws Exception {

        Producto nocilla = new Producto("nocilla",1.5,1 );
        gestor.añadirProducto(nocilla);
        assertEquals(false, gestor.quitarXProducto(nocilla,2), "quitarXProducto debería funcionar");
    }
    @Test
    @DisplayName("quitarXProducto debería funcionar")
    void testQuitarXProductoNoEsta() throws Exception {

        Producto pan = new Producto("pan",1.5,1 );
        Producto nocilla = new Producto("nocilla",1.5,1 );
        gestor.añadirProducto(nocilla);
        assertEquals(false, gestor.quitarXProducto(pan,2 ), "quitarXProducto debería funcionar");
    }
    @Test
    @DisplayName("quitarXProducto debería funcionar")
    void testQuitarXProductoNombreNull() throws Exception {

        Producto pan = new Producto(null,1.5,2 );
        gestor.añadirProducto(pan);
        assertEquals(false, gestor.quitarXProducto(pan,2 ), "quitarXProducto debería funcionar");
    }
    @Test
    @DisplayName("quitarXProducto debería funcionar")
    void testQuitarXProductoNull() throws Exception {

        assertFalse(gestor.quitarXProducto(null, 2), "quitarXProducto debería funcionar");
    }
    @Test
    @DisplayName("getAlmacen debería funcionar")
    void testGetAlmacen() throws Exception {
        Producto nocilla = new Producto("nocilla",1.5,1 );
        gestor.añadirProducto(nocilla);
        assertEquals( gestor.getAlmacen().size(),1, "getAlmacen debería funcionar");
    }

    @Test
    @DisplayName("getCantidadTotal debería funcionar")
    void testGetCantidadTotal() throws Exception {
        Producto nocilla = new Producto("nocilla",1.5,1 );
        gestor.añadirProducto(nocilla);
        assertEquals(2, gestor.getCantidadTotal(), "getCantidadTotal debería funcionar");
    }


}
