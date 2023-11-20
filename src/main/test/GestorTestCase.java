import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GestorTestCase {
    Gestor gestor;
    @Test
    void añadirProductoAlAlmacenCorrectamente() throws Exception {
        Gestor gestor = new Gestor();
        Producto producto = new Producto("ordenador", 500, 5);
        assertEquals(true,gestor.añadirProducto(producto));
    }

    @Test
    void intentarAñadirProductoNulo() throws Exception {
        Gestor gestor = new Gestor();
        assertEquals(false,gestor.añadirProducto(null));
    }

    @Test
    void intentarAñadirProductoExcediendoCantidadMaxima() throws Exception {
        Gestor gestor = new Gestor();
        Producto producto = new Producto("Teléfono", 500.0, 30001);
        assertEquals(false,gestor.añadirProducto(producto));
    }

    @Test
    void intentarAñadirProductoConCantidadMayorA250() throws Exception {
        Gestor gestor = new Gestor();
        Producto producto = new Producto("Tablet", 300.0, 300);
        assertEquals(false,gestor.añadirProducto(producto));
    }

    @Test
    void quitarCantidadDeProductoDelAlmacen() throws Exception {
        try{
            Gestor gestor = new Gestor();
            Producto producto = new Producto("Camisa", 25.0, 10);
            gestor.añadirProducto(producto);
            assertTrue(gestor.quitarXProducto(producto, 3));
            assertEquals(7, gestor.getAlmacen().get(0).getCantidad());
        } catch (Exception e){
            throw e;
        }

    }

    @Test
    void intentarQuitarCantidadDeProductoInexistente() {
        Gestor gestor = new Gestor();
        Producto producto = new Producto("Zapatos", 30.0, 15);
        assertEquals(true, gestor.quitarXProducto(producto, 2));
    }

    @Test
    void obtenerListaDeProductosEnElAlmacen() throws Exception {
        Gestor gestor = new Gestor();
        Producto producto1 = new Producto("Silla", 50.0, 8);
        Producto producto2 = new Producto("Mesa", 120.0, 5);
        gestor.añadirProducto(producto1);
        gestor.añadirProducto(producto2);
        ArrayList<Producto> listaEsperada = new ArrayList<>();
        listaEsperada.add(producto1);
        listaEsperada.add(producto2);
        assertEquals(listaEsperada, gestor.getAlmacen());
    }

    @Test
    void obtenerCantidadTotalEnElAlmacen() throws Exception {
        Gestor gestor = new Gestor();
        Producto producto1 = new Producto("Lámpara", 25.0, 12);
        Producto producto2 = new Producto("Espejo", 40.0, 8);
        gestor.añadirProducto(producto1);
        gestor.añadirProducto(producto2);
        assertEquals(20, gestor.getCantidadTotal());
    }
}

