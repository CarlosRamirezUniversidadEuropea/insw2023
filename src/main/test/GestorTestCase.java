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
        Producto producto = new Producto("Pasta", 2, 36);
        try {
            assertEquals(true, gestor.añadirProducto(producto), "añadir producto funciona de manera correcta");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Añadir producto null funciona")
    void testAddProductoNull(){

        try{
            assertEquals(false, gestor.añadirProducto(null));
        }

        catch(Exception e){
            throw new RuntimeException(e);}
    }
    @Test
    @DisplayName("Añadir producto funciona")
    void testAddProductoCant(){
        Producto producto = new Producto("galletas", 10,24);
        try{
            assertEquals(false, gestor.añadirProducto(null));
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Añadir producto nulo funciona")
    void testAddProductoNameNull(){
        Producto producto = new Producto(null, 12,21);

        try{
            assertEquals(false, gestor.añadirProducto(producto), "añadir producto nulo funciona");
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Añadir producto repetido funciona")
    void testAddProductoRepe(){
        try{
            gestor.añadirProducto(new Producto("tomate", 5, 7));
            assertEquals(true, gestor.añadirProducto(new Producto("tomate", 5, 7)), "añadir un producto repetido funciona");
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    @DisplayName("Quitar producto funciona")
    void testQuitarXProducto(){
        try{
            Producto producto = new Producto("Pan", 1, 2);
            Producto producto1 = new Producto("Refresco", 3, 24);
            Producto producto2 = new Producto("Cereales", 8, 3);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        assertEquals(true, gestor.quitarXProducto(new Producto("Agua", 1, 32), 4));
    }
    @Test
    @DisplayName("Quitar producto funciona")
    void testQuitarXProductoNull(){
        try{
            Producto producto = new Producto("Pan", 1, 2);
            Producto producto1 = new Producto("Refresco", 3, 24);
            Producto producto2 = new Producto("Cereales", 8, 3);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(null, 4));
    }
    @Test
    @DisplayName("Quitar producto nulo funciona")
    void testQuitarXProducto2Null(){
        try{
            Producto producto = new Producto("Pan", 1, 2);
            Producto producto1 = new Producto("Refresco", 3, 24);
            Producto producto2 = new Producto("Cereales", 8, 3);
            gestor.añadirProducto(producto);
            gestor.añadirProducto(producto1);
            gestor.añadirProducto(producto2);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        assertEquals(false, gestor.quitarXProducto(new Producto(null, 4,9),4));
    }

}