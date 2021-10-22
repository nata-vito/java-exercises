public class Professor {
    private String nome, titulacao;
    private double chLecionada;

    
    public Professor(String nome, String titulacao, double chLecionada) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.chLecionada = chLecionada;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public double getChLecionada() {
        return chLecionada;
    }
    public void setChLecionada(double chLecionada) {
        this.chLecionada = chLecionada;
    }

}
