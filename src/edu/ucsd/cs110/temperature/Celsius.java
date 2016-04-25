package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @java.lang.Override
    public Temperature toCelsius() {
        return new Celsius(value);
    }

    @java.lang.Override
    public Temperature toFahrenheit()
    {
        float temp = ((this.getValue())*(float)(9.0/5.0))+(float)32;
        return new Fahrenheit(temp);
    }

    public String toString()
        {
            String bob = "" + this.value + " C";
            return bob;
        }
}
