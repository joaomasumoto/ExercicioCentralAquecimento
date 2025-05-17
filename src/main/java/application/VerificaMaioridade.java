package application;
import java.util.Scanner;

public class VerificaMaioridade {

    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======VERIFICA MAIORIDADE======");
        System.out.print("Insira a idade a ser testada: ");
        int idade = sc.nextInt();

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
