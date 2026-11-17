// Paso 3: el decorador. ES una Arepa y TIENE la arepa que envuelve.
public abstract class Adicion implements Arepa {
    protected Arepa arepa;

    public Adicion(Arepa arepa) {
        this.arepa = arepa;
    }
}
