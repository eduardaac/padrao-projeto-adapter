package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveRetornarTemperaturaFahrenheit() {
        Termometro termometro = new Termometro();
        termometro.setTemperaturaFahrenheit(77.0); // 77°F

        // O valor recuperado deve ser 77.0 (Fahrenheit)
        assertEquals(77.0, termometro.getTemperaturaFahrenheit(), 0.001);
    }

    @Test
    void deveRetornarTemperaturaCelsius() {
        Termometro termometro = new Termometro();
        termometro.setTemperaturaFahrenheit(77.0); // 77°F

        // O valor convertido (Celsius) deve ser 25.0
        // C = (77 - 32) * 5/9 = 45 * 5/9 = 25
        assertEquals(25.0, termometro.getTemperaturaCelsius(), 0.001);
    }

}