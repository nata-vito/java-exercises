public class Funcionario{
    private String nome, registro;
    private Endereco adress;            // Associação

    public Funcionario(String nome, String registro, Endereco adress) {
        this.nome = nome;
        this.registro = registro;
        this.adress = adress;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Endereco getAdress() {
        return adress;
    }

    public void setAdress(Endereco adress) {
        this.adress = adress;
    }    
}