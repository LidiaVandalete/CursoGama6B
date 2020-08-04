package exemplos;

public class Lidia {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Nome: Biblia Sagrada";
        livro.editora = "Editor:  Vida Melhor";
        livro.autor = "Autor: Thomas Nelson";
        livro.numeroPaginas = 1642;
        
        System.out.println("Dados do Livro = " + livro.titulo + " / " + livro.editora + " - " + livro.autor + " - " + livro.numeroPaginas + " Páginas.");

    }
}