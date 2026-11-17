import java.util.ArrayList;
import java.util.List;

// Paso 3: el COMPUESTO. Es un Elemento y TIENE Elementos.
public class Carpeta implements Elemento {
    private String nombre;
    private List<Elemento> hijos = new ArrayList<>();   // una sola lista

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Elemento e) {
        hijos.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    // Paso 4: delega en sus hijos, sin preguntar que tipo son
    public int getTamanoKB() {
        int total = 0;
        for (Elemento e : hijos) {
            total += e.getTamanoKB();
        }
        return total;
    }

    public void mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] " + getTamanoKB() + " KB");
        for (Elemento e : hijos) {
            e.mostrar(sangria + "   ");
        }
    }
}
