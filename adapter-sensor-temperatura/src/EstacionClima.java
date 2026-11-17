import java.util.ArrayList;
import java.util.List;

public class EstacionClima {
    private List<SensorTemperatura> sensores = new ArrayList<>();

    public void agregar(SensorTemperatura sensor) {
        sensores.add(sensor);
    }

    public void reporte() {
        if (sensores.isEmpty()) {
            System.out.println("No hay sensores registrados.");
            return;
        }

        double suma = 0;
        for (SensorTemperatura s : sensores) {
            double temp = s.leerCelsius();
            System.out.printf("%-18s %5.1f C%n", s.getNombre(), temp);
            suma += temp;
        }
        System.out.printf("Promedio:          %5.1f C%n", suma / sensores.size());
    }
}