import java.util.*;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        String op;
        Scanner in = new Scanner(System.in);
        Calculator value = new Calculator();

        while(true){
            System.out.print("\n\nInsira o primeiro número: ");
            n1 = in.nextDouble();

            System.out.print("Insira a operação número: ");
            op = in.next();

            System.out.print("Insira o segundo número: ");
            n2 = in.nextDouble();

            value.setParamters(n1, n2, op);

            value.print();

            System.out.println("\n\nDeseja realizar outro calculo? <s/n>");
            op = in.next();

            if(op.toLowerCase().equals("n")){
                break;
            }

        }
        
    }
}