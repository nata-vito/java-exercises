public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        Int opcao = 0;
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


        do{
            System.out.println("------- Meu -------");
            System.out.println("<1> Cadastrar contato");
            System.out.println("<2> Listar todos contatos");
            System.out.println("<4> Listar todos contatos"); 
            System.out.println("Digite uma opcao: "); 
            opcao = entrada.nextInt();
            System.out.println("-----------------------------");

            switch(opcao){
                case 1: Contato c = new Contato();
                        System.out.println("Nome: ");
                        c.setNome(entradaS.nextLine());
                        System.out.println("E-mail: ");
                        c.setEmail(entradaS.nextLine());
                        System.out.println("Telefone: ");
                        c.setTelefone(entradaS.nextLine());
                        System.out.println("Endereço: ");
                        c.setEndereco(entradaS.nextLine());

                        gestaoContato.Adicionar(c);
                        break;
                case 2: System.out.println("--- Lista de Contatos ---");
                        gestaoContato.visualizar();
                        break;
            }
        }while(opcao != 4);
    }
}
