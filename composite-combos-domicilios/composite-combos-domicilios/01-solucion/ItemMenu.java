// Paso 1: todo lo que se puede pedir es un ItemMenu, sea un producto o un combo.
public interface ItemMenu {
    String getNombre();
    double getPrecio();
    int contarProductos();
    void imprimir(String sangria);
}
