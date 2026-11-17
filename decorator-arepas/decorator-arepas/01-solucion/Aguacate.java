// Requisito nuevo resuelto: UNA clase, no ocho.
public class Aguacate extends Adicion {
    public Aguacate(Arepa arepa) {
        super(arepa);
    }

    public String descripcion() {
        return arepa.descripcion() + " + aguacate";
    }

    public double precio() {
        return arepa.precio() + 3000;
    }
}
