package padroesestruturais.adapter;

public class Termometro {

    ITemperatura temperatura;
    TemperaturaAdapter conversor;

    public Termometro() {
        temperatura = new TemperaturaFahrenheit();
        conversor = new TemperaturaAdapter(temperatura);
    }

    public void setTemperaturaFahrenheit(double fahrenheit) {
        conversor.salvarTemperatura(fahrenheit);
    }

    public double getTemperaturaFahrenheit() {
        return conversor.recuperarTemperaturaFahrenheit();
    }

    public double getTemperaturaCelsius() {
        return conversor.getCelsius();
    }

}