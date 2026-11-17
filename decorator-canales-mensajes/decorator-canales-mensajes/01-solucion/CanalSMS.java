public class CanalSMS implements Canal {
    public void enviar(String celular, String mensaje) {
        System.out.println("[SMS] " + celular + ": " + mensaje);
    }
}
