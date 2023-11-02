public class Directivo extends Empleado {
    private String categoria;

    public Directivo(String nombre, String apellido, String dni, String categoria) {
        super(nombre, apellido, dni);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Categoría: " + categoria);
    }
}