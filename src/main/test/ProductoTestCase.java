import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTestCase {

  Producto prod;


  @BeforeEach
  void setUp() {
    prod = new Producto("test", 1, 2);
  }

  @Test
  @DisplayName("crear un producto correcto")
  void testCrearProducto() {
    try {
      new Producto("manzanas",1,2);
      return;
    }catch (Exception e){
      fail("se produjo una excepcion");
    }
  }

    @Test
    @DisplayName("crear un producto con nombre null")
    void testCrearProductoNombreNull() {
      try {
        new Producto(null, 1, 2);
        fail("no se produjo una excepcion");
      }catch (Exception e){
        return;
      }
    }

    @Test
    @DisplayName("crear un producto con precio invalido")
    void testCrearProductoPrecioInvalido() {
      try {
        new Producto("test", -1, 2);
        fail("no se produjo una excepcion");
      }catch (Exception e){
        return;
      }
    }

    @Test
    @DisplayName("crear un producto con cantidad invalida")
    void testCrearProductoCantidadInvalida() {
      try {
        new Producto("test", 1, -2);
        fail("no se produjo una excepcion");
      }catch (Exception e){
        return;
      }
    }

    @Test
    @DisplayName("añadir una cantidad correcta de producto")
    void testAñadirCantidadProducto() {
      try {
        prod.añadirCantidad(1);
        assertEquals(3, prod.getCantidad());
      }catch (Exception e){
        fail("se produjo una excepcion");
      }
    }

    @Test
    @DisplayName("añadir una cantidad negativa de producto")
    void testAñadirCantidadProductoNegativa() {
      try {
        prod.añadirCantidad(-1);
        fail("se permitió añadir una cantidad negativa");
      }catch (Exception e){
        return;
      }
    }

    

}