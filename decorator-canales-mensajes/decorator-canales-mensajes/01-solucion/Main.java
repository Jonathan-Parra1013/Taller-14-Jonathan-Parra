public class Main {
    public static void main(String[] args) {
        // Paso 5: cada necesidad se arma apilando capas. Se leen de afuera hacia adentro.

        // 1. Aviso de notas: registra -> firma -> correo
        Canal correoNotas = new ConRegistro(new ConFirma(new CanalCorreo()));
        correoNotas.enviar("laura@unilibre.edu.co", "Su nota final de POO ya esta publicada");

        // 2. Alerta urgente: registra -> recorta a 40 -> SMS (ahora SI queda registrado)
        Canal smsUrgente = new ConRegistro(new ConLimite(new CanalSMS(), 40));
        smsUrgente.enviar("3104567890", "Clase de manana cancelada por jornada de vacunacion en el campus");

        // 3. Clave temporal: cifra -> firma -> correo (la firma queda legible)
        Canal correoSeguro = new ConCifrado(new ConFirma(new CanalCorreo()));
        correoSeguro.enviar("andres@unilibre.edu.co", "Clave temporal: Bosque2026");

        // 4. Lo que pidio seguridad: firma -> cifra -> correo (la firma tambien va cifrada)
        Canal correoBlindado = new ConFirma(new ConCifrado(new CanalCorreo()));
        correoBlindado.enviar("andres@unilibre.edu.co", "Clave temporal: Bosque2026");
    }
}
