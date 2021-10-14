public class App {
    public static void main(String[] args) throws Exception {
        Contato objContato = new Contato();

        objContato.setNome("José");
        objContato.setEndereco("R. Marial, 19, Votorantim");
        objContato.setTelefone("(15) 9.99762-4048");
        objContato.setEmail("jose123@gmail.com");

        Contato objContato2 = new Contato("Antonio", "Antonhse, 12, SJC", "(19) 9.8475-3635", "antonio@yahoo.com");
 
        Gerencia gestaoContato = new Gerencia();

        gestaoContato.Adicionar(objContato);
        gestaoContato.Adicionar(objContato2);

        gestaoContato.visualizar();

        gestaoContato.editarContato(objContato2, "João", "Tom 154", "3245-8547", "joao14@outlook.com");
        gestaoContato.visualizar();
    }
}
