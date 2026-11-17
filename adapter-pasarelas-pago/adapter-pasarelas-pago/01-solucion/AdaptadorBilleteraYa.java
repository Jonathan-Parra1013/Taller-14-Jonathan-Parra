// Paso 1: adaptador para la billetera digital.
// Traduce: pesos -> centavos, codigos numericos -> ResultadoPago.
public class AdaptadorBilleteraYa implements ProcesadorPago {
    private BilleteraYaApi api;
    private String celular;

    public AdaptadorBilleteraYa(BilleteraYaApi api, String celular) {
        this.api = api;
        this.celular = celular;
    }

    public String nombre() {
        return "BilleteraYa";
    }

    public ResultadoPago pagar(String referencia, double montoCOP) {
        long centavos = Math.round(montoCOP * 100);
        int codigo = api.enviarCobro(celular, centavos);
        if (codigo == 200) {
            return new ResultadoPago(true, api.ultimoIdTransaccion(), "Aprobado");
        } else if (codigo == 402) {
            return new ResultadoPago(false, "BY-402", "Saldo insuficiente");
        }
        return new ResultadoPago(false, "BY-" + codigo, "Celular no registrado");
    }
}
