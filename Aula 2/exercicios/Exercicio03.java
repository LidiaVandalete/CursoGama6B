package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2;

        System.out.println("Digite o primeiro num: ");
        num1 = entrada.nextFloat();
        System.out.println("Digite o segundo num: ");
        num2 = entrada.nextFloat();

        System.out.println("Em ordem crescente: ");

        if (num1 > num2) {
            System.out.printf("%f, %f\n", num1, num2);
        } else {
            System.out.printf("%f, %f\n", num1, num2);
        }
        
        entrada.close();

    }
    
}