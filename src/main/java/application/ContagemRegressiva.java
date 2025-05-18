package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContagemRegressiva {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======CONTAGEM REGRESSIVA======");

        boolean numeroValido = false;
        int num = 0;
        while (!numeroValido) {
            System.out.print("Selecione o número para a contagem: ");
            try {
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Digite um número igual ou maior que zero.");
                    continue;
                }
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                sc.nextLine();
            }
        }

        imprimeContagem(num);
        System.out.println();
    }

    private static void imprimeContagem(int inicio) {
        while (inicio >= 0) {
            System.out.println(inicio);
            inicio = inicio - 1;
        }
        System.out.println("FIM.");
    }

}
