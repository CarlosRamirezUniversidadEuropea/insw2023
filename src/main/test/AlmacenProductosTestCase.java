import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import AlmacenProductos.Producto;
import AlmacenProductos.Gestor;


public class AlmacenProductosTestCase {

    Gestor gestor;
    Producto producto;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        producto = new Producto("p1", 10.9, 5);
    }

    @Test
    void testAñadirCantidadPositiva() {
        producto.añadirCantidad(3);
        assertEquals(8, producto.getCantidad());
    }

    @Test
    void testAñadirCantidadCero() {
        producto.añadirCantidad(0);
        assertEquals(5, producto.getCantidad());
    }

    @Test
    void testAñadirCantidadNegativa() {
        producto.añadirCantidad(-2);
        assertEquals(3, producto.getCantidad());
    }

    @Test
    void testAñadirProductoExitoso() {
        try {
            assertTrue(gestor.añadirProducto(producto));
            assertTrue(gestor.getAlmacen().contains(producto));
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    void testAñadirProductoNulo() {
        try {
            assertFalse(gestor.añadirProducto(null));
            assertTrue(gestor.getAlmacen().isEmpty());
            assertEquals(0, gestor.getCantidadTotal());
        } catch (Exception e) {
            fail("Excepcion inesperada" + e.getMessage());
        }
    }

    @Test
    void testAñadirProductoExcedeCantidadTotal() {
        for (int i = 0; i < 3000; i++) {
            Producto producto = new Producto("Producto" + i, 10.0, 1);
            try {
                assertTrue(gestor.añadirProducto(producto));
            } catch (Exception e) {
                fail("Excepción inesperada: " + e.getMessage());
            }
        }

    }

    @Test
    void testQuitarXproductosFunciona(){
        Producto producto = new Producto("Producto2", 10.0, 5);
        Producto producto2 = new Producto("Producto2", 10.0, 5);

        try{
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto2);
            assertTrue(gestor.quitarXProducto(producto, 2));
            assertEquals(10, gestor.getCantidadTotal());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void TestQuitarXProductos_NombreNullYCantidad0(){
        Producto producto  = new Producto(null,10.9,0);
        try{
            if(gestor.getCantidadTotal()>0){
                assertTrue(gestor.quitarXProducto(producto,10));
                assertEquals(0, producto.getCantidad());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void TestQuitarXProductos_MasDeLoQueHay(){
        Producto producto = new Producto("p1", 10.8, 10);
        try {
            if(gestor.quitarXProducto(producto,20)){
                assertTrue(gestor.quitarXProducto(producto, 10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    }


