package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinheNumero {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======ADIVINHE O NÚMERO======");

        // Sorteia um número entre 1 e 10
        int numeroSecreto = sorteiaNumero();
        int i = 1;            // contador de tentativas
        int palpite = 0;      // inicializa palpite

        // Laço principal: até acertar ou esgotar 3 tentativas
        while ((!palpiteCerto(palpite, numeroSecreto)) && (i < 4)) {
            System.out.printf("Tentativa %d de 3. Digite um número entre 1 e 10: ", i);

            // Lê o palpite do usuário com tratamento de exceção
            palpite = lerPalpite(sc);

            // Entrada inválida (ex: letras) → não conta tentativa
            if (palpite == -1) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                continue;
            }

            // Número fora do intervalo permitido → não conta tentativa
            if (palpite < 1 || palpite > 10) {
                System.out.println("Número fora do intervalo permitido (1 a 10). Tente novamente.");
                continue;
            }

            System.out.println("Pensando...");

            // Se acertar, exibe sucesso e encerra
            if (palpite == numeroSecreto) {
                System.out.println("ACERTOU!!!");
                return;
            } else {
                System.out.println("Palpite incorreto.");
            }

            i++; // Só conta tentativa se palpite foi válido
        }

        // Se saiu do laço sem acertar, mostra número secreto
        System.out.println();
        System.out.printf("Limite de tentativas excedido. O número secreto era %d. Não foi dessa vez.", numeroSecreto);
        System.out.println();
    }

    // Gera um número aleatório de 1 a 10
    private static int sorteiaNumero() {
        return (int) (Math.random() * 10) + 1;
    }

    // Verifica se o palpite está correto
    private static boolean palpiteCerto(int palpite, int numeroSecreto) {
        return palpite == numeroSecreto;
    }

    // Lê o palpite do usuário e trata exceções de entrada
    private static int lerPalpite(Scanner sc) {
        try {
            return sc.nextInt(); // tenta ler número inteiro
        } catch (InputMismatchException e) {
            sc.nextLine();       // limpa o buffer de entrada inválida
            return -1;           // sinaliza entrada inválida
        }
    }
}
