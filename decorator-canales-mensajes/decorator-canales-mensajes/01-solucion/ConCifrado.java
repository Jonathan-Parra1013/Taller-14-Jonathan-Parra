// Cifrado Cesar (desplaza cada letra 3 posiciones). Solo para el ejercicio, no es seguro.
public class ConCifrado extends DecoradorCanal {
    public ConCifrado(Canal envuelto) {
        super(envuelto);
    }

    public void enviar(String destinatario, String mensaje) {
        envuelto.enviar(destinatario, cifrarCesar(mensaje));
    }

    private String cifrarCesar(String texto) {
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z') sb.append((char) ('a' + (c - 'a' + 3) % 26));
            else if (c >= 'A' && c <= 'Z') sb.append((char) ('A' + (c - 'A' + 3) % 26));
            else sb.append(c);
        }
        return sb.toString();
    }
}
