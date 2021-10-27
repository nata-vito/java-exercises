public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, Cliente titular){
        super(numero, titular);
        this.limite = 500.00;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String Print() {

        String inf = "";

        inf += super.Print();
        inf += "Limite: " + this.getLimite() + 
               "\nSaldo com Limite: " + this.getSaldo() + " + " + this.getLimite() +
               "\n\nTitular: \n" + this.getTitular().Print();

        return inf;
    }
}

