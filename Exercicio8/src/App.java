/* 
    Crie um programa que receba um valor positivo inteiro 
    e imprime os divisores desse valor
*/

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = in.nextInt();

        in.close();

        if(num < 0)
            System.out.println("O valor é negativo");

        for(int i = 1; i < num; i++){
            if((num % i) == 0){                                             // Encontra o módulo 
                System.out.println(i + " é divisivel por " + num);
            }
        }
    }
}
