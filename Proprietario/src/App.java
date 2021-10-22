/* 
        Criar a classe AppProprietario para:
            1 – Cadastrar Proprietário e Animal             ok
            2 – Listar Todos os proprietários               ok
            3 – Dada uma raça, listar o nome de 
                todos os proprietários que tenham           
                animal dessa raça
            4 - Sair
*/


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        Scanner in = new Scanner(System.in);
        Gerenciar gerenciar = new Gerenciar();
        
        int op = 0;

        do{
            System.out.println("1 - Cadastrar proprietário e animal\n" +
                               "2 - Listar todos os proprietários\n" + 
                               "3 - Pesquisar por raça\n" +
                               "4 - Sair");
            
            System.out.print("Opção: ");
            op = in.nextInt();
            
            if(op == 1){
                ProprietarioIn(gerenciar);
            }
            else if(op == 2){
                if(gerenciar.getListaProprietarios().size() > 0){
                    System.out.println(gerenciar.PrintAll());
                    System.out.println("\n");
                }
                else{
                    System.out.println("\n-----------------------------\n--- Não existe cadastros! ---\n-----------------------------\n");
                }
            }
            else if(op == 3){
                Search(gerenciar);
            }

        }while(op != 4);
        
        in.close();

        /* gerenciar.Insert(objProprietario1);*/

        //JOptionPane.showMessageDialog(null, gerenciar.PrintAll(), "info", JOptionPane.INFORMATION_MESSAGE);
       /*  String donos = gerenciar.Seach("salchicha");
        JOptionPane.showMessageDialog(null, donos, "info", JOptionPane.INFORMATION_MESSAGE);  */
    }

    public static void Search(Gerenciar gerenciar) {
        String raca, donos;
        Scanner in = new Scanner(System.in);

        System.out.print("--------------------------------\nPesquisar donos por raça: ");
        raca = in.nextLine();
        donos = gerenciar.Seach(raca);
        System.out.print(donos + "\n--------------------------------\n");
    }

    public static void ProprietarioIn(Gerenciar gerenciar) {
        Animal objAnimal;
        Proprietario objProprietario;
        Scanner in = new Scanner(System.in);
        String name, telefone, nameAnimal, color, raca;
        int anoNascimento;

        System.out.print("\n\n-- Cadastro --\nNome: ");
        name = in.nextLine();
        System.out.print("Telefone: ");
        telefone = in.nextLine();
        System.out.print("Nome do Animal: ");
        nameAnimal = in.nextLine();
        System.out.print("Raça do Animal: ");
        raca = in.nextLine();
        System.out.print("Cor do Animal: ");
        color = in.nextLine();
        System.out.print("Ano de nascimento do Animal: ");
        anoNascimento = in.nextInt();
        System.out.println();

        objAnimal = new Animal(nameAnimal, raca, color, anoNascimento);
        objProprietario = new Proprietario(name, telefone, objAnimal);
        gerenciar.Insert(objProprietario);
    }
}
