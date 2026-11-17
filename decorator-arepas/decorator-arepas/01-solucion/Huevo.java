public class Huevo extends Adicion {
    public Huevo(Arepa arepa) {
        super(arepa);
    }

    public String descripcion() {
        return arepa.descripcion() + " + huevo";
    }

    public double precio() {
        return arepa.precio() + 2000;
    }
}
