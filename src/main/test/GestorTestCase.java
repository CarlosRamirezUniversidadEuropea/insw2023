import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GestorTestCase {

    Gestor gestor;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
    }

    // AÑADIR PRODUCTO METHOD
    /*
    Método que añade un nuevo producto en el almacén con las siguientes características del producto:
    - Nombre: se admite cualquier nombre para el producto
    - Precio: debe ser mayor de 0 (no hay un límite máximo) para poder incluirse dentro del almacén
    - Cantidad: el almacén admite de 0 a 300 unidades de un mismo producto
    Si se añade un producto de nombre X y X ya existe en el almacén, se sustituye el producto X
    que había por el nuevo No pueden existir productos repetidos, con el mismo nombre, en el almacén
    */

    @Test
    @DisplayName("Ensuring that the product is added")
    void testAniadirProducto() {
        try {
            assertEquals(true, gestor.añadirProducto(new Producto("Coca-Cola", 1.5, 2)),
                    "the product is added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is added although it already exists because it replaces the old one")
    void testAniadirProducto2() {
        try {
            gestor.añadirProducto(new Producto("Coca-Cola", 1.5, 2));
            assertEquals(true, gestor.añadirProducto(new Producto("Coca-Cola", 1.5, 2)),
                    "the product is added although it already exists because it replaces the old one");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is not added because it is a null product")
    void testAniadirProductoNull() {
        try {
            assertEquals(false, gestor.añadirProducto(null),
                    "the product is not added because it is a null product");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is not added because it has a negative price")
    void testAniadirProductoPrice() {
        try {
            assertEquals(false, gestor.añadirProducto(new Producto("Coca-Cola", -1.5, 2)),
                    "the product is not added because it has a negative price");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is not added because it has a negative quantity")
    void testAniadirProductoQuantity() {
        try {
            assertEquals(false, gestor.añadirProducto(new Producto("Coca-Cola", 1.5, -2)),
                    "the product is not added because it has a negative quantity");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is not added because it has a quantity greater than 300")
    void testAniadirProductoQuantity2() {
        try {
            assertEquals(false, gestor.añadirProducto(new Producto("Coca-Cola", 1.5, 400)),
                    "the product is not added because it has a quantity greater than 300");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // QUITAR X PRODUCTO METHOD
    /*
    Método que quita X unidades del producto indicado
    No podrán existir cantidades de producto negativas
    */

    @Test
    @DisplayName("Ensuring that the product is removed")
    void testQuitarXProducto() {
        try {
            Producto cocacola = new Producto("Coca-Cola", 1.5, 2);
            gestor.añadirProducto(cocacola);
            assertEquals(true, gestor.quitarXProducto(cocacola, 1),
                    "the product is removed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is removed with more than one unit")
    void testQuitarXProducto2() {
        try {
            Producto cocacola = new Producto("Coca-Cola", 1.5, 2);
            Producto fanta = new Producto("Fanta", 1.75, 1);
            gestor.añadirProducto(cocacola);
            gestor.añadirProducto(fanta);
            assertEquals(true, gestor.quitarXProducto(fanta, 1),
                    "the product is removed with more than one unit");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Cases where the method should return false but it returns an exception:
    - The product is null: NullPointerException
    - The product does not exist in the store: org.opentest4j.AssertionFailedError: the product is not removed because it does not exist in the store ==>
    - The quantity is negative: java.lang.RuntimeException: java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
    - The quantity is greater than the quantity of the product in the store: java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
     */

    @Test
    @DisplayName("Ensuring that the product is not removed because it is a null product")
    void testQuitarXProductoNull() {
        try {
            assertEquals(false, gestor.quitarXProducto(null, 1),
                    "the product is not removed because it is a null product");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is not removed because it does not exist in the store")
    void testQuitarXProductoNull2() {
        try {
            assertEquals(false, gestor.quitarXProducto(new Producto("Coca-Cola", 1.5, 2), 1),
                    "the product is not removed because it does not exist in the store");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    @DisplayName("Ensuring that the product is not removed because it has a negative quantity")
    void testQuitarXProductoQuantity() {
        try {
            Producto cocacola = new Producto("Coca-Cola", 1.5, 2);
            gestor.añadirProducto(cocacola);
            assertEquals(false, gestor.quitarXProducto(cocacola, -1),
                    "the product is not removed because it has a negative quantity");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Ensuring that the product is not removed because it has a quantity greater than the quantity of the product in the store")
    void testQuitarXProductoQuantity2() {
        try {
            Producto cocacola = new Producto("Coca-Cola", 1.5, 2);
            gestor.añadirProducto(cocacola);
            assertEquals(false, gestor.quitarXProducto(cocacola, 3),
                    "the product is not removed because it has a quantity greater than the quantity of the product in the store");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
