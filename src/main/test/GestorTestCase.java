import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import com.ue.insw.proyecto.exercises.ej8pruebas.Buscador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class GestorTestCase {

    Gestor gestor;
    Producto producto;
    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        producto = new Producto("PatitoDeGoma", 4.99, 20);
    }
/**

    @Test
    @DisplayName("añadirProducto deberia funcionar")
    void testAñadirProducto(){
        assert (true, gestor.añadirProducto(producto), "añadirProducto deberia funcionar");
    }*/

}
