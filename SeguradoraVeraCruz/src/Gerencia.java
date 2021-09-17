public class Gerencia {
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public Gerencia(){

    }

    public Gerencia(String nomeSegurado, int idade, double valorPremio) {
        setNomeSegurado(nomeSegurado);
        setIdade(idade);
        setValorPremio(valorPremio);
    }

    public String printData() {

        String data;
        data = "\nNome Segurado: " + getNomeSegurado() + "\n";

        return data;
    }
}
