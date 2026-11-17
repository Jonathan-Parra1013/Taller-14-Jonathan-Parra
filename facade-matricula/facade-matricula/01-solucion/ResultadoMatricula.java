public class ResultadoMatricula {
    private boolean exitosa;
    private String mensaje;

    public ResultadoMatricula(boolean exitosa, String mensaje) {
        this.exitosa = exitosa;
        this.mensaje = mensaje;
    }

    public boolean isExitosa() {
        return exitosa;
    }

    public String getMensaje() {
        return mensaje;
    }
}
