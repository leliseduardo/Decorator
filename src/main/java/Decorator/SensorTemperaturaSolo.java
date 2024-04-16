package Decorator;

public class SensorTemperaturaSolo extends SensorDecorator {

    public SensorTemperaturaSolo(Sensor sensor){
        super(sensor);
    }

    public float getScale(){
        return 0.1f;
    }

    public String getTypeSensor(){
        return "para solo";
    }
}
