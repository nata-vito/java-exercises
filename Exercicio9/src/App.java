/* 
    Faça um programa que leia um valor inteiro e calcule o seu fatorial
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int num, value = 1;

        System.out.print("Valor: ");
        num = in.nextInt();
        in.close();

        for(int i = 1; i <= num; i++){
            value = value * i;                      // Calculo da fatorial
        }

        System.out.println("Resultado: " + value);
    }
}
