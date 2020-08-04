package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner(System.in);
        int numero;
        float metade;

        System.out.println("Digite um numero inteiro: ");
        numero = entrada.nextInt();

        if(numero > 20) {
            metade = (float)numero / 2;
            System.out.println("Metade = " + metade);
            System.out.printf("Metade = %.2f\n" , metade);
            
            entrada.close();
            
        }

    }

}