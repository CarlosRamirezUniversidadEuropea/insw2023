import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlmacenTestCase {
    Gestor gestor = new Gestor();
    Producto producto = new Producto("e", 4, 9);

    @Test
    @DisplayName("getCantidad should work")
    void comprobarProductoCantidad() throws Exception {
        assertEquals(9, producto.getCantidad(), "getCantidad deberia funcionar");
    }

    @Test
    @DisplayName("getNombre should work")
    void comprobarProductoNombre() throws Exception {
        assertEquals("e", producto.getNombre(), "getNombre deberia funcionar");
    }

    @Test
    @DisplayName("getPrecio should work")
    void comprobarProductoPrecio() throws Exception {
        assertEquals(4, producto.getPrecio(), "getPrecio deberia funcionar");
    }
    @Test
    @DisplayName("añadirCantidad should work")
    void comprobarañadirCantidad() throws Exception {
        producto.añadirCantidad(1);
        assertEquals(10, producto.getCantidad(), "AñadirCantidad deberia funcionar");
    }

    @Test
    @DisplayName("añadirProducto should work")
    void añadirProductoNull() throws Exception {
        assertEquals(false, gestor.añadirProducto(null), "Producto añadido");

    }

    @Test
    @DisplayName("añadirProducto should work")
    void añadirProducto2() throws Exception {
        Producto p = new Producto("p", 4, 3);
        assertEquals(true, gestor.añadirProducto(p), "Producto añadido");
    }

    @Test
    @DisplayName("añadirProducto should work")
    void añadirProducto3() throws Exception {
        Producto q = new Producto("q", 4, 3);
        assertEquals(true, gestor.añadirProducto(q), "Producto añadido");
    }

    @Test
    @DisplayName("quitarXProducto should work")
    void quitarXProducto() throws Exception {
        Producto p = new Producto("p", 4, 3);
        gestor.añadirProducto(p);
        assertEquals(true, gestor.quitarXProducto(p,1), "Producto quitado");
    }

    @Test
    @DisplayName("getAlmacen should work")
    void getAlmacen() throws Exception {
        Producto u = new Producto("u", 4, 300);
        gestor.añadirProducto(u);
        assertEquals(gestor.getAlmacen().size(), 1, "getAlmacen deberia funcionar");
    }

    @Test
    @DisplayName("getCantidadTotal should work")
    void getCantidadTotal() throws Exception {
        Producto u = new Producto("u", 4, 33);
        gestor.añadirProducto(u);
        assertEquals(gestor.getCantidadTotal(), 33, "getCantidadTotal deberia funcionar");
    }

    }
