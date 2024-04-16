package Decorator;

public abstract class SensorDecorator implements Sensor {

    private Sensor sensor;
    private String structure;

    public SensorDecorator(Sensor sensor){
        this.sensor = sensor;
    }

    public Sensor getSensor(){
        return sensor;
    }
    public void setSensor(Sensor sensor){
        this.sensor = sensor;
    }

    public abstract float getScale();

    public float getReading(){
        return this.sensor.getReading() * this.getScale();
    }

    public abstract String getTypeSensor();

    public String getStructure(){
        return structure;
    }

}
