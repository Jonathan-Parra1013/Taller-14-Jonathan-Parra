// Paso 2: la HOJA. No tiene hijos; responde con su propio dato.
public class Archivo implements Elemento {
    private String nombre;
    private int tamanoKB;

    public Archivo(String nombre, int tamanoKB) {
        this.nombre = nombre;
        this.tamanoKB = tamanoKB;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamanoKB() {
        return tamanoKB;
    }

    public void mostrar(String sangria) {
        System.out.println(sangria + nombre + " " + tamanoKB + " KB");
    }
}
