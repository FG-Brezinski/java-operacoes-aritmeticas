package main.operacoesaritmeticas;

import java.util.Scanner;

public class RegraDeTres {

    public static void calcularRegraDeTres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Regra De Tres Simples");
        System.out.println(" ");
        System.out.println("A está para B");
        System.out.println("C está para X");
        System.out.println(" ");
        System.out.println("Qual é o valor de A?");
        double valorA = scanner.nextInt();

        System.out.println("Qual é o valor de B?");
        double valorB = scanner.nextInt();

        System.out.println("Qual é o valor de C?");
        double valorC = scanner.nextInt();

        double X = (valorC * valorB) / valorA;
        //double Xfinal =  X / valorC;

        System.out.printf("O valor de X é %.2f%n", X);

        scanner.close();
    }
}