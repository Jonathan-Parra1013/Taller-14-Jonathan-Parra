// Paso 1: la fachada es el UNICO lugar que conoce los 5 servicios y el orden de las reglas.
public class MatriculaFacade {
    private ServicioEstudiantes estudiantes;
    private ServicioFinanciero financiero;
    private ServicioCupos cupos;
    private ServicioHorarios horarios;
    private ServicioNotificaciones notificaciones;

    public MatriculaFacade(ServicioEstudiantes e, ServicioFinanciero f, ServicioCupos c,
                           ServicioHorarios h, ServicioNotificaciones n) {
        estudiantes = e; financiero = f; cupos = c; horarios = h; notificaciones = n;
    }

    // Paso 2: un solo metodo con todas las reglas, en orden, escrito UNA vez
    public ResultadoMatricula matricular(String codigo, String materia) {
        if (!estudiantes.existe(codigo) || !estudiantes.estaActivo(codigo)) {
            return new ResultadoMatricula(false, "RECHAZADA: estudiante no activo");
        }
        if (financiero.tieneDeuda(codigo)) {
            return new ResultadoMatricula(false, "RECHAZADA: tiene deuda pendiente");
        }
        if (!cupos.hayCupo(materia)) {
            return new ResultadoMatricula(false, "RECHAZADA: sin cupos");
        }
        if (horarios.tieneCruce(codigo, materia)) {
            return new ResultadoMatricula(false, "RECHAZADA: cruce de horario");
        }
        cupos.reservar(materia);
        String recibo = financiero.generarRecibo(codigo, materia);
        notificaciones.enviarConfirmacion(codigo, materia, recibo);
        return new ResultadoMatricula(true, "OK, recibo " + recibo);
    }

    public int cuposDisponibles(String materia) {
        return cupos.disponibles(materia);
    }
}
