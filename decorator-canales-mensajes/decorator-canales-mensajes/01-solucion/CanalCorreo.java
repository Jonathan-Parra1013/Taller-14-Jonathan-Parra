// Paso 2: los canales reales quedan simples: solo envian.
public class CanalCorreo implements Canal {
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[CORREO] para " + destinatario + ": " + mensaje);
    }
}
