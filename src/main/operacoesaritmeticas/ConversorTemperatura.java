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
        System.out.println("3 - Celsius para kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.println("5 - Fahrenheit para Kelvin");
        System.out.println("6 - Kelvin para Fahrenheit");
        System.out.println("7 - sair");
        System.out.println(" ");
        System.out.println("Escolha uma opção:");

        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.print("Informe a temperatura em Celsius:");
                var c = scanner.nextInt();
                System.out.println(conversao.celciusParaFahrenheit(c));
            break;

            case 2:
                System.out.println("Informe a temperatura em Fahrenheit:");
                int f = scanner.nextInt();
                System.out.println(conversao.fahrenheitParaCelsius(f));
            break;

            case 3:
                System.out.println("Informe a temperatura em Celcius:");
                int k = scanner.nextInt();
                System.out.println(conversao.celciusParaKelin(k));
            break;

            case 4:
                System.out.println("Informe a temperatura em Kelvin:");
                int ck = scanner.nextInt();
                System.out.println(conversao.kelvinParaCelcius(ck));
            break;

            case 5:
                System.out.println("Fahrenheit para Kelvin:");
                int fk = scanner.nextInt();
                System.out.println(conversao.fahrenheitParaKelvin(fk));
            break;

        }








        /*int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.print("Informe a temperatura em Celsius:");
            var c = scanner.nextInt();
            System.out.println(conversao.celciusParaFahrenheit(c));
        }

        if (numero == 2) {
            System.out.println("Informe a temperatura em Fahrenheit:");
            int f = scanner.nextInt();
            System.out.println(conversao.fahrenheitParaCelsius(f));
        } else {
            System.out.println("Encerrando programa!");

        }*/


        scanner.close();

    }
}
