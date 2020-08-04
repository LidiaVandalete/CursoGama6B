
import java.util.Scanner;

public class Sample05 {

    public static void main(String[] args) {

        System.out.println(); // out é saída de dados //variáveis
        // entrada de dados - VAMOS APRENDER!
        // processamento - ok
        // saida de dados - ok

        // entrada de dados

        Scanner entrada = new Scanner (System.in);

        String textoDigitado; //poderia ter usado o nome da váriavel de Nome em vez de textoDigitado

        System.out.println("Digite o seu nome:");

        textoDigitado = entrada.nextLine();
        
        System.out.println("Bem vindo, " + textoDigitado);

        entrada.close(); //finalizar a conversa
        
    }

}