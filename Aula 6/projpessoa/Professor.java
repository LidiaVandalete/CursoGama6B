package projpessoa;
    
public class Professor extends Pessoa{

    private String titulo;
    private float salario;

    public Professor(String nome, String ender, String tel, String titulo, String instituicao, float salario) {

        super(nome, ender, tel);
        this.titulo = titulo;
        this.salario = salario;
    }
    
    @Override
    public String exibirDados() {
        return super.exibirDados() +  " - Titulo: " +  titulo;
    
    }

}