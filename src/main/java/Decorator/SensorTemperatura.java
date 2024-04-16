package Decorator;

public class SensorTemperatura implements Sensor {

    private float sensorReading;

    public SensorTemperatura() {}
    public SensorTemperatura(float sensorReading){
        this.sensorReading = sensorReading;
    }

    public float getReading() {
        return sensorReading;
    }
    public String getStructure() {
        return "Sensor temperatura";
    }

}
