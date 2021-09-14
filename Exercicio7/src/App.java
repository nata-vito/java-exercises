/* 
    Implemente um programa que leia o código do item pedido, a quantidade e calcule o valor
    a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String produto = "null", priceDecimal;
        int code, qtd;
        Double price = 0.00;
        Scanner in = new Scanner(System.in);

            
        System.out.print("Código do produto: ");
        code = in.nextInt();
        System.out.print("Quantidade: ");
        qtd = in.nextInt();

        if(code == 100){
            price = qtd*18.00;
            produto = "Cachorro quente";
        }
        else if(code == 101){
            price = qtd*21.50;
            produto = "Bauru Simples";
        }
        else if(code == 102){
            price = qtd*22.00;
            produto = "Bauru com ovo";
        }
        else if(code == 103){
            price = qtd*19.00;
            produto = "Hambúrger";
        }
        else if(code == 104){
            price = qtd*21.00;
            produto = "Cheeseburguer";
        }

        priceDecimal  = String.format("%.2f", price);



        //Resume
        System.out.print("Produto: " + produto + "\nValor total a pagar: R$ " 
        + priceDecimal + "\n\n");
        
        in.close();
    }
}
