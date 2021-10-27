public class Conta{
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }   

    public String Print() {

        String inf = "";
        inf += "Numero: " + this.numero + 
               "\nSaldo: " + this.saldo + 
               "\n\nTitular:\n" + this.titular.Print() + "\n";

        return inf;
    }


    public void Depositar(double quantia) {
        this.setSaldo(quantia + this.getSaldo());
    }

    public boolean Sacar(double quantia) {

        if(quantia <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - quantia);
            return true;
        }

        return false;
    }
}
