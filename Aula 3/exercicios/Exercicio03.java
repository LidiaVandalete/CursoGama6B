package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        // numero int N
        // exibir sequencia, enquanto o valor for igual ou menor a N
        // ex: digitar 8 e exibir: 1, 2, 4, 8
        // ex: digitar 82 e exibir: 1, 2, 4, 8, 16, 32, 64

        Scanner entrada = new Scanner(System.in);

        int seq = 1;
        int input = entrada.nextInt();
        entrada.close();

        while (seq <= input) {
            System.out.print(seq);
            seq = seq * 2;
            if (seq <= input) {

                System.out.print(" , ");
            }
        }
    }
}