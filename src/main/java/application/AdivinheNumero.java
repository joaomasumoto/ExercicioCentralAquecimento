package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinheNumero {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = sorteiaNumero();


        System.out.println("======ADIVINHE O NÚMERO======");
        System.out.print("Insira o seu palpite: ");


        int i = 1;

        int palpite = lerPalpite(sc);
        while ((!palpiteCerto(palpite, numeroSecreto)) && (i < 3)) {
            System.out.printf("Palpite incorreto. Faltam %d tentativas.\n", Math.abs(i - 3));
            System.out.print("Insira o seu palpite: ");
            palpite = lerPalpite(sc);
            if (palpite == -1) {
                System.out.println("Pensando...");
                System.out.println("Digite um número válido entre 1 e 10.");
                continue; //volta pro inicio do loop while e nao adiciona um na contagem de tentativas;
            }
            if (palpite < 1 || palpite > 10) {
                System.out.println("Pensando...");
                System.out.println("Digite um número entre 1 e 10.");
                continue;
            }
            System.out.println("Pensando...");
            i++;
        }
        if (palpiteCerto(palpite, numeroSecreto)) {
            System.out.println("ACERTOU!!!");
        } else {
            System.out.printf("Limite de tentativas excedido. O número secreto era %d. Não foi dessa vez.", numeroSecreto);
        }
        System.out.println();


    }

    private static int sorteiaNumero() {
        return (int) (Math.random() * 10) + 1;
    }

    private static boolean palpiteCerto(int palpite, int numeroSecreto) {
        return palpite == numeroSecreto;
    }

    private static int lerPalpite(Scanner sc) {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            return -1; //precisa retornar um valor inválido já que a tentativa nao foi válida.
        }
    }
}
