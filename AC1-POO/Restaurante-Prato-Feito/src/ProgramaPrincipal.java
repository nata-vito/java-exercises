/* 

    Exercício 2
    Nome:   Natanael Filipe Garcia Vitorino
    Ra:     200032

 */

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // Criando as duas mesas
        Mesa mesa[] = new Mesa[2];      // mesa[0] -> id = 0;                                               
        int i = 0, a, id, qtdPessoas;

        System.out.println("\n\nSeja bem vindo ao prato feito!\nDigite o seu pedido");
      
        // Cadastrando as mesas
        while(i<2){
            mesa[i] = new Mesa();

            System.out.print("\nMesa: ");
            id = in.nextInt();
            mesa[i].setNumero(id);

            System.out.print("Quantidade de pessoas: ");
            qtdPessoas = in.nextInt();
            mesa[i].setQtdPessoas(qtdPessoas);
            i++;
            System.out.print("\n----------------------------");
        }
        
        System.out.print("\n----------" + " Resumo " + "----------");
        System.out.println("\n----------------------------");

        // Imprimindo todas as mesas
        for(a = 0; a < 2; a++){                                                     
            System.out.println(mesa[a].printMesa());
            in.nextLine();
        }

        i = 0;
        a = 0;

        // Efetuando dois pedidos por cada mesa
        while(i<4){                                                                 
            if(i < 2){
                System.out.println("\n--------------" + " Mesa 01 " + "--------------");
                System.out.print("\nPedido " + (i+1));

                // Calculo do valor total do pedido
                mesa[0].pedidoProdutos();                  
            }
            else{
                System.out.println("\n--------------" + " Mesa 02 " + "--------------");
                System.out.print("\nPedido " + (a+1) + ": ");

                // Calculo do valor total do pedido
                mesa[1].pedidoProdutos();                     
                a++;
            }
            i++;
        }

        i = 0;

        // Calculando e imprimindo o valor final da conta e por pessoa
        while(i<2){                                                                  
            System.out.println("\n--------------" + " Mesa " + (i+1) 
                                + "--------------");
            mesa[i].pagamento();
            i++;
        }

        in.nextLine();

        // Encontrando o maior valor por pessoa e imprimindo a mesa que possui com este valor
        if(mesa[0].getvalorPessoa() > mesa[1].getvalorPessoa()){    
            System.out.println("\n----------------------------"); 
            System.out.println("Mesa com o Maior Valor por Pessoa");               
            System.out.println(mesa[0].printMesa());    
        }
        else if(mesa[0].getvalorPessoa() < mesa[1].getvalorPessoa()){
            System.out.println("\n----------------------------"); 
            System.out.println("Mesa com o Maior Valor por Pessoa"); 
            System.out.println(mesa[1].printMesa());
        }
        else{
            System.out.println("\n----------------------------"); 
            System.out.println("O valor por pessoa é igual!");
        }
    }
}
