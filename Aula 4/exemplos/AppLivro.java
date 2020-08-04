package exemplos;

import java.util.Scanner;

public class AppLivro {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        String titulo; 
                 
        System.out.println("Informe o título do livro:"); 
        titulo = in.nextLine(); 
        Livro livro1 = new Livro(titulo, "LTC", "Deitel", 457); 
                 
        System.out.println("Informe o título do livro:"); 
        titulo = in.nextLine(); 
        Livro livro2 = new Livro(titulo, "Alta Books", "Silbershatz", 300); 
         
        livro1.emprestar();       
        
        boolean possoEmprestar = livro1.estaDisponivel();

        if (possoEmprestar) {
            System.out.println("O Livro " + livro1.titulo + " esta disponivel.");            
        } else {
            System.out.println("O Livro " + livro1.titulo + " nao esta disponivel.");
        }
        System.out.println("Livros cadastrados:");
        livro1.exibirDados(); 
        livro2.exibirDados(); 
 
        String saida = livro1.getDados(); 
        System.out.println(saida); 
        System.out.println(livro2.getDados());

        System.out.println("Número de páginas dos livros"); 
        System.out.println(livro1.titulo + " - " + livro1.obterPaginas() + " páginas."); 
        System.out.println(livro2.titulo + " - " + livro2.obterPaginas() + " páginas.");

    }
}