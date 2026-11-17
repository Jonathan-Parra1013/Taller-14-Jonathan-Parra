// Paso 2: adaptador para la pasarela internacional.
// Traduce: pesos -> dolares, excepcion -> ResultadoPago rechazado.
public class AdaptadorGlobalPay implements ProcesadorPago {
    private GlobalPayClient cliente;
    private String correo;
    private double tasaCopPorUsd;

    public AdaptadorGlobalPay(GlobalPayClient cliente, String correo, double tasaCopPorUsd) {
        this.cliente = cliente;
        this.correo = correo;
        this.tasaCopPorUsd = tasaCopPorUsd;
    }

    public String nombre() {
        return "GlobalPay";
    }

    public ResultadoPago pagar(String referencia, double montoCOP) {
        double dolares = montoCOP / tasaCopPorUsd;
        try {
            String id = cliente.charge(correo, dolares);
            return new ResultadoPago(true, id, "Aprobado");
        } catch (GlobalPayException e) {
            return new ResultadoPago(false, e.getErrorCode(),
                    "Rechazado por la pasarela");
        }
    }
}
