package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        // Flags de controle para validar entrada do usuário
        boolean pesoValido = false;
        boolean alturaValido = false;

        // Variáveis que armazenarão os valores válidos
        double altura = 0;
        double peso = 0;

        System.out.println("======CALCULADORA DE IMC======");

        // Loop até o usuário digitar um peso válido
        while (!pesoValido) {
            try {
                System.out.print(" Qual o seu Peso (kg)? ");

                // Lê como string e permite vírgula ou ponto
                String entrada = sc.nextLine().replace(',', '.');
                peso = Double.parseDouble(entrada);
                pesoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Insira um valor válido.");
            }
        }

        // Loop até o usuário digitar uma altura válida
        while (!alturaValido) {
            try {
                System.out.print("Qual a sua altura (m)? ");

                // Lê como string e trata pontuação
                String entrada = sc.nextLine().replace(',', '.');
                altura = Double.parseDouble(entrada);
                alturaValido = true;
            } catch (InputMismatchException e) { // ⚠️ aqui você pode usar NumberFormatException
                System.out.println("Insira um valor válido.");
            }
        }

        // Calcula o IMC e exibe resultado
        double imc = imc(altura, peso);
        System.out.printf("Seu IMC é de %.2f. ", imc);
        tabelaImc(imc); // Exibe a categoria do IMC

        System.out.println();
    }

    // Calcula IMC usando a fórmula peso / altura²
    private static double imc(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }

    // Classifica o IMC em categorias
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
