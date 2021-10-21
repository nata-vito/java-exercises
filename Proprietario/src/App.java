import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Animal objAnimal = new Animal(" ", " ", " ", 0);
        Proprietario objProprietario = new Proprietario(" ", " ", objAnimal);        // Relacionamento de proprietario animal
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
                ProprietarioIn();
            }

        }while(op != 4);
        
        in.close();

        /* gerenciar.Insert(objProprietario1);

        JOptionPane.showMessageDialog(null, gerenciar.PrintAll(), "info", JOptionPane.INFORMATION_MESSAGE);
        String donos = gerenciar.Seach("salchicha");
        JOptionPane.showMessageDialog(null, donos, "info", JOptionPane.INFORMATION_MESSAGE); */
    }

    public static void ProprietarioIn( ) {
        Scanner in = new Scanner(System.in);
        Animal objAnimal;
        Proprietario objProprietario;        // Relacionamento de proprietario animal
        Gerenciar gerenciar = new Gerenciar();
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

        objAnimal = new Animal(nameAnimal, raca, color, anoNascimento);
        objProprietario = new Proprietario(name, telefone, objAnimal);

    }
}
