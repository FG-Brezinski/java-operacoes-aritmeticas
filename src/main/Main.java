package main;
/*Projeto aonde vou dar as opções de formulas matematicas a serem usadas e uma main.calculadora tambem. */

import main.operacoesaritmeticas.Calculadora;
import main.operacoesaritmeticas.RegraDeTres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Regra de 3 Simples");

        int opcaoEscolhida = scanner.nextInt();

        if (opcaoEscolhida == 1) {
            Calculadora.calcular();
        } else {
            RegraDeTres.calcularRegraDeTres();
        }

        scanner.close();
    }

}
