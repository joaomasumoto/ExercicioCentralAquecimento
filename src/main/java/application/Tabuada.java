package application;

import java.util.Scanner;

public class Tabuada {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======TABUADA======");

        System.out.printf("TABUADA%n Selecione a tabuada desejada: ");
        int num = sc.nextInt();

        tabuada(num);

        System.out.println();
    }

    private static void tabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            System.out.printf("%d x %d = %d\n", num, i, result);        }
    }

}
