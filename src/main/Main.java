package main;
/*Projeto aonde vou dar as opções de formulas matematicas a serem usadas e uma main.calculadora tambem. */

import main.operacoesaritmeticas.Calculadora;
import main.operacoesaritmeticas.ConversorTemperatura;
import main.operacoesaritmeticas.RegraDeTres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Regra de 3 Simples");
        System.out.println("3 - Convesor de temperatura");

        int opcaoEscolhida = scanner.nextInt();

        if (opcaoEscolhida == 1) {
            Calculadora.calcular();
        } else if(opcaoEscolhida == 2) {
            RegraDeTres.calcularRegraDeTres();
        } else {
            ConversorTemperatura.converter();
        }

        scanner.close();
    }

}
