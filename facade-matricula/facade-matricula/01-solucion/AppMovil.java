public class AppMovil {
    private MatriculaFacade matricula;

    public AppMovil(MatriculaFacade matricula) {
        this.matricula = matricula;
    }

    public void matricular(String codigo, String materia) {
        ResultadoMatricula r = matricula.matricular(codigo, materia);
        System.out.printf("APP    %s  %-16s -> %s%n", codigo, materia, r.getMensaje());
    }
}
