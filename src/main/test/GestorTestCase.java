import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorTestCase {

  Gestor gestor;
  Producto prod;


  @BeforeEach
  void setUp() {
    gestor = new Gestor();
    prod = new Producto("test", 1, 2);
  }

  @Test
  @DisplayName("añadir un elemento correcto a la lista")
  void testañadirProducto() {
    try {
    assertEquals(
      true,
      gestor.añadirProducto(prod),
      "añadir un elemento a la lista"
    );
    }catch (Exception e){
      fail("se produjo una excepcion");
    }
  }

  @Test
  @DisplayName("añadir un elemento null a la lista")
  void testañadirProductoNull() {
    try {
      gestor.añadirProducto(null);
      fail("no se produjo una excepcion");
    }catch (Exception e){
      return;
  }
  }

  @Test
  @DisplayName("añadir un elemento con precio invalido a la lista")
  void testañadirProductoPrecioInvalido() {
    try{
    gestor.añadirProducto(new Producto("test", -1, 1));
    fail("no se produjo excepcion");
    }catch (Exception e){
      return;
    }
  }

  @Test
  @DisplayName("añadir un elemento con cantidad invalida a la lista")
  void testañadirProductoCantidadInvalida() {
    try{
    gestor.añadirProducto(new Producto("test", 1, -1));
      fail("no se produjo una excepcion");
    }catch (Exception e){
      return;
    }
  }

  @Test
  @DisplayName("añadir un elemento que supera la cantidad maxima a la lista")
  void testañadirProductoCantidadMaxima() {
    try{
    gestor.añadirProducto(new Producto("test", 1, 1000));
      fail("no se produjo una excepcion");
    }catch (Exception e){
     return;
    }
  }

  @Test
  @DisplayName("añadir un elemento duplicado a la lista")
  void testañadirProductoDuplicado() {
    try {
      gestor.añadirProducto(prod);

      assertEquals(
              true,
              gestor.añadirProducto(prod),
              "añadir un elemento duplicado a la lista"
      );
    }catch (Exception e){
      fail("se produjo una excepcion");
    }
  }

  @Test
  @DisplayName("quitar un elemento de la lista")
  void testQuitarProducto() {
    try{
      gestor.añadirProducto(prod);
      gestor.quitarXProducto(prod, 1);
      return;
    }catch (Exception e){
      fail("se produjo una excepcion");

    }
  }

  @Test
  @DisplayName("quitar un elemento null de la lista")
  void testQuitarProductoNull() {
    try{
      assertEquals(false,
    gestor.quitarXProducto(null,1),"no se pudo quitar");
      fail("no se produjo una excepcion");
    }catch (Exception e){
      return;
    }
  }

  @Test
  @DisplayName("quitar un elemento que no esta en la lista")
  void testQuitarProductoNoEsta() {
    try{
            gestor.quitarXProducto(null,1);
            fail("no se produjo una excepcion");
    }catch (Exception e){
      return;
    }
  }

  @Test
  @DisplayName("quitar más producto del que existe")
  void testQuitarProductoDeMas() {
    try{
    gestor.añadirProducto(prod);
      gestor.quitarXProducto(prod, 300);
      fail("no se produjo una excepcion");
    }catch (Exception e){
      return;
    }
  }
}
