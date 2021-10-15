import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList <Contato> agenda = new ArrayList();
        int opcao = 0;	
        Scanner entrada = new Scanner(System.in); 
        Scanner entradaS = new Scanner(System.in);
        
	   
	    do {
	    	
	      System.out.println("---------- Menu --------");
	      System.out.println("<1> Cadastrar contato");
	      System.out.println("<2> Listar todos contatos");
          System.out.println("<3> Buscar nome");
	      System.out.println("<4> Sair");
	      System.out.println("Digite uma opcao: ");
	      opcao = entrada.nextInt(); 
	      System.out.println("------------------------");
	      
	      switch(opcao) {
	      case 1: Contato c = new Contato(); 
	    	  	  System.out.println("Digite nome:"); 
	      	      c.setNome(entradaS.nextLine());
	      	      System.out.println("Digite e-mail:"); 
	      	      c.setEmail(entradaS.nextLine());
	      	      System.out.println("Digite telefone:"); 
	      	      c.setTelefone(entradaS.nextLine());
	      	      System.out.println("Digite Endereco:"); 
	      	      c.setEndereco(entradaS.nextLine());
	  
	      	      agenda.add(c); // inserir ArrayList
	    	     break; 
	      case 2: System.out.println("-- Listangem --- ");
	      		  for(Contato objContato : agenda) {
	      			  objContato.imprimir();
	      		  }
	      		 break;
          case 3: System.out.println("-- Busca por Nome --- ");
                  String nome;
                  System.out.print("Nome: ");
                  nome = entradaS.nextLine();
                  int i;
                  i = 0;
                  for(Contato objContato : agenda){
                      if(nome.equalsIgnoreCase(agenda.get(i).getNome())){
                        objContato.imprimir();
                      }
                      else{
                        System.out.println("Não existe este contato!");
                      }
                      i++;
                  }
                  break;
	      }
	    }while(opcao != 4); 

	}

}
