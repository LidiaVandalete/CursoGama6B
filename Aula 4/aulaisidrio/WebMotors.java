package aulaisidrio;

public class WebMotors {
    public static void main(String[] args) {

        //criar uma variavel do tipo "carro"
        Carro c, c2;

        //instanciar na memória toda a estrutura que define o carro
        c = new Carro(); //agora eu tenho o objeto c do tipo Carro

        //vamos preencher?
        c.marca        = "Fiat";
        c.modelo       = "Uno";
        c.ano          = 1990;
        c.km           = 320000;
        c.cor          = "Branco";
        c.combustível  = "Gasolina/Alcool";
        c.preco        = 10000.00f;

        c2             = new Carro();
        c2.marca       = "Chevrolet";
        c2.modelo      = "Corsa";
        c2.ano         = 2003;
        c2.km          = 180000;
        c2.cor         = "Vinho";
        c2.combustivel = "Alcool";
        c2.preco       = 53000.00f;

        /*
        //vamos imprimir
        System.out.println("Carro = " + c.marca + " / " + c.modelo);
        System.out.println("   R$   " + c.preco);
        c.calcularIPVA();

        System.out.println("Carro = " + c2.marca + " / " + c2.modelo);
        System.out.println("   R$   " + c2.preco);
        c2.calcularIPVA();
        /** */

        //ou

        System.out.println("Carro = " + c.marca + " / " + c.modelo);
        System.out.println("   R$   " + c.preco);
        double imp1 = c.calcularIPVA();
        System.out.println("IPVA   " + imp1);

        
        System.out.println("Carro = " + c.marca + " / " + c.modelo);
        System.out.println("   R$   " + c.preco);
        double imp2 = c2.calcularIPVA();
        System.out.println("IPVA   " + imp2);

    }
}