/* 

    Exercício 1
    Nome:   Natanael Filipe Garcia Vitorino
    Ra:     200032

*/

import java.util.*;

public class AppApolice {
    public static void main(String[] args) throws Exception {
        Apolice apolice1 = new Apolice();
        Apolice apolice2 = new Apolice("João Vitor McCarthy", 19, 100);
        Scanner in = new Scanner(System.in);
        String cidade, nomeSegurado;
        int idade;
        double valorPremio;

        // Apólice 1
        // Entrada de dados
        System.out.print("\n\nInserir os Dados da Apólice 1: \n");
        System.out.print("Nome: ");
        nomeSegurado = in.nextLine();
        apolice1.setNomeSegurado(nomeSegurado);

        System.out.print("Idade: ");
        idade = in.nextInt();
        apolice1.setIdade(idade);
        
        System.out.print("Valor do Prêmio: ");
        valorPremio = in.nextDouble();
        apolice1.setValorPremio(valorPremio);

        // Visualização dos dados antes dos cálculos
        System.out.print("\n\nDados da Apólice 1: ");
        System.out.println(apolice1.printData());
        in.nextLine();

        // Cálculo do prêmio e visualização dos dados
        System.out.print("Cálculo do Prêmio: ");
        apolice1.premioApolice();
        System.out.println(apolice1.printData());
        in.nextLine();

        // Cálculo do desconto e visualização dos dados
        System.out.print("Cálculo do Desconto\nCidade: ");
        cidade = in.nextLine();
        apolice1.descontoApolice(cidade);
        System.out.println(apolice1.printData());
        in.nextLine();


        // Apólice 2
        // Visualização dos dados antes dos cálculos
        System.out.print("\n\nDados da Apólice 2: ");
        System.out.println(apolice2.printData());
        in.nextLine();

        // Cálculo do prêmio e visualização dos dados
        System.out.print("Cálculo do Prêmio: ");
        apolice2.premioApolice();
        System.out.println(apolice2.printData());
        in.nextLine();
        
        // Cálculo do desconto e visualização dos dados
        System.out.print("Cálculo do Desconto");
        apolice2.descontoApolice("Curitiba");
        System.out.println(apolice2.printData());

        in.close();
    }
}