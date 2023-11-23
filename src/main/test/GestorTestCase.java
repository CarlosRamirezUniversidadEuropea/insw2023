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
    @DisplayName("Añadir productos correctamente")
    void agregarProducto(){
        Producto producto = new Producto("Computadores", 700, 20);
        try {
            assertEquals(true, gestor.añadirProducto(producto), "Producto agregado.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Añadir producto nulo ")
    void agregarProductoNull(){
        Producto producto = new Producto(null, 20,5);

        try{
            assertEquals(false, gestor.añadirProducto(producto), "añadir producto nulo funciona");
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Añadir producto repetido correctamente")
    void añadirProductoRepetido(){
        try{
            gestor.añadirProducto(new Producto("palta", 5, 7));
            assertEquals(true, gestor.añadirProducto(new Producto("palta", 8, 7)), "producto repetido funciona");
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }

    @Test
    @DisplayName("Eliminación de productos debería funcionar correctamente.")
    void eliminarProducto(){
        try {
            Producto producto = new Producto("mandarina", 3, 8);
            Producto producto1 = new Producto("durazno", 4, 5);
            Producto producto2 = new Producto("platano", 2, 6);
            Producto producto3 = new Producto("chirimoya", 5, 4);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
            gestor.añadirProducto(producto3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(true, gestor.quitarXProducto(new Producto("piña", 8, 2), 1));
    }

    @Test
    @DisplayName("La eliminación de productos debería funcionar correctamente.")
    void eliminarProductoNegativo(){
        try {
            Producto producto = new Producto("jamon", 10, 10);
            Producto producto1 = new Producto("palta", 6, -6);
            Producto producto2 = new Producto("sandia", 10, 10);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto (new Producto("manzana", 5,-9),-10));
    }

    @Test
    @DisplayName("Eliminar producto null correctamente")
    void eliminarProductoNull(){
        try {
            Producto producto = new Producto("aji", 2, 10);
            Producto producto2 = new Producto("papaya", 15, 5);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(null, 2));
    }

}