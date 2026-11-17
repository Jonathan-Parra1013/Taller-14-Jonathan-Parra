// Paso 1: la interfaz comun de todo lo que envia mensajes.
public interface Canal {
    void enviar(String destinatario, String mensaje);
}
