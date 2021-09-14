import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        Scanner entrada = new Scanner(System.in);

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if(n1 > n2)
            System.out.println("O primeiro valor é maior que o segundo!");
        else 
            System.out.println("O segundo valor é maior que o segundo!");

        entrada.close();
    }
}
