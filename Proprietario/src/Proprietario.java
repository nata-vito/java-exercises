
public class Proprietario {
    private String nome;
    private String telefone;
    private Animal animal;                      // um para um 

    public Proprietario(){
        this.setNome(null);
        this.setTelefone(null);
    }

    public Proprietario(String nome, String telefone, Animal animal){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setAnimal(animal);
        //this.animal = new Animal();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String imprimir(){
        String info;

        info =  "\nNome: " + this.getNome() +
                "\nTelefone: " + this.getTelefone() +
                this.animal.imprimirDados();

        return info;
    }
}
