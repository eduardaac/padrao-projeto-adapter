package padroesestruturais.adapter;

public class TemperaturaFahrenheit implements ITemperatura {

    private double fahrenheit;

    @Override
    public double getTemperatura() {
        return this.fahrenheit;
    }

    @Override
    public void setTemperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}