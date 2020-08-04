package projconta;

public class AppContas {
    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente(1234);
        ContaEspecial ce = new ContaEspecial(4321, 100);
        ContaPoupanca cp = new ContaPoupanca(4000);

        cc.depositar(150);
        if(cc.saque(50) == true){
            System.out.println("Saque efetuado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(cc.exibir());


        ce.depositar(100);
        if(ce.saque(50) == true){
            System.out.println("Saque efetuado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(ce.exibir());

        

        cp.depositar(100);
        if(cp.saque(50) == true){
            System.out.println("Saque efetuado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(cp.exibir());
    }

}