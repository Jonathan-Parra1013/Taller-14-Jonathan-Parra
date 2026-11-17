// Paso 3: los clientes solo conocen la fachada.
public class PortalWeb {
    private MatriculaFacade matricula;

    public PortalWeb(MatriculaFacade matricula) {
        this.matricula = matricula;
    }

    public void matricular(String codigo, String materia) {
        ResultadoMatricula r = matricula.matricular(codigo, materia);
        System.out.printf("PORTAL %s  %-16s -> %s%n", codigo, materia, r.getMensaje());
    }
}
