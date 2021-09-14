public class Principal {
    public static void main(String [] args) {
        Pessoa person = new Pessoa();
        Pessoa person2 = new Pessoa();

        person.nome = "Natanael Vitorino";
        person.idade = 20;
        person.cpf = 1234567895;
        person.endereco = "Maria José, 21";

        person2.nome = " Vitorino";
        person2.idade = 10;
        person2.cpf = 123579895;
        person2.endereco = "oi";

        person.Imprimir();
        person2.Imprimir();

        /* System.out.println("Nome: " + person.nome + "\nCPF: " + person.cpf + "\nIdade: "
        + person.idade + "\nEndereço: " + person.endereco);

        System.out.println("\n\nNome: " + person2.nome + "\nCPF: " + person2.cpf + "\nIdade: "
        + person2.idade + "\nEndereço: " + person2.endereco); */
    }
}
