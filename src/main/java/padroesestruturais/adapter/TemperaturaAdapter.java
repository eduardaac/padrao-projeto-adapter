package padroesestruturais.adapter;

public class TemperaturaAdapter extends TemperaturaCelsius {
    private ITemperatura temperaturaFahrenheit;

    public TemperaturaAdapter(ITemperatura temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double recuperarTemperaturaFahrenheit() {
        this.temperaturaFahrenheit.setTemperatura(this.getCelsius() * 9.0/5.0 + 32.0);
        return this.temperaturaFahrenheit.getTemperatura();
    }

    public void salvarTemperatura(double fahrenheit) {
        this.temperaturaFahrenheit.setTemperatura(fahrenheit);

        // Conversão de Fahrenheit para Celsius: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32.0) * 5.0/9.0;

        this.setCelsius(celsius);
    }
}