public class Animal {
    private String nome, raca, cor;
    private int anoNascimento;

    public Animal(){
        this.setNome(null);
        this.setRaca(null);
        this.setCor(null);
        this.setAnoNascimento(-1);
    }

    public Animal(String nome, String raca, String cor, int anoNascimento){
        this.setAnoNascimento(anoNascimento);
        this.setCor(cor);
        this.setNome(nome);
        this.setRaca(raca);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String imprimirDados(){
        String info;

        info =  "\n\n-- Informacoes do Animal --\nNome: " + this.getNome() +
                "\nRaca: " + this.getRaca() + 
                "\nCor: "  + this.getCor()  + 
                "\nAno de Nascimento: " + this.getAnoNascimento();

        return info;
    }
}
