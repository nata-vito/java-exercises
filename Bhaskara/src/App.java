import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bhaskara findXs = new Bhaskara();
        double a, b, c;

        System.out.print("A: ");
        a = in.nextDouble();

        System.out.print("B: ");
        b = in.nextDouble();

        System.out.print("C: ");
        c = in.nextDouble();

        findXs.setABC(a, b, c);
        findXs.bhaskara();

        in.close();
    }
}
