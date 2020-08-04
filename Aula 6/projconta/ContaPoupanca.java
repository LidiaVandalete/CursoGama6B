package projconta;


public class ContaPoupanca extends Conta {
    private double taxa;
    
        public ContaPoupanca(int numero) {
            super(numero);
        }

        public void setTaxa(double taxa) {
            if(taxa > 0){
                this.taxa = taxa;
            }
        }
        public double getTaxa(){
            return taxa;
        }
    
        @Override
    
        public boolean saque(double valor){
    
            if(valor + taxa <= getSaldo()){

                super.saque(valor + taxa);
                return true;
        }    
        return false;    
        }
    }