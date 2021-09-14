/**
 * (05)A prefeitura da cidade fez uma pesquisa entre seus habitantes coletando dados sobre o salário e número de filhos. 
 
    A prefeitura deseja saber:
            a) O maior salário              ok                                                                        
            b) A média de filhos            ok                                                                       
            c) A média dos salários                                                                                 
        
    Faça um programa em Java que leia estes dados e execute os cálculos. 
    O final da leitura de dados ocorre quando for digitado um salário negativo
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        double salario, salarios = 0, maior_salario = 0, med_filhos, med_salario;
        int qtd_salario = 0, qtd_filhos, qtd_total = 0;
        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.print("Salário: ");
            salario = entrada.nextDouble();
            ++qtd_salario;
            salarios += salario;

            System.out.print("Quantidade de Filhos: ");
            qtd_filhos = entrada.nextInt();
            qtd_total += qtd_filhos;

            if(salario >= maior_salario)
                maior_salario = salario;

            if(salario < 0.00){
                break;
            }
        }

        med_filhos = (double) qtd_total/(double) qtd_salario;
        med_salario = salarios/(double) qtd_salario;

        String m_s  = String.format("%.2f", maior_salario);                                                // Formatação dos valores para apenas duas casas após o ponto
        String md_f = String.format("%.2f", med_filhos);
        String md_s = String.format("%.2f", med_salario);

        entrada.close();
        System.out.print("Maior salário: " + m_s + "\nMedia de Filhos: " + md_f + "\nMedia dos Salarios: " + md_s);
    }
}
