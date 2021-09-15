import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        Calculate points = new Calculate();
        double x1, x2, y1, y2;

        System.out.print("X1 value: ");
        x1 = in.nextDouble();
        points.setX1(x1);

        System.out.print("Y1 value: ");
        y1 = in.nextDouble();
        points.setY1(y1);

        System.out.print("X2 value: ");
        x2 = in.nextDouble();
        points.setX2(x2);

        System.out.print("Y2 value: ");
        y2 = in.nextDouble();
        points.setY2(y2);

        in.close();

        points.printValues();
        points.printDistance();
        
    }
}
