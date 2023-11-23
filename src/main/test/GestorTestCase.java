import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GestorTestCase{

    Gestor gestor;

    @BeforeEach
    public void setUp(){
        gestor = new Gestor();
    }

    @Test
    @DisplayName("Añadir producto 1")
    public void testAñadirProducto1() throws Exception {
        try {
            assertTrue(gestor.añadirProducto(new Producto("Leche", 0.80, 6)), "El producto debería ser añadido");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Añadir producto 2")
    public void testAñadirProducto2() throws Exception {
        try {
            assertFalse(gestor.añadirProducto(new Producto("Leche", 0.80, 348260)), "Al añadir una cantidad tan grande, el producto no debería ser añadido");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Añadir producto 3")
    public void testAñadirProducto3() throws Exception {
        try {
            assertFalse(gestor.añadirProducto(new Producto("Leche", 0.80, -1)), "Al haber menos de 0, el producto no debería ser añadido");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Añadir producto 4")
    public void testAñadirProducto4() throws Exception {
        try {
            try {
                gestor.añadirProducto(new Producto("Leche", 0.80, 6));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            assertTrue(gestor.añadirProducto(new Producto("Leche", 0.80, 6)), "Al haber un producto con el mismo nombre, el producto se añade a la cantidad existente");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Añadir producto 5")
    public void testAñadirProducto5() throws Exception {
        try {
            assertFalse(gestor.añadirProducto(null), "Al ser null, el producto no debería ser añadido");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Quitar producto 1")
    public void testQuitarXProducto1() throws Exception {
        try {
            try {
                gestor.añadirProducto(new Producto("Leche", 0.80, 6));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            assertTrue(gestor.quitarXProducto(new Producto("Leche", 0.80, 0), 5), "El producto debería ser quitado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Quitar producto 2")
    public void testQuitarXProducto2() throws Exception {
        try {
            try {
                gestor.añadirProducto(new Producto("Leche", 0.80, 6));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            assertFalse(gestor.quitarXProducto(new Producto("Leche", 0.80, 0), 7), "Al quitar una cantidad mayor a la existente, el producto no debería ser quitado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Quitar producto 3")
    public void testQuitarXProducto3() throws Exception {
        try {
            try {
                gestor.añadirProducto(new Producto("Leche", 0.80, 6));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            assertFalse(gestor.quitarXProducto(new Producto("Leche", 0.80, 0), -1), "Al quitar una cantidad menor a 0, el producto no debería ser quitado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Get Almacen")
    public void testGetAlmacen() throws Exception {
        try {
            assertNotNull(gestor.getAlmacen(), "El almacen debería ser obtenido");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Get Cantidad Total 1")
    public void testGetCantidadTotal1() throws Exception {
        try {
            try {
                gestor.añadirProducto(new Producto("Leche", 0.80, 6));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            assertNotNull(gestor.getCantidadTotal(), "La cantidad total debería ser obtenida");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Get Cantidad Total 2")
    public void testGetCantidadTotal2() throws Exception {
        try {
            try {
                gestor.añadirProducto(new Producto("Leche", 0.80, 6));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            assertTrue(gestor.getCantidadTotal() == 6, "La cantidad total debería ser 6");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}