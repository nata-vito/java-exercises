/**
 * 4)Faça um programa que receba o sexo, peso e altura de 10 pessoas e calcule e mostre:
    a) A quantidade de homens;                                                                                          ok
    b) A quantidade de pessoas com peso superior a 90 kilos e altura inferior a 1,5 metros;                             ok    
    c) A média das alturas das mulheres                                                                                 ok                                                
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        double peso, altura, media_m_altura = 0, sum = 0;
        int qtd_h = 0, qtd_m = 0, qtd_palt = 0, cont = 0, sexo;
        Scanner entrada = new Scanner(System.in);

        while(cont++ < 10){
            System.out.print("1 - Homem | 2 - Mulher = ");
            sexo = entrada.nextInt();
            
            System.out.print("Seu peso: ");
            peso = entrada.nextDouble();  
            
            System.out.print("Sua altura: ");
            altura = entrada.nextDouble();
            System.out.println();

            if(sexo == 1){
                ++qtd_h;
            }
            if((peso > 90.00) && (altura < 1.5)){
                ++qtd_palt;
            }
            if(sexo == 2){
                ++qtd_m;
                sum += altura;
            }

            media_m_altura = sum/qtd_m;
        }

        entrada.close();

        System.out.print("Quantidade de Homens = " + qtd_h + "\nQuantidade de pessoas com o peso superior a 90Kg e altura inferior a 1,5 = " 
        + qtd_palt + "\nMedia de alturas das mulheres = " + media_m_altura);
    }
}
