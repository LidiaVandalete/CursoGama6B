package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        //ler varios numeros inteiros

        //parar quando o usuário digitar 0

        //exibir a soma dos valores digitados - Texto: a soma dos valores digitados é:

        Scanner entrada = new Scanner (System.in);

        int soma, num = 1;

        soma = 0;

        while (num != 0) {
            num = entrada.nextInt();
            soma = num + soma;
        }
        System.out.println("Soma dos valors = " + soma);

        entrada.close();
    }
    
}