// Paso 1: el adaptador IMPLEMENTA la interfaz que la estacion espera...
public class AdaptadorSensorImportado implements SensorTemperatura {
    // Paso 2: ...y TIENE adentro el objeto que no encaja.
    private SensorImportado sensor;

    public AdaptadorSensorImportado(SensorImportado sensor) {
        this.sensor = sensor;
    }

    // Paso 3: cada metodo traduce la llamada al idioma del proveedor.
    public String getNombre() {
        return "Importado " + sensor.getModelo();
    }

    public double leerCelsius() {
        return (sensor.readFahrenheit() - 32) * 5 / 9;
    }
}
