public class Sample04 {
    public static void main(String[] args) {
        
        //conversão de tipo de dados

        int numeroInteiro;
        float numeroFloat;

        numeroInteiro = 230;

        //armazenar um tipo menor em um tipo maior, sem problema
        numeroFloat = numeroInteiro;
        
        //armazenar um tipo maior em um tipo menor, não funciona
        //numeroInteiro = numeroFloat;

        numeroFloat = 7.999f; //f para dizer que é Float
        //casting: força uma conversão de tipo com possível perda de precisão
        //não tem arredondamento
        numeroInteiro = (int)numeroFloat;

        System.out.println(numeroInteiro);
        System.out.println(numeroFloat);

    }
    
}