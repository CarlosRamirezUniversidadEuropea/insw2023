import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTestCase {
    Producto producto;

    @Test
    @DisplayName("getCantidadTotal debería funcionar")
    void testAñadirCantidad(){
        Producto nocilla = new Producto("nocilla",1.5,1 );
        nocilla.añadirCantidad(2);
        assertEquals ( 3, nocilla.getCantidad(), "añadirCantidad debería funcionar");
    }
    @Test
    @DisplayName("getCantidadTotal debería funcionar")
    void testAñadirCantidadNegative(){
        Producto nocilla = new Producto("nocilla",1.5,2 );
        nocilla.añadirCantidad(-3);
        assertEquals ( 2, nocilla.getCantidad(), "añadirCantidad debería funcionar");
    }
}
