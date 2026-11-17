// Paso 4: una capa = una responsabilidad.
public class ConFirma extends DecoradorCanal {
    private static final String FIRMA = " | Facultad de Ingenieria U. Libre";

    public ConFirma(Canal envuelto) {
        super(envuelto);
    }

    public void enviar(String destinatario, String mensaje) {
        envuelto.enviar(destinatario, mensaje + FIRMA);
    }
}
