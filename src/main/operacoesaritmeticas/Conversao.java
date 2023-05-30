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

    public String celciusParaKelin(int k){
        return String.format("%.2f", (k + 273.15));
    }

    public String kelvinParaCelcius(int ck){
        return  String.format("%.2f", (ck - 273.15));
    }

    public String fahrenheitParaKelvin(int fk){
        return String.format("%.2f", ((fk - 32) * 5/9 + 273.15));
    }
}
