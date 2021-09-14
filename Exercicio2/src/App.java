import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        double n1, n2, n3, sum;
        Scanner entrada = new Scanner(System.in);

        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();

        sum = n2+n3;

        if(n1 > sum)
            System.out.print("Soma = " + sum + "\nO primeiro valor é maior que a soma!");
        else 
            System.out.print("Soma = " + sum + "\nO primeiro valor não maior que a soma!");


        entrada.close();

    }
}
