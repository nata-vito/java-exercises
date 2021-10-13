public class App {
    public static void main(String[] args) throws Exception {
        Contato objContato = new Contato();

        objContato.setNome("José");
        objContato.setEndereco("R. Marial, 19, Votorantim");
        objContato.setTelefone("(15) 9.99762-4048");
        objContato.setEmail("jose123@gmail");

        objContato.imprime();

        Contato objContato2 = new Contato("Antonio", "Antonhse, 12, SJC", "(19) 9.8475-3635", "antonio@yahoo.com");

        objContato2.imprime();

        Gerencia gestaoContato = new Gerencia();

        gestaoContato.Adicionar(objContato);
        gestaoContato.Adicionar(objContato2);

    }
}
