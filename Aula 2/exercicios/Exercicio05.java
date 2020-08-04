package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario, prestação;
        boolean ehlegível;

        System.out.println("Digite o salário: ");
        salario = entrada.nextFloat();

        System.out.println("Informe o valor da prestação: ");
        prestação = entrada.nextFloat();

        ehlegível = (salario * 0.3) >= prestação;

        if(ehlegível) {
            System.out.println("Emprestimo disponivel.");
        } else {
            System.out.println("Emprestimo indisponivel."); 
        }
        entrada.close();
    }
    
}