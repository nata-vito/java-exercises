/* 
    Faça um programa que receba um único valor representando segundos. 
    Converter os segundos para horas, minutos e segundos.Utilizar os 
    conceitos de OO para desenvolver uma solução.

    Classe??
    Atributos??
    Métodos??
    
    Exemplo:
    Entrada em segundos: 290
    Saída: 0h4m50s
*/

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       TimeTo seconds = new TimeTo();
       Scanner in = new Scanner(System.in);

       System.out.printf("Time in seconds: ");
       seconds.setInput(in.nextInt());
       in.close();

       seconds.toTimers();

       seconds.printData();
    }
}
