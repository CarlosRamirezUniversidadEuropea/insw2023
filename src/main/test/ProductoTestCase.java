import AlmacenProductos.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductoTestCase {
    private Producto producto;
    @BeforeEach
    void setUp(){
        producto = new Producto("leche",2,3);

    }
    @Test
    @DisplayName("comprobar si devuelve el nombre del producto")
    void ObtenerNombre(){
        assertEquals("leche", producto.getNombre());
    }
    @Test
    @DisplayName("comprobar si devuelve el precio del producto")
    void ObtenerPrecio(){
        assertEquals(2, producto.getPrecio());
    }
    @Test
    @DisplayName("comprobar si devuelve la cantidad del producto")
    void ObtenerCantidad(){
        assertEquals(3, producto.getCantidad());
    }
    @Test
    @DisplayName("comprobar si añade la cantidad correctamente al producto")
    void DespuesDeAnadir(){
        producto.añadirCantidad(4);
        assertEquals(3+4, producto.getCantidad());
    }
}
