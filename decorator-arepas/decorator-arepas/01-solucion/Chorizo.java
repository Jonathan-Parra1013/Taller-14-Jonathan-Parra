public class Chorizo extends Adicion {
    public Chorizo(Arepa arepa) {
        super(arepa);
    }

    public String descripcion() {
        return arepa.descripcion() + " + chorizo";
    }

    public double precio() {
        return arepa.precio() + 4000;
    }
}
