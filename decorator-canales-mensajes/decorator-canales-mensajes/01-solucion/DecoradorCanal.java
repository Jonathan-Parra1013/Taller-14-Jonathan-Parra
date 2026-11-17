// Paso 3: el decorador base. ES un Canal y TIENE el Canal que envuelve.
public abstract class DecoradorCanal implements Canal {
    protected Canal envuelto;

    public DecoradorCanal(Canal envuelto) {
        this.envuelto = envuelto;
    }

    // Por defecto solo pasa el mensaje; cada hijo cambia lo que necesite.
    public void enviar(String destinatario, String mensaje) {
        envuelto.enviar(destinatario, mensaje);
    }
}
