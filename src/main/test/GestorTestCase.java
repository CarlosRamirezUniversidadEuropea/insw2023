
import AlmacenProductos.Producto;
import AlmacenProductos.Gestor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTestCase {
    private Gestor gestor;
    @BeforeEach
    void setUp(){
        gestor = new Gestor();
    }
    //añadir producto, quitar producto
    @Test
    @DisplayName("comprobar si añade el producto de manera correcta")
    void ComprobarAnadir() throws Exception {
        Producto m = new Producto("manzana", 1,1);
        Producto p = new Producto("platano", 2,3);
        Producto l = new Producto("limon", 3,5);
        gestor.añadirProducto(m);
        gestor.añadirProducto(p);
        gestor.añadirProducto(l);
        assertEquals(true,gestor.añadirProducto(m));
    }
    @Test
    @DisplayName("comrpobar que devuelve false en caso de que la cantidad se exceda")
    void AnadirElementoAlmacenLleno_() throws Exception {
        Producto producto = new Producto("manzana",1,40000);
        gestor.añadirProducto(producto);
        assertEquals(false,gestor.añadirProducto(producto));
    }
    @Test
    @DisplayName("comrpobar que devuelve false en caso de que el producto sea nulo")
    void AnadirElementoVacio_() throws Exception {
        assertFalse(gestor.añadirProducto(null));
    }
    @Test
    @DisplayName("comprobar si elimina el producto de manera correcta")
    void ComprobarEliminar(){
        Producto m = new Producto("manzana", 1,1);
        gestor.quitarXProducto(m,1);
        assertEquals(0,m.getCantidad());
    }
    @Test
    @DisplayName("comprobar si devuelve la cantidad que contiene el almacen")
    void ObtenerCantidad() throws Exception {
        Producto m = new Producto("manzana", 1,1);
        Producto p = new Producto("platano", 2,3);
        gestor.añadirProducto(m);
        gestor.añadirProducto(p);
        assertEquals(4, gestor.getCantidadTotal());
    }
    @Test
    @DisplayName("comprobar si el almacen contiene los productos añadidos")
    void ObtenerAlmacen() throws Exception {
        Producto m = new Producto("manzana", 1,1);
        Producto p = new Producto("platano", 2,3);
        gestor.añadirProducto(m);
        gestor.añadirProducto(p);
        assertTrue(gestor.getAlmacen().contains(m));
        assertTrue(gestor.getAlmacen().contains(p));

    }
}
