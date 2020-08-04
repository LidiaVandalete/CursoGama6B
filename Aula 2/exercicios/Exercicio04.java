package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void Main(final String[] args) {
        final Scanner entrada = new Scanner(System.in);

        int ladoA, ladoB, ladoC;

        System.out.println("Digite o comprimento do lado a: ");
        ladoA = entrada.nextInt();
        System.out.println("Digite o comprimento do lado b: ");
        ladoB = entrada.nextInt();
        System.out.println("Digite o comprimento do lado c: ");
        ladoC = entrada.nextInt();

        if ((ladoA > ladoB + ladoC) && (ladoB > ladoA + ladoC) && (ladoC > ladoA + ladoB)) {
            System.out.println("Não forma um triângulo\n");

        } else {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Formam um triângulo equilátero\n");
            } else {
                if (ladoA == ladoB || ladoB == ladoC) {
                    System.out.println("Forma um triângulo isóceles\n");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }
        }
        entrada.close();
    }
}