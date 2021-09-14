public class Aluno {
    private String nome, endereco, sexo, curso;
    private int idade, rg;

    public Aluno(){

    }

    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getRg() {
        return rg;
    }
    
    public void setRg(int rg) {
        this.rg = rg;
    }

    public void print() {
        System.out.println("\n\nNome: " + this.getNome()
                           + "\nSexo: " + this.getSexo()
                           + "\nIdade: " + this.getIdade()
                           + "\nEndereço: " + this.getEndereco()
                           + "\nCurso: " + this.getCurso()
                           + "\nRG: " + this.getRg()); 
    }
   
}
