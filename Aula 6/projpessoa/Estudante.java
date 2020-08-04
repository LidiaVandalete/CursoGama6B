package projpessoa;

public class Estudante extends Pessoa {

    private int ra;
    private String curso;
    private int anoGraduacao;

    public Estudante(){

    }
    
    public Estudante(String nome, String ender, String tel, int ra, String curso, int anoGraduacao){

        super(nome, ender, tel);
        this.ra = ra;
        this.curso = curso;
        this.anoGraduacao = anoGraduacao;
    }

    public int getRa(){
        return ra;
    }
    public void getRa(int ra){
        this.ra = ra;
    }
    public String getCurso(){
        return curso;
    }
    public int getAnoGraduacao(){
        return anoGraduacao;
    }
    @Override
    public String exibirDados(){
        return super.exibirDados() + " - RA: " + ra;
    }


}