import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ElementoSistema {
    private String nombre;
    private List<ElementoSistema> contenido = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoSistema elemento) {
        contenido.add(elemento);
    }

    public void eliminar(ElementoSistema elemento) {
        contenido.remove(elemento);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamanoKB() {
        int total = 0;
        for (ElementoSistema e : contenido) {
            total += e.getTamanoKB();
        }
        return total;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] (" + getTamanoKB() + " KB)");
        for (ElementoSistema e : contenido) {
            e.mostrar(sangria + "   ");
        }
    }
}