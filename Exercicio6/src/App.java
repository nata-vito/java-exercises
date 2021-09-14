/* 
    Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem
    que diga se ela poderá ou não votar este ano (não é necessário considerar o mês emque ela nasceu).
 */

import java.time.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int year = Year.now().getValue();
        int born_in, is_valid;
        Scanner in = new Scanner(System.in);

        System.out.print("Em que ano você nasceu?\nR: ");
        born_in = in.nextInt();

        is_valid = year-born_in;

        if(is_valid >= 18){
            System.out.println("Você tem " + is_valid + " anos.");
            System.out.println("Você pode votar!");
        }
        else{
            System.out.println("Você tem " + is_valid + " anos.");
            System.out.println("Você não pode votar!");
        }
        in.close();
    }
}
