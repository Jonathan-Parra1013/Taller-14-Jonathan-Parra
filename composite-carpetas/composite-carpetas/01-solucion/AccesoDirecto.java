// Requisito nuevo resuelto: una hoja mas. Carpeta no se modifico.
public class AccesoDirecto implements Elemento {
    private String destino;

    public AccesoDirecto(String destino) {
        this.destino = destino;
    }

    public String getNombre() {
        return "-> " + destino;
    }

    public int getTamanoKB() {
        return 1;
    }

    public void mostrar(String sangria) {
        System.out.println(sangria + getNombre() + " 1 KB");
    }
}
