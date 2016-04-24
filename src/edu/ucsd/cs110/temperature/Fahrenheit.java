package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @java.lang.Override
    public Temperature toCelsius() {
        return new Celsius(value);
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(value);
    }


    public String toString()
    {
        // TODO: Complete this method
        return "";
    }
}

