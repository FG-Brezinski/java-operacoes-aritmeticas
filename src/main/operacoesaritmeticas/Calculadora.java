package main.operacoesaritmeticas;

import java.util.Scanner;

public class Calculadora {

    public static void calcular() {
        Scanner scanner = new Scanner(System.in);
        Operacao operacao = new Operacao();
        System.out.println("Escolha uma operação");
        System.out.println("+ -> Soma");
        System.out.println("- -> Subtração");
        System.out.println("* -> Multiplicação");
        System.out.println("/ -> Divisão");
        String operador = scanner.next();

        System.out.println("X:");
        int x = scanner.nextInt();
        System.out.println("Y:");
        int y = scanner.nextInt();

        if (operador.equals("+")){
            System.out.println(operacao.soma(x, y));
        }

        if (operador.equals("-")){
            System.out.println(operacao.subtracao(x, y));
        }

        if (operador.equals("/")){
            System.out.println(operacao.divisao(x, y));
        }

        if (operador.equals("*")){
            System.out.println(operacao.multiplicacao(x, y));
        }




        scanner.close();
    }
}
