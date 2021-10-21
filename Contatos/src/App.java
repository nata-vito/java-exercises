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
		  System.out.println("<4> Modificar o contato");
	      System.out.println("<6> Sair");
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
                  int encontrado = -1;
                  for(int i=0; i < agenda.size(); i++){
                     if(agenda.get(i).getNome().equalsIgnoreCase(nome)){
						encontrado = i;
					 }
					}
				if(encontrado >= 0)
					agenda.get(encontrado).imprimir();
				 else
					 System.out.println("Erro: pessoa não encontrada");
                  break;
			case 4:
					String name, newName, newTel, newEmail, newAdress;
					int find = -1;
					System.out.println("-- Modificar o contato --");
					System.out.print("Nome: ");

					name = entradaS.nextLine();

					//encontra a pessoa
					for(int i=0; i < agenda.size(); i++){
						if(agenda.get(i).getNome().equalsIgnoreCase(name)){
							find = i;
						}
					}

					//Modificação 	
					if(find == -1){
						System.out.println("Erro: pessoa não encontrada");
					}
					else{
						System.out.print("Novo nome: ");
						newName = entradaS.nextLine();

						System.out.print("Novo telefone: ");
						newTel = entradaS.nextLine();

						System.out.print("Novo email: ");
						newEmail = entradaS.nextLine();

						System.out.print("Novo endereco: ");
						newAdress = entradaS.nextLine();

						
						agenda.get(find).setNome(newName);
						agenda.get(find).setTelefone(newTel);
						agenda.get(find).setEmail(newEmail);
						agenda.get(find).setEndereco(newAdress);
					}
					break;

				case 5:	
						String nombre;
						int trues = -1;
						System.out.println("-- Excluir contato --");
						System.out.print("Nome: ");

						nombre = entradaS.nextLine();

						//encontra a pessoa
						for(int i=0; i < agenda.size(); i++){
							if(agenda.get(i).getNome().equalsIgnoreCase(nombre)){
								trues = i;
							}
						}

						//Modificação 	
						if(trues == -1){
							System.out.println("Erro: pessoa não encontrada! Não é possível remover");
						}
						else{
							agenda.remove(trues);
						}

	      }
	    }while(opcao != 6); 

	}



}
