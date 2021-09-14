package ex1;

import java.util.*;

public class ex1 {
    public static void name(String args[]) {

        double n1, n2, sum, prod, quo;
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Valor 1: ");
        n1 = entrada.nextDouble();

        System.out.print("Valor 2: ");
        n2 = entrada.nextDouble();

        sum = n1+n2;
        prod = n1*n2;
        quo = n1/n2;

        System.out.println("Soma = " + sum + "\nProduto = " + prod + "\nQuociente = " + quo);

        entrada.close();
    
    }
}
