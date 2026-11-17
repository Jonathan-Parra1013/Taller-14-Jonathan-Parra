// Paso 3: el checkout solo conoce el contrato ProcesadorPago. Ningun if.
public class Checkout {

    public void procesar(String referencia, double montoCOP, ProcesadorPago procesador) {
        ResultadoPago resultado = procesador.pagar(referencia, montoCOP);
        System.out.printf("%-8s %10s  %-13s %s%n",
                referencia, Formato.pesos(montoCOP), procesador.nombre(), resultado);
    }
}
