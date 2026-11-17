import java.util.ArrayList;
import java.util.List;

// Paso 5: el cliente del patron trata igual a productos y combos.
public class Pedido {
    private String cliente;
    private List<ItemMenu> items = new ArrayList<>();

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public void agregar(ItemMenu item) {
        items.add(item);
    }

    public void imprimirRecibo() {
        System.out.println("Pedido de " + cliente);
        System.out.println("----------------------------------------------");
        double total = 0;
        int productos = 0;
        for (ItemMenu item : items) {
            item.imprimir("");
            total += item.getPrecio();
            productos += item.contarProductos();
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-36s %10s%n", "TOTAL (" + productos + " productos)", Formato.pesos(total));
    }
}
