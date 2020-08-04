public class Exercicio01 {

    public static void main(String[] args) {

        // Primeiro exemplo:

        System.out.println("O Resultado de 15 + 7 = " + (15 + 7));
        System.out.println("O Resultado de 15 - 7 = " + (15 - 7));
        System.out.println("O Resuldado de 15 x 7 = " + (15 * 7));
        System.out.println("O Resuldado de 15 / 7 = " + (15 / 7));

        // Segundo exemplo guardando em váriavel

        int valor1 = 15;
        int valor2 = 7;

        System.out.println(valor1 + valor2);
        System.out.println(valor1 - valor2);
        System.out.println(valor1 * valor2);
        System.out.println(valor1 / valor2); // resultado dá 2, porém é inteiro, esse numero precisa ser quebrado

        float valor3 = 15; // transforma tudo com casa decimal
        float valor4 = 7;

        System.out.println(valor3 + valor4);
        System.out.println(valor3 - valor4);
        System.out.println(valor3 * valor4);
        System.out.println(valor3 / valor4);

    }
}