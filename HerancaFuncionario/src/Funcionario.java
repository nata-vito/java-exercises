import java.text.DecimalFormat;

public class Funcionario {
    private String name;
    private double salary;

    public Funcionario(){

    }

    public Funcionario(String name, double salary){
        this.setName(name);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void moreSalary(double percent) {
        double salary;
        salary = this.getSalary() + (this.getSalary()*(percent/100));

        this.setSalary(salary);
    }

    public String formatCoin() {
        DecimalFormat f = new DecimalFormat("#.00");
        String data;

        data = "R$ " + f.format(this.getSalary());
        return data;
    }

    public String Print() {
        return "Name: " + this.name + 
                "\nSalary: " + formatCoin();
    }
}
