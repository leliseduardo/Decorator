package Decorator;

public class SensorTemperaturaAlta extends SensorDecorator{

    public SensorTemperaturaAlta(Sensor sensor){
        super(sensor);
    }

    public float getScale(){
        return 0.0001f;
    }

    public String getTypeSensor(){
        return "para altas temperaturas";
    }
}
