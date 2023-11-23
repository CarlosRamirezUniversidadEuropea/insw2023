import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class AlmacenTestCase {
    Gestor gestor = new Gestor();
    ArrayList<Producto> almacen = new ArrayList<Producto>();
    Producto producto;

    /**
     * Pruebas para Gestor
     */
    @Test
    @DisplayName("añadirProducto should work")
    void añadirProducto() throws Exception {
        Producto leche = new Producto("Leche pascual", 3, 100);
        assertEquals(true, gestor.añadirProducto(leche), "Producto añadido correctamente");
    }

    @Test
    @DisplayName("añadirProducto should work")
    void añadirProductoNull() throws Exception {
        assertEquals(false, gestor.añadirProducto(null), "Producto no añadido");
    }

    @Test
    @DisplayName("añadirProducto should work")
    void añadirProductoExcedido() throws Exception {
        Producto pelotasPadel = new Producto("Head padel pro balls", 8, 251);
        assertEquals(false, gestor.añadirProducto(pelotasPadel), "Producto no añadido");
    }

    @Test
    @DisplayName("quitarXProducto should work")
    void quitarXProducto() throws Exception {
        //Aquí encontramos un error en la clase gestor, pues el parámetro
        Producto cajas = new Producto("Cajas tamaño medio", 2, 150);
        gestor.añadirProducto(cajas);
        assertEquals(true, gestor.quitarXProducto(cajas, 50), "Eliminado correctamente");
    }
    @Test
    @DisplayName("quitarXProducto should work")
    //En este caso, salta otro error, puesto que necesitaríamos otro condicional que nos devolviese false cuando se le mete un null.
    void quitarXProductoNull(){
        assertEquals(false,null, "Producto no eliminado");
    }
    @Test
    @DisplayName("getAlmacen should work")
    void getAlmacen() throws Exception{
        Producto cajas = new Producto("Cajas tamaño grande", 3, 200);
        gestor.añadirProducto(cajas);
        assertEquals(gestor.getAlmacen().size(),1, "Almacen obtenido correctamente");
    }
    @Test
    @DisplayName("getCantidadTotal should work")
    void getCantidadTotal() throws Exception{
        Producto cajas = new Producto("Cajas tamaño pequeño", 1.5, 175);
        gestor.añadirProducto(cajas);
        assertEquals(gestor.getCantidadTotal(), 175, "Cantidad total obtenida correctamente");
    }

    /**
     * Pruebas para producto
     */
    @Test
    @DisplayName("getNombre should work")
    void getNombre(){
        Producto product = new Producto("Aquarius", 1.50, 3);
        assertEquals("Aquarius", product.getNombre(), "Nombre obtenido perfectamente");
    }
    @Test
    @DisplayName("getNombre should work")
    //Aquí observamos lo mismo, al no tener esto bien configurado en la clase Producto, es imposible que la prueba salga bien.
    void getNombreNull(){
        Producto product = new Producto("Aquarius", 1.50, 3);
        assertEquals("Aquarius", null, "Nombre obtenido perfectamente");
    }
    @Test
    @DisplayName("getPrecio should work")
    void getPrecio(){
        Producto product = new Producto("Aquarius", 1.50, 3);
        assertEquals(1.50, product.getPrecio(), "Precio obtenido perfectamente");
    }
    @Test
    @DisplayName("getCantidad should work")
    void getCantidad(){
        Producto product = new Producto("Aquarius", 1.50, 3);
        assertEquals(3, product.getCantidad(), "Precio obtenido perfectamente");
    }@Test
    @DisplayName("getCantidad should work")
    void getCantidadNull(){
        Producto product = null;
        assertEquals(3, product.getCantidad(), "Precio no obtenido");
    }
    @Test
    @DisplayName("añadirCantidad should work")
    void añadirCantidad(){
        Producto product = new Producto("Aquarius", 1.50, 3);
        product.añadirCantidad(3);
        assertEquals(6,product.getCantidad(),"Añadido Correctamente");
    }
    @Test
    @DisplayName("añadirCantidad should work")
    //En este ejemplo pasa igual, al no tener ese caso en
    void añadirCantidadNegativo(){
        Producto product = new Producto("Aquarius", 1.50, 3);
        product.añadirCantidad(-3);
        assertEquals(6,product.getCantidad(),"Producto no añadido");
    }
}
