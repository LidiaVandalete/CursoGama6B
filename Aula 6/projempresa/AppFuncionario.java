package projempresa;

public class AppFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Lidia", 40, 30);
        Funcionario f2 = new FuncionarioSenior("Huguinho", 40, 30, 50);

        System.out.println(f1);
        System.out.println("Salario: " + f1.calculaSalario());

        System.out.println(f2);
        System.out.println("Salario: " + f2.calculaSalario());        
    }
    
}