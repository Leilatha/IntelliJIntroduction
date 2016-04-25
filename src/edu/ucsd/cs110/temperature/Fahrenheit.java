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
        float temp = ((this.getValue())-(float)32)*(float)(5.0/9.0);
        return new Celsius(temp);
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(value);
    }


    public String toString()
    {
        String bob = "" + this.value + " F";
        return bob;
    }
}

