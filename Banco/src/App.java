public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("123546789", "Maria", "Votorantim-SP", "15997624048");

        Conta conta1 = new Conta(1, c1);
        ContaEspecial conta2 = new ContaEspecial(540, c1);

        System.out.println(c1.Print());
        System.out.println("\n==================");
        System.out.println(conta1.Print());
        System.out.println("\n==================");
        System.out.println(conta2.Print());
    }
}
