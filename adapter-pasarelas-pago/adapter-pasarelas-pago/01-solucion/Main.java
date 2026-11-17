public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        BilleteraYaApi billetera = new BilleteraYaApi();
        GlobalPayClient globalPay = new GlobalPayClient();

        // Paso 4: cada cliente elige su medio; el checkout recibe un ProcesadorPago
        ProcesadorPago tarjeta = new PagoTarjetaLocal();
        ProcesadorPago billeteraDeLuis = new AdaptadorBilleteraYa(billetera, "3104567890");
        ProcesadorPago globalDeAna = new AdaptadorGlobalPay(globalPay, "ana@correo.com", 4000);

        checkout.procesar("PED-001", 180000, tarjeta);
        checkout.procesar("PED-002", 95000, billeteraDeLuis);
        checkout.procesar("PED-003", 650000, billeteraDeLuis);
        checkout.procesar("PED-004", 320000, globalDeAna);
        checkout.procesar("PED-005", 520000, globalDeAna);
        // checkout.procesar("PED-006", 70000, "GLOBAL_PAY");  // ya NO compila: el error se ve antes de ejecutar
    }
}
