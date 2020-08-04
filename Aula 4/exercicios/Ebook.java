package exercicios;

public class Ebook {
    
    String titulo;
    String autor;
    int totalPaginas;
    int paginaAtual;
    
    public Ebook (String titulo, String autor, int totalPaginas, int paginaAtual) {

        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = 0;
   }

   public int avancarPagina() {
        paginaAtual = paginaAtual + 1;
        System.out.println("Você avançou para a pagina: " + paginaAtual);
   }

}