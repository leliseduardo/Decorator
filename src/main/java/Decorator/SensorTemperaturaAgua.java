package Decorator;

public class SensorTemperaturaAgua extends SensorDecorator{

    public SensorTemperaturaAgua(Sensor sensor){
        super(sensor);
    }

    public float getScale(){
        return 0.001f;
    }

    public String getTypeSensor(){
        return "para água";
    }
}
