package Decorator;

public class SensorTemperaturaAgua extends SensorDecorator{

    public SensorTemperaturaAgua(Sensor sensor){
        super(sensor);
    }

    public float getScale(){
        return 0.01f;
    }

    public String getTypeSensor(){
        return "para água";
    }
}
