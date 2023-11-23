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
    @DisplayName("test should add a positive number of products")
    void testAñadirCantidadPositiva() {
        producto.añadirCantidad(3);
        assertEquals(8, producto.getCantidad());
    }

    @Test
    @DisplayName("Should add 0 test should work")
    void testAñadirCantidadCero() {
        producto.añadirCantidad(0);
        assertEquals(5, producto.getCantidad());
    }

    @Test
    @DisplayName("Add a negative number should work")
    void testAñadirCantidadNegativa() {
        producto.añadirCantidad(-2);
        assertEquals(3, producto.getCantidad());
    }

    @Test
    @DisplayName("Add a product should work")
    void testAñadirProductoExitoso() {
        try {
            assertTrue(gestor.añadirProducto(producto));
            assertTrue(gestor.getAlmacen().contains(producto));
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Add null product should work")
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
    @DisplayName("Add more than allowed should work")
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
    @DisplayName("Eliminate elements should work")
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
    @DisplayName("Eliminate product with null name or quantity 0 should work")
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
    @DisplayName("Eliminate more product than there is")
    void TestQuitarXProductos_MasDeLoQueHay() {
        Producto producto = new Producto("p1", 10.8, 6);
        Producto producto1 = new Producto("p2", 9.3, 20);
        try {
            assertTrue(gestor.añadirProducto(producto));
            assertTrue(gestor.añadirProducto(producto1));
            assertTrue(gestor.quitarXProducto(producto, 30));

        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(0, gestor.getCantidadTotal());
        assertEquals(1, gestor.getAlmacen().size());
        assertEquals(0, gestor.getAlmacen().get(0).getCantidad());
    }


}


