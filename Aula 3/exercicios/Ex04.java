package exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int cont, numero, pares, impares;

          //ler 10 numeros

        cont = 1;
        pares = 0;
        impares = 0;

        while (cont <=3) {
            numero = in.nextInt();
            if(numero % 2 == 0) {

            }else{
                impares ++;
            }
            cont ++;

        System.out.printf("Contamos %d pares e %d impares.\n", pares, impares);
        }
        in.close();

        //exibir quantidade de pares e impares
    }
    
}