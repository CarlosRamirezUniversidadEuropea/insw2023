import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



 class GestorTestCase {

     Gestor gestor;

        GestorTestCase() {
        }

        @BeforeEach
     void setUp() {
         this.gestor = new Gestor();
     }

     @Test
     @DisplayName("Products should be added correctly")
     void addProducto(){
         Producto producto = new Producto("Laptops", 10, 20);
         try {
             assertEquals(true, gestor.añadirProducto(producto), "Product added correctly");
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
     }

     @Test
     @DisplayName("Removing products should work correctly")
     void removeProduct(){
         try {
             Producto producto = new Producto("manzana", 10, 4);
             Producto producto1 = new Producto("pera", 10, 4);
             Producto producto2 = new Producto("platano", 10, 4);
             gestor.añadirProducto(producto);
             gestor.añadirProducto(producto1);
             gestor.añadirProducto(producto2);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
         assertEquals(true, gestor.quitarXProducto(new Producto("manzna", 10, 9), 8));
     }

     @Test
     @DisplayName("Removing products should work correctly")
     void removingNegativeProduct(){
         try {
             Producto producto = new Producto("Pollo", 10, 7);
             Producto producto1 = new Producto("Queso", 3, -9);
             Producto producto2 = new Producto("Palta", 4, 9);
             gestor.añadirProducto(producto);
             gestor.añadirProducto(producto1);
             gestor.añadirProducto(producto2);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
         assertEquals(false, gestor.quitarXProducto(new Producto("manzana", 4, -5), -9));
     }

     @Test
     @DisplayName("Removing products should work correctly")
     void testRemoveNullProduct(){
         try {
             Producto producto = new Producto("Platano", 9, 8);
             Producto producto2 = new Producto("Kiwi", 10, 7);
             gestor.añadirProducto(producto);
             gestor.añadirProducto(producto2);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
         assertEquals(false, gestor.quitarXProducto(null, 3));
     }

}
