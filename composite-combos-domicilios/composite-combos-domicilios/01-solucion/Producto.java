// Paso 2: la HOJA.
public class Producto implements ItemMenu {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int contarProductos() {
        return 1;
    }

    public void imprimir(String sangria) {
        System.out.printf("%-36s %10s%n", sangria + nombre, Formato.pesos(precio));
    }
}
