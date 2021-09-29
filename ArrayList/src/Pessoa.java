public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(){
        setNome("");
        setIdade(0);
    }

    public Pessoa(String nome,int idade){
        setNome(nome);
        setIdade(idade);
    }

    
}
