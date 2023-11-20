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
    /**void quitarXProductoNull(){
     * }
     */
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
}
