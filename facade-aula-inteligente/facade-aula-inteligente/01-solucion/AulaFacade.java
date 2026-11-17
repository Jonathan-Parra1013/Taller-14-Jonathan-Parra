// Paso 1: la fachada TIENE los cuatro equipos del aula.
public class AulaFacade {
    private Proyector proyector;
    private Sonido sonido;
    private Luces luces;
    private Computador computador;

    public AulaFacade(Proyector proyector, Sonido sonido, Luces luces, Computador computador) {
        this.proyector = proyector;
        this.sonido = sonido;
        this.luces = luces;
        this.computador = computador;
    }

    // Paso 2: un metodo simple que hace los 7 pasos, siempre en el orden correcto
    public void iniciarClase(String presentacion) {
        computador.encender();
        proyector.encender();
        proyector.seleccionarEntrada("HDMI");
        sonido.encender();
        sonido.volumen(30);
        luces.intensidad(40);
        computador.abrirPresentacion(presentacion);
    }

    public void terminarClase() {
        computador.apagar();
        proyector.apagar();
        sonido.apagar();
        luces.intensidad(100);
    }
}
