package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {

    @Test
    void shouldReturnSensorReading(){
        Sensor sensor = new SensorTemperatura(70.0f);

        assertEquals(70.0f, sensor.getReading());
    }

    @Test
    void shouldReturnWaterTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaAgua(new SensorTemperatura(700.0f));

        assertEquals(7.0f, sensor.getReading());
    }

    @Test
    void shouldReturnSoilTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaSolo(new SensorTemperatura(700.0f));

        assertEquals(70.0f, sensor.getReading());
    }

    @Test
    void shouldReturnHighTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaAlta(new SensorTemperatura(7000000.0f));

        assertEquals(700.0f, sensor.getReading());
    }

    @Test
    void shouldReturnWaterTemperaturePlusSoilTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaAgua(new SensorTemperaturaSolo(new SensorTemperatura(700.0f)));

        assertEquals(0.7f, sensor.getReading());
    }

    @Test
    void shouldReturnWaterTemperaturePlusHighTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaAgua(new SensorTemperaturaAlta(new SensorTemperatura(7000000000.0f)));

        assertEquals(7000.0f, sensor.getReading());
    }

    @Test
    void shouldReturnSoilTemperaturePlusHighTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaSolo(new SensorTemperaturaAlta(new SensorTemperatura(70000000.0f)));

        assertEquals(700.0f, sensor.getReading());
    }

    @Test
    void shouldReturnWaterTemperaturePlusSoilTemperaturePlusHighTemperatureSensorReading(){
        Sensor sensor = new SensorTemperaturaAgua(new SensorTemperaturaSolo( new SensorTemperaturaAlta( new SensorTemperatura(7000000000.0f))));

        assertEquals(700.0f, sensor.getReading());
    }

    @Test
    void shouldReturnSensorStructure(){
        Sensor sensor = new SensorTemperatura();

        assertEquals("Sensor temperatura", sensor.getStructure());
    }

    @Test
    void shouldReturnWaterTemperatureSensorStructure(){
        Sensor sensor = new SensorTemperaturaAgua(new SensorTemperatura());

        assertEquals("Sensor temperatura para água", sensor.getStructure());
    }

    @Test
    void shouldReturnSoilTemperatureSensorStructure(){
        Sensor sensor = new SensorTemperaturaSolo(new SensorTemperatura());

        assertEquals("Sensor temperatura para solo", sensor.getStructure());
    }

    @Test
    void shouldReturnHighTemperatureSensorStructure(){
        Sensor sensor = new SensorTemperaturaAlta(new SensorTemperatura());

        assertEquals("Sensor temperatura para altas temperaturas", sensor.getStructure());
    }

    @Test
    void shouldReturnWaterTemperaturePlusSoilTemperatureSensorStructure(){
        Sensor sensor = new SensorTemperaturaSolo(new SensorTemperaturaAgua( new SensorTemperatura()));

        assertEquals("Sensor temperatura para água para solo", sensor.getStructure());
    }

    @Test
    void deveRetornarEstruturaSensorTemperaturaAguaMaisSensorTemperaturaAlta(){
        Sensor sensor = new SensorTemperaturaAlta(new SensorTemperaturaAgua( new SensorTemperatura()));

        assertEquals("Sensor temperatura para água para altas temperaturas", sensor.getStructure());
    }

    @Test
    void shouldReturnSoilTemperaturePlusHighTemperatureSensorStructure(){
        Sensor sensor = new SensorTemperaturaAlta(new SensorTemperaturaSolo( new SensorTemperatura()));

        assertEquals("Sensor temperatura para solo para altas temperaturas", sensor.getStructure());
    }

    @Test
    void shouldReturnWaterTemperaturePlusSoilTemperaturePlusHighTemperatureSensorStructure(){
        Sensor sensor = new SensorTemperaturaAlta(new SensorTemperaturaSolo(new SensorTemperaturaAgua( new SensorTemperatura())));

        assertEquals("Sensor temperatura para água para solo para altas temperaturas", sensor.getStructure());
    }



}