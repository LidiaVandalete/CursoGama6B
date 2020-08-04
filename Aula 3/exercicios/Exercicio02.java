package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, cont;
        cont = 0;

        System.out.println("Digite qual numero da tabuada, deseja contar: ");
        numero = entrada.nextInt();

        while (cont <= 10) {
            System.out.println(numero + "*" + cont + "=" + (numero * cont));
            cont++;
        }
        entrada.close();
    }

}