package app;

import models.ConversorUnidades;

public class Main {

	public static void main(String[] args) {
        // Exemplos de conversões

        // Convertendo 25 graus Celsius para Fahrenheit
        double temperaturaCelsius = 25.0;
        double temperaturaFahrenheit = ConversorUnidades.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " °C é igual a " + temperaturaFahrenheit + " °F");

        // Convertendo 10 quilômetros para milhas
        double distanciaQuilometros = 10.0;
        double distanciaMilhas = ConversorUnidades.quilometrosParaMilhas(distanciaQuilometros);
        System.out.println(distanciaQuilometros + " km é igual a " + distanciaMilhas + " milhas");

        // Convertendo 500 gramas para libras
        double pesoGramas = 500.0;
        double pesoLibras = ConversorUnidades.gramasParaLibras(pesoGramas);
        System.out.println(pesoGramas + " g é igual a " + pesoLibras + " libras");

	}

}
