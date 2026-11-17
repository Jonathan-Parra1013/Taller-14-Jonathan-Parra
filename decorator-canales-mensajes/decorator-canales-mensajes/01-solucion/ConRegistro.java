public class ConRegistro extends DecoradorCanal {
    private int enviados = 0;

    public ConRegistro(Canal envuelto) {
        super(envuelto);
    }

    public void enviar(String destinatario, String mensaje) {
        enviados++;
        System.out.println("[LOG #" + enviados + "] a " + destinatario + " (" + mensaje.length() + " caracteres)");
        envuelto.enviar(destinatario, mensaje);
    }
}
