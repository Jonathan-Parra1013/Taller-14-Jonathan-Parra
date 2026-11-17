public class AdaptadorSensorImportado implements SensorTemperatura {
    private SensorImportado sensorImportado;

    public AdaptadorSensorImportado(SensorImportado sensorImportado) {
        this.sensorImportado = sensorImportado;
    }

    @Override
    public String getNombre() {
        return "Importado " + sensorImportado.getModelo();
    }

    @Override
    public double leerCelsius() {
        return (sensorImportado.readFahrenheit() - 32.0) * 5.0 / 9.0;
    }
}