package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParOuImpar {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======PAR OU IMPAR======");

        boolean numeroValido = false;
        int num = 0;
        while (!numeroValido) {
            try {
                System.out.print("Escolha um número: ");
                num = sc.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números.");
                sc.nextLine();
            }
        }

        System.out.println();

        if (ehPar(num)) {
            System.out.printf("O número %d é par.", num);
        } else {
            System.out.printf("O número %d é ímpar.", num);
        }

        System.out.println();

    }

    private static boolean ehPar(int num) {
        return num % 2 == 0;
    }

}
