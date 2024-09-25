public class Temperature {
    private double temperature = 0.0;
    private char scale = 'C';

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public Temperature(char scale) {
        this.scale = scale;
    }

    public void setTemperatureFull(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public char getScale() {
        return scale;
    }

    public double getTemperatureCelsius() {
        if (scale == 'C') {
            return temperature;
        }
        else if (scale == 'F') {
            return 5 * (temperature - 32) / 9;
        }
        return temperature;
    }

    public double getTemperatureFahrenheit() {
        if (scale == 'F'){
            return temperature;
        }
        else if (scale == 'C'){
            return (9*(temperature/5)+32);
        }
        return temperature;
    }
}
