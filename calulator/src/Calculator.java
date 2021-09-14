import java.text.DecimalFormat;

public class Calculator {
    private double n1, n2, result;
    private String op;

    public void setParamters(double num1, double num2, String operation) {
        this.n1 = num1;
        this.n2 = num2;
        this.op = operation;

        checkOperator();
    }

    public double getN1(){
        return n1;
    }

    public double getN2(){
        return n2;
    }

    public String getOp(){
        return op;
    }
    
    public double getResult(){
        return result;
    }

    public void checkOperator() {
        String soma = "+", subt = "-", div = "/", mult = "*";
        double value = 2;

        if(op.equals(soma)){
            value = soma(n1,n2);
        }
        else if(op.equals(subt)){
            value = sub(n1, n2);
        }
        else if(op.equals(div)){
            value = div(n1,n2);
        }
        else if(op.equals(mult)){
            value = multi(n1, n2);
        }

        this.result = value;
    }

    public double soma(double n1, double n2){
        double sum;
        sum = n1+n2;
        return sum;
    }

    public double sub(double n1, double n2){
        double subtraction;
        subtraction = n1-n2;
        return subtraction;
    }

    public double div(double n1, double n2){
        double division;
        division = n1/n2;
        return division;
    }

    public double multi(double n1, double n2){
        double multiplication;
        multiplication = n1*n2;
        return multiplication;
    }

    public void print() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Resultado: " + df.format(result));
    }
}
