package exercicios;

import java.util.Stack;

public class Sample01 {

    private static final int O = 0;
        
        public static void main(String[] args) {
            
            Stack<Character> pilha = new Stack<>();
            String frase = "Este exercicio e muito facil."; {
            
            for (int i = O; i < frase.length(); i++ ) {
                pilha.push(frase.charAt(i));
            }
            while(!pilha.isEmpty()){
                System.out.print(pilha.pop());
            }
        }
    }
}