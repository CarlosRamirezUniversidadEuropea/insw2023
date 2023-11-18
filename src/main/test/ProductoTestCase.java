import AlmacenProductos.Producto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductoTestCase {

    Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Coca-Cola", 1.5, 2);
    }

    @Test
    @DisplayName("Ensuring that it can add a quantity to the product")
    void testAniadirCantidad() {
        producto.añadirCantidad(2);
        assertEquals(4, producto.getCantidad() ,
                "it can add a quantity to the product");
    }

    @Test
    @DisplayName("Ensuring that it can add a quantity to the product although it is a negative quantity")
    void testAniadirCantidad2() {
        producto.añadirCantidad(-2);
        assertEquals(0, producto.getCantidad() ,
                "it can add a quantity to the product although it is a negative quantity");
    }

}
