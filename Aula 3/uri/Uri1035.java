package uri;
import java.util.Scanner;

public class Uri1035 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c, d;
        boolean validado;

        System.out.println("Digita o valor A: ");
        a = entrada.nextInt();
        System.out.println("Digita o valor B: ");
        b = entrada.nextInt();
        System.out.println("Digita o valor C: ");
        c = entrada.nextInt();
        System.out.println("Digita o valor D: ");
        d = entrada.nextInt();

        validado = (b > c) && (d > a) && (c + d > a + b) && (c > 0 && d > 0) && (a % 2 == 0);

        if (validado) {
            System.out.println("Aceitos");
        }else{
            System.out.println("Valores Nao aceitos");
        }
        entrada.close();
    }

}