import java.util.Scanner;

public class Sample06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );

        int idade;
        float peso = 74.5f;

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();

        System.out.println("Digite o seu peso");
        peso = entrada.nextFloat();

        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Você pesa " + peso + " Kg.");
        
        entrada.close();
    }

}