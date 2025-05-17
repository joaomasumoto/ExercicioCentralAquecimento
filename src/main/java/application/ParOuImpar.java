package application;

import java.util.Scanner;

public class ParOuImpar {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======PAR OU IMPAR======");
        System.out.print("Escolha um número: ");
        int num = sc.nextInt();

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
