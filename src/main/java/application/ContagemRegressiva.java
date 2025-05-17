package application;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======CONTAGEM REGRESSIVA======");
        System.out.print("Selecione o número para a contagem: ");
        int num = sc.nextInt();

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
