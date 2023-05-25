package main.operacoesaritmeticas;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void converter() {

    Conversao conversao = new Conversao();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Conversor De Temperatura");
        System.out.println(" ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - sair");
        System.out.println(" ");
        System.out.println("Escolha uma opção:");

        int numero = scanner.nextInt();

        if(numero == 1){
            System.out.print("Informe a temperatura em Celsius:");
            var c = scanner.nextInt();
            System.out.println(conversao.celciusParaFahrenheit(c));
        }

        if (numero == 2){
            System.out.println("Informe a temperatura em Fahrenheit:");
            int f = scanner.nextInt();
            System.out.println(conversao.fahrenheitParaCelsius(f));
        }else {
            System.out.println("Encerrando programa!");
        }
                

        scanner.close();

    }
}
