public class ConLimite extends DecoradorCanal {
    private int maximo;

    public ConLimite(Canal envuelto, int maximo) {
        super(envuelto);
        this.maximo = maximo;
    }

    public void enviar(String destinatario, String mensaje) {
        if (mensaje.length() > maximo) {
            mensaje = mensaje.substring(0, maximo - 3) + "...";
        }
        envuelto.enviar(destinatario, mensaje);
    }
}
