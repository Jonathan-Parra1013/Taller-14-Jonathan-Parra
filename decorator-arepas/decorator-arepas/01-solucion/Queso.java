// Paso 4: cada adicion delega en la arepa envuelta y le suma lo suyo.
public class Queso extends Adicion {
    public Queso(Arepa arepa) {
        super(arepa);
    }

    public String descripcion() {
        return arepa.descripcion() + " + queso";
    }

    public double precio() {
        return arepa.precio() + 2500;
    }
}
