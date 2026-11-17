import java.util.ArrayList;
import java.util.List;

// Paso 3: el COMPUESTO. Es un ItemMenu y tiene ItemMenu adentro (productos u otros combos).
public class Combo implements ItemMenu {
    private String nombre;
    private double descuento; // 0.10 = 10 %
    private List<ItemMenu> items = new ArrayList<>();

    public Combo(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public void agregar(ItemMenu item) {
        items.add(item);
    }

    public String getNombre() {
        return nombre;
    }

    // Paso 4: cada operacion es un solo ciclo que delega. Cero instanceof.
    public double getPrecio() {
        double suma = 0;
        for (ItemMenu item : items) {
            suma += item.getPrecio();
        }
        return suma * (1 - descuento);
    }

    public int contarProductos() {
        int total = 0;
        for (ItemMenu item : items) {
            total += item.contarProductos();   // la recursion cuenta bien los anidados
        }
        return total;
    }

    public void imprimir(String sangria) {
        String titulo = sangria + nombre + " (-" + Math.round(descuento * 100) + "%)";
        System.out.printf("%-36s %10s%n", titulo, Formato.pesos(getPrecio()));
        for (ItemMenu item : items) {
            item.imprimir(sangria + "   ");
        }
    }
}
