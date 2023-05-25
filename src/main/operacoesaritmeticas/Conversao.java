package main.operacoesaritmeticas;

import java.util.Scanner;

public class Conversao {
    Scanner scanner = new Scanner(System.in);
    public String celciusParaFahrenheit(double c){
        return String.format("%.2f", c * 1.8 + 32);
    }

    public String fahrenheitParaCelsius(int f){
        return String.format("%.2f", (f - 32) / 1.8);
    }
}
