package projcontas;

import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroConta;
        double valor, limite;
        int opcao;

        ArrayList<Conta> contas = new ArrayList<>();

        Conta conta = null;

        do {
            System.out.println("1-Novo conta corrente");
            System.out.println("2-Novo conta poupança");
            System.out.println("3-Novo conta especial");
            System.out.println("4-Mostrar saldo");
            System.out.println("5-Fazer saque");
            System.out.println("6-Fazer deposito");
            System.out.println("7-Sair");
            System.out.print("==> ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta corrente:");
                    numeroConta = in.nextInt();
                    conta = new ContaCorrente(numeroConta);
                    contas.add(conta);
                    break;

                case 2:
                    System.out.println("Informe o número da poupança:");
                    numeroConta = in.nextInt();
                    conta = new ContaPoupanca(numeroConta);
                    contas.add(conta);
                    break;

                case 3:
                    System.out.println("Informe o número da conta especial:");
                    numeroConta = in.nextInt();
                    System.out.println("Informe o limite:");
                    limite = in.nextDouble();
                    conta = new ContaEspecial(numeroConta, limite);
                    contas.add(conta);
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = in.nextInt();
                    
                    for (Conta c : contas) {
                        if (c.getNumero() == numeroConta) {
                            System.out.println(c.exibir());
                        }
                    }
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Digite o valor do depósito:");
                    valor = in.nextDouble();
                    conta.depositar(valor);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("opcao inválida");

            }

        } while (opcao != 7);

        in.close();
    }
}