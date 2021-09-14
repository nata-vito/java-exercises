public class Pessoa {
    
    public String nome;
    public int idade;
    public String endereco;
    public int cpf;

    public void Imprimir() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
    }

    public int name(int n1, int n2) {
        int sum;
        sum = n1 + n2;
        return sum;
    }
}
