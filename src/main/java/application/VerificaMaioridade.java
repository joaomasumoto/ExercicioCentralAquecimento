package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificaMaioridade {

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======VERIFICA MAIORIDADE======");

        int idade = 0;
        boolean idadeValida = false;
        while (!idadeValida) {
            try {
                System.out.print("Insira a idade a ser testada: ");
                idade = sc.nextInt();
                idadeValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira uma idade válida.");
                sc.nextLine();
            }
        }


        if (temMaioridade(idade)) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        System.out.println();

    }

    private static boolean temMaioridade(int idade) {
        return idade >= 18;
    }
}
