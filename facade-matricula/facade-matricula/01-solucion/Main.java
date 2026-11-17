public class Main {
    public static void main(String[] args) {
        // Paso 4: los servicios se crean una vez y se entregan a la fachada
        MatriculaFacade matricula = new MatriculaFacade(
                new ServicioEstudiantes(), new ServicioFinanciero(), new ServicioCupos(),
                new ServicioHorarios(), new ServicioNotificaciones());

        PortalWeb portal = new PortalWeb(matricula);
        AppMovil app = new AppMovil(matricula);

        portal.matricular("20261001", "Programacion I");    // Laura
        app.matricular("20261002", "Programacion I");       // Andres, con deuda
        portal.matricular("20261002", "Programacion I");    // Andres otra vez, por el portal
        app.matricular("20261003", "Calculo Integral");     // Camila, inactiva
        portal.matricular("20261001", "Bases de Datos");    // Laura, cruce de horario
        app.matricular("20261004", "Calculo Integral");     // Mateo, sin cupos

        System.out.println("Cupos que quedan en Programacion I: " + matricula.cuposDisponibles("Programacion I"));
    }
}
