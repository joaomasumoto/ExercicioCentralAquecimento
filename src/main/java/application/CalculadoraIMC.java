package application;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======CALCULADORA DE IMC======");
        System.out.print(" Qual o seu Peso (kg)? ");
        double peso = sc.nextDouble();

        System.out.print("Qual a sua altura (m)? ");
        double altura = sc.nextDouble();

        double imc = imc(altura, peso);
        System.out.printf("Seu IMC é de %.2f. ", imc);
        tabelaImc(imc);

        System.out.println();

    }

    private static double imc(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    private static void tabelaImc(double imc) {
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2.");
        } else {
            System.out.println("Obesidade grau 3 (mórbida).");
        }
    }

}
