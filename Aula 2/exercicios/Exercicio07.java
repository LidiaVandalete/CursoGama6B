package exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, desconto;

        System.out.println("Digite seu salario: ");
        salario = entrada.nextLine();

        entrada.close();

        if( salario <=600 ) {
            System.out.println("Isento");

        } else {
            if (salario <= 1200) {
                System.out.println("O desconto do INSS é: " + salario * 0.20);
            
            } else {
                if (salario <= 2000) {
                    System.out.println("O desconto do INSS é: " + salario * 0.25);
                
                } else {
                    System.out.println("O desconto do INSS é: " + salario * 0.30);
                }
                entrada.close();
            }
        }
    }
}