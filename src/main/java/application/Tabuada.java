package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======TABUADA======");

        int num = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                System.out.print("Selecione a tabuada desejada: ");
                num = sc.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido.");
                sc.nextLine();
            }
        }

        tabuada(num);

        System.out.println();
    }

    private static void tabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            System.out.printf("%d x %d = %d\n", num, i, result);        }
    }

}
