import java.lang.Math;

public class Calculate {
    private double x1, x2, y1, y2;

    public Calculate(){

    }

    public Calculate(double x1, double x2, double y1, double y2){
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
    }
    
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double distance(){

        double D, x, y;
        x = Math.pow(getX1() - getX2(), 2);
        y = Math.pow(getY1() - getY2(), 2);
        D = Math.sqrt(x-y);

        return D;
    }

    public void printDistance(){
        System.out.println("Distance: " + distance());
    }

    public void printValues(){
        System.out.println("\nX1: " + getX1()
                           + "  Y1: " + getY1()
                           + "\nX2: " + getX2()
                           + "  Y2: " + getY2());  
    }

}
