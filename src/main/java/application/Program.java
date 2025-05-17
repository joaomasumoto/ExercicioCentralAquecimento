package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String menu = """
                ========MENU========
                EXERCÍCIOS DE TREINO
                1- Adivinhe o número
                2- Calculadora IMC
                3- Contagem regressiva
                4- Par ou ímpar
                5- Tabuada
                6- Verificador de maioridade
                7- Sair
                """;


        int opcao = -1;
        do {
            System.out.println(menu);
            try {

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        AdivinheNumero.executar();
                        break;
                    case 2:
                        CalculadoraIMC.executar();
                        break;
                    case 3:
                        ContagemRegressiva.executar();
                        break;
                    case 4:
                        ParOuImpar.executar();
                        break;
                    case 5:
                        Tabuada.executar();
                        break;
                    case 6:
                        VerificaMaioridade.executar();
                        break;
                    case 7:
                        System.out.println("Fechando aplicação...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Selecione um número de 1 a 7.");
                sc.nextLine();

            } catch (Exception e) {
                System.out.println("Erro: " + e);
                sc.nextLine();
            }

        } while (opcao != 7);

        sc.close();

    }
}
