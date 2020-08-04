package exercicios;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextFloat();

        entrada.close();

        media = (float)(nota1*0.4)+(float)(nota2*0.6);

        if(media >= 6) {
            System.out.println("Aluno aprovado. Média: " + media);

        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }

    }

}