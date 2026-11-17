public class Main {
    public static void main(String[] args) {
        AulaFacade aula = new AulaFacade(new Proyector(), new Sonido(), new Luces(), new Computador());

        // Paso 3: el docente solo conoce dos botones
        System.out.println("== Clase de las 7:00 (POO)");
        aula.iniciarClase("patrones-estructurales.pptx");
        System.out.println("== Fin de clase");
        aula.terminarClase();

        System.out.println("== Clase de las 9:00 (Bases de Datos)");
        aula.iniciarClase("modelo-relacional.pptx");
    }
}
