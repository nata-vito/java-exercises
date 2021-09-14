import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

    //  String nome;12
        int idade;
        double altura;
        boolean op;
        
        Scanner entrada = new Scanner(System.in);                       // Objeto de leitura de entrada

        System.out.print("Sua idade: ");
        idade = entrada.nextInt();                                      // Leitura de idade

        System.out.print("Digite sua altura: ");                        // Leitura da altura
        altura = entrada.nextDouble();

        System.out.print("Estado da torneira <True/False>: ");          // Leitura do estado booleano
        op = entrada.nextBoolean();

        System.out.println("A idade é: " + idade + 
        "\nAltura: " + altura + "\nTorneira: " + op);

        entrada.close();




        /* System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("O nome digitado foi: " + nome); */
    }
}   
