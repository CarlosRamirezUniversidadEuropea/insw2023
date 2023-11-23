import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTestCase {

    Gestor gestor;

    GestorTestCase(){

    }
    @BeforeEach
    void setUp(){
        this.gestor = new Gestor();
    }

    @Test
    @DisplayName("Los productos se deben de haber añadido correctamente")
    void testAddProducto(){
        Producto producto = new Producto("Pan", 2, 66);
        try {
            assertEquals(true, gestor.añadirProducto(producto), "Se puede añadir producto correctamente");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Añadir producto null funciona")
    void testAddProductoNull(){

        try{
            assertEquals(false, gestor.añadirProducto(null));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    @Test
    @DisplayName("Añadir producto tiene que funcionar")
    void testAddProductoCant(){
        Producto producto = new Producto("leche", 22,44);
        try{
            assertEquals(false, gestor.añadirProducto(null));
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Añadir producto tiene que funcionar")
    void testAddProductoNameNull(){
        Producto producto = new Producto(null, 22,44);
        try{
            assertEquals(false, gestor.añadirProducto(producto), "meter producto funciona");
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Añadir producto repetido tiene que funcionar")
    void testAddProductoRepe(){
        try{
            gestor.añadirProducto(new Producto("coco", 25, 9));
            assertEquals(true, gestor.añadirProducto(new Producto("coco", 25, 9)), "añadir producto repetido funciona");
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Quitar producto tiene que funcionar")
    void testQuitarXProducto(){
        try{
            Producto producto = new Producto("Queso", 8, 3);
            Producto producto1 = new Producto("Agua", 1, 32);
            Producto producto2 = new Producto("Cereales", 4, 9);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        assertEquals(true, gestor.quitarXProducto(new Producto("Agua", 1, 32), 4));
    }
    @Test
    @DisplayName("Quitar producto tiene que funcionar")
    void testQuitarXProductoNull(){
        try{
            Producto producto = new Producto("Queso", 8, 3);
            Producto producto1 = new Producto("Agua", 1, 32);
            Producto producto2 = new Producto("Cereales", 4, 9);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(null, 4));
    }
    @Test
    @DisplayName("Quitar producto tiene que funcionar")
    void testQuitarXProducto2Null(){
        try{
            Producto producto = new Producto("Queso", 8, 3);
            Producto producto1 = new Producto("Agua", 1, 32);
            Producto producto2 = new Producto("Cereales", 4, 9);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(new Producto(null, 4,9),4));
    }

}
