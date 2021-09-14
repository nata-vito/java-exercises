import java.lang.Math;

public class Bhaskara {
    private double a, b, c, delta, x1, x2;

    public void setABC(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public void bhaskara(){
        double delta, sqrt1, sqrt2;
        boolean op = true;

        if((a == 0.0) || (b == 0) || (c == 0)){
            System.out.println("Não é de segundo grau!");
            op = false;
        }
        
        delta = (b*b)-(4*a*c);
        sqrt1 = -(b+Math.sqrt(delta))/(2*a);
        sqrt2 = -(b-Math.sqrt(delta))/(2*a);

        setValues(delta, sqrt1, sqrt2);

        if((delta > 0.0) && (op == true)){
            System.out.println("Valor de delta é: " + delta
            + " Valor de x1: " + x1 
            + " Valor de x2: " + x2);
        }
        else if((delta < 0.0) && (op == true)){
            System.out.println("Não há raiz real!");
        }
        else if((delta == 0.0) && (op == true)){
            System.out.println("Há uma raiz real -1");
        }
    }

    public void setValues(double delta, double x1, double x2) {
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
    }
    
    
}
