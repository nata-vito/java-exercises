public class App {
    public static void main(String[] args) throws Exception {
        Endereco adress = new Endereco("Maria José Garcia", "Altos de Votorantim", "Votorantim", "casa", 109);
        Funcionario funcionario = new Funcionario("Natanael", "200032", adress);

        System.out.println("Dados: ");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRegistro());
        System.out.println(funcionario.getAdress().getRua());
        System.out.println(funcionario.getAdress().getNumero());
    }
}
