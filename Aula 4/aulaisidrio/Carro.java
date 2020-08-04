package aulaisidrio;

public class Carro {

    // incio da definção do tipo de dado CARRO
    // definição de todas as propriedades (como se fossem variáveis)
    
	public String marca;
	public String modelo;
	public int km;
	public int ano;
	public String combustível;
	public String cor;
	public double preco;
    public String combustivel;
    //private double valorIPVA;

    /*
    void calcularIPVA() {
        double valorIPVA;
        if (ano < 2000){
            System.out.println("Isento de IPVA - UFA!");
        }
        else{
            valorIPVA = preco * 0.04;
            System.out.println("Valor do IPVA = " + valorIPVA);
        }

        /** */

        //ou
        
    double calcularIPVA() {
        double valordevido;
        if (ano < 2000) {
            valordevido = 0.0;
        }
        else{
            valordevido = preco * 0.04;
        }
        return valordevido;
    }

}